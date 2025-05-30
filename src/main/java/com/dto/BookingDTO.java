package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class BookingDTO {
    private String reference;
    private String route;
    private Date date;
    private String status;


}
