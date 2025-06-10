package com.service;

import com.dto.AuthResponseDTO;
import com.dto.RegisterRequestDTO;
import com.dto.User;
import com.repository.UserRepository;
import com.util.jwt.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {


    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    @Autowired
    public AuthService(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    /**
     * 用户登录
     *
     * @param email    用户邮箱
     * @param password 用户密码
     * @return 登录成功后返回的 Token 和用户信息
     */
     public AuthResponseDTO login(String email, String password){
        User user = userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("Invalid email or password"));
        if (!password.equals(user.getPassword())) {
            throw new IllegalArgumentException("Invalid email or password");
        }

        String token = jwtUtil.generateToken(email);

        AuthResponseDTO authResponseDTO = new AuthResponseDTO(token, email, user.getFirst_name(), user.getLast_name(), user.getCountry(), user.getPhone());

        return authResponseDTO;

     };

    /**
     * 用户注册
     *
     * @param registerRequestDto 用户注册信息
     * @return 注册成功后返回的 Token 和用户信息
     */
    public Boolean register(RegisterRequestDTO registerRequestDto) {
        User user = new User();
        user.setEmail(registerRequestDto.getEmail());
        user.setPassword(registerRequestDto.getPassword());
        user.setFirst_name(registerRequestDto.getFirstName());
        user.setLast_name(registerRequestDto.getLastName());
        user.setPhone(registerRequestDto.getPhone());
        user.setCountry(registerRequestDto.getCountry());
        userRepository.save(user);

        return true;


    };
}
