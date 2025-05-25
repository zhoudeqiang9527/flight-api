package com.dto;

public class BookingRequestDTO {
    private String email;
    private String status;
    // 可以根据需要添加其他字段

    // 无参构造函数
    public BookingRequestDTO() {
    }

    // 有参构造函数（可以根据需要选择性添加）
    public BookingRequestDTO(String email, String status) {
        this.email = email;
        this.status = status;
    }

    // Getter 和 Setter 方法
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // 可以选择性添加 toString 方法以便于调试
    @Override
    public String toString() {
        return "BookingRequestDTO{" +
                "email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
