package com.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Long user_Id;
    private Long flight_Id;
    private String reference;
    private String route;
    @Column(name = "booking_time",columnDefinition = "DATETIME")
    private LocalDateTime booking_time;
    private String status;
    @Column(name = "total_price",columnDefinition = "DECIMAL(10,2)")
    private BigDecimal total_price;


}
