package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class FlightDetailDTO {
    private Long id;
    private String flightNumber;
    private String departure;
    private String destination;
    private Date date;
    private String time;
    private Double price;
    private List<String> availableSeats;
    private String airlineLogo;


}
