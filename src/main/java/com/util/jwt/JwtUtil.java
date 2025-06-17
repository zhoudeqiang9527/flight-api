package com.util.jwt;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;


import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.*;

@Component
public class JwtUtil {
    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    // 生成JWT
    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>();
        String encodedSecret = Base64.getEncoder().encodeToString(secret.getBytes(StandardCharsets.UTF_8));
        byte[] keyBytes = Base64.getDecoder().decode(encodedSecret);

        Key key = Keys.hmacShaKeyFor(keyBytes);
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(SignatureAlgorithm.HS256, key)
                .compact();

    }

    // 从JWT中提取用户名
    public String getUsernameFromToken(String token) {
        String encodedSecret = Base64.getEncoder().encodeToString(secret.getBytes(StandardCharsets.UTF_8));
        byte[] keyBytes = Base64.getDecoder().decode(encodedSecret);

        Key key = Keys.hmacShaKeyFor(keyBytes);
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public  boolean isTokenExpired(String token) {
        try {
            String encodedSecret = Base64.getEncoder().encodeToString(secret.getBytes(StandardCharsets.UTF_8));
            byte[] keyBytes = Base64.getDecoder().decode(encodedSecret);
            Jws<Claims> jws = Jwts.parserBuilder()
                    .setSigningKey(keyBytes)
                    .build()
                    .parseClaimsJws(token);

            Claims claims = jws.getBody();
            Date expiration = claims.getExpiration();

            return expiration.before(new Date()); // 判断是否已过期
        } catch (JwtException e) {
            // token 无效，比如签名不匹配、格式错误等
            System.out.println("Invalid token: " + e.getMessage());
            return true;
        }
    }
    // 验证JWT是否合法
    public boolean validateToken(String token, String username) {
        try {

            String usernameFromToken = getUsernameFromToken(token);
            return usernameFromToken.equals(username);
        } catch (Exception e) {
            return false;
        }
    }


}