package com.controller;

import com.dto.AuthResponseDTO;
import com.dto.LoginRequestDTO;
import com.dto.RegisterRequestDTO;
import com.service.AuthService;

import com.util.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ResponseMessage<AuthResponseDTO>> login(
            @RequestBody LoginRequestDTO loginRequestDto
    ) {
        AuthResponseDTO authResponseDTO = authService.login(loginRequestDto.getUsername(), loginRequestDto.getPassword());

        return ResponseEntity.status(HttpStatus.OK).body(ResponseMessage.success("Login success",authResponseDTO));
    }

    /**
     * POST /api/auth/register
     * 用户注册
     */

    @PostMapping("/register")
    public ResponseEntity<ResponseMessage<String>> register(
            @RequestBody RegisterRequestDTO registerRequestDto
    ) {
        boolean result = authService.register(registerRequestDto);
        if (result) {
            ResponseMessage<String> message = ResponseMessage.success("Register success",null);
            return ResponseEntity.status(HttpStatus.OK).body(message);
        }

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ResponseMessage.error(400, "Register failed"));
    }
}
