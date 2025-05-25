package com.dto;

import java.util.Date;
import java.util.List;

public class BookingDetailDTO {
    private String reference;
    private List<PassengerDTO> passengers;
    private Double totalPrice;
    private String route;
    private Date date;
    private String status;

    // Constructor
    public BookingDetailDTO() {}

    public BookingDetailDTO(String reference, List<PassengerDTO> passengers, Double totalPrice, String route, Date date, String status) {
        this.reference = reference;
        this.passengers = passengers;
        this.totalPrice = totalPrice;
        this.route = route;
        this.date = date;
        this.status = status;
    }

    // Getters and Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<PassengerDTO> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<PassengerDTO> passengers) {
        this.passengers = passengers;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
