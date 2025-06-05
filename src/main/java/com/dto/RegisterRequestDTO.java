package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequestDTO {
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String country;
}
