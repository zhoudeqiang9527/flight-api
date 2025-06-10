package com.dto;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "airport")
public class AirportDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String city;

}
