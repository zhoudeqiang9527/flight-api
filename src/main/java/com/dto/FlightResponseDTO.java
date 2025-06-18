package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightResponseDTO {
    private Long id;
    private String flight_number;
    private String departure;
    private String arrival;
    private String departureTime;
    private String arrivalTime;
    private String duration;
    private String stops;
    private String price;
}
