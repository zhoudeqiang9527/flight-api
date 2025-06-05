package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingRequestDTO {
    private Long userId;
    private Long flightId;
    private String email;
    private String status;
    private String reference;
    private String route;
    private String totalPrice;

}
