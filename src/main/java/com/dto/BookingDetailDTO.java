package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class BookingDetailDTO {
    private String reference;
    private List<PassengerDTO> passengers;
    private Double totalPrice;
    private String route;
    private Date date;
    private String status;

}
