package com.dto;

import java.util.Date;

public class BookingDTO {
    private String reference;
    private String route;
    private Date date;
    private String status;

    // Constructor
    public BookingDTO() {}

    public BookingDTO(String reference, String route, Date date, String status) {
        this.reference = reference;
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
