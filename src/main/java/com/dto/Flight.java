package com.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightNumber;
    @Column(name = "departure_airport_id")
    private Long departureAirportId;
    @Column(name = "destination_airport_id")
    private Long destinationAirportId;
    @Column(name = "departure_date",columnDefinition = "DATE")
    private String departureDate;
    @Column(name = "departure_time",columnDefinition = "TIME")
    private String departureTime;
    @Column(name = "price",columnDefinition = "DECIMAL(10,2)")
    private BigDecimal price;


}
