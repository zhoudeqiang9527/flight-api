package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class FlightDTO {
    private Long id;
    private String flightNumber;
    private String departure;
    private String destination;
    private Date date;
    private String time;
    private Double price;


}
