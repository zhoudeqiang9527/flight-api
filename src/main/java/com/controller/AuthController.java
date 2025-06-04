package com.controller;

import com.dto.AuthResponseDTO;
import com.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    /**
     * POST /api/auth/login
     * 用户登录
     */

    @PostMapping("/login")
    public AuthResponseDTO login(
            @RequestParam String email,
            @RequestParam String password
    ) {
        return authService.login(email, password);
    }

    /**
     * POST /api/auth/register
     * 用户注册
     */

    @PostMapping("/register")
    public AuthResponseDTO register(
            @RequestParam String email,
            @RequestParam String password,
            @RequestParam String firstName,
            @RequestParam String lastName,
            @RequestParam String country,
            @RequestParam(required = false) String phone
    ) {
        return authService.register(email, password, firstName, lastName, country, phone);
    }
}
