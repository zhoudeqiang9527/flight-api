package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDetailDTO {
    private String reference;
    private List<PassengerDTO> passengers;
    private Double totalPrice;
    private String route;
    private Date date;
    private String status;

}
