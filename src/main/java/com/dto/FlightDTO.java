package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
    private Long id;
    private String flightNumber;
    private String departure;
    private String destination;
    private Date date;
    private String time;
    private Double price;


}
