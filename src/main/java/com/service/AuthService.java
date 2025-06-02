package com.service;

import com.dto.AuthResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    /**
     * 用户登录
     *
     * @param email    用户邮箱
     * @param password 用户密码
     * @return 登录成功后返回的 Token 和用户信息
     */
     public AuthResponseDTO login(String email, String password){
         AuthResponseDTO authResponseDTO = new AuthResponseDTO("xxxxxx", email, "John", "Doe", "1234567890", "admin");

         return authResponseDTO;
     };

    /**
     * 用户注册
     *
     * @param email     用户邮箱
     * @param password  用户密码
     * @param firstName 用户名
     * @param lastName  用户姓
     * @param phone     电话（可选）
     * @return 注册成功后返回的 Token 和用户信息
     */
    public AuthResponseDTO register(String email, String password, String firstName, String lastName, String country,String phone) {
        AuthResponseDTO authResponseDTO = new AuthResponseDTO("xxxxxx", email, firstName, lastName, phone, "user");

        return authResponseDTO;


    };
}
