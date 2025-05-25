package com.dto;

public class AuthResponseDTO {
    private String token;
    private String email;
    private String firstName;
    private String lastName;
    private String country;
    private String phone;

    // 无参构造函数
    public AuthResponseDTO() {
    }

    // 有参构造函数（可以根据需要选择性添加）
    public AuthResponseDTO(String token, String email, String firstName, String lastName, String country, String phone) {
        this.token = token;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.phone = phone;
    }

    // Getter 和 Setter 方法
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // 可以选择性添加 toString 方法以便于调试
    @Override
    public String toString() {
        return "AuthResponseDTO{" +
                "token='" + token + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
