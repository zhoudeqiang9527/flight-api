package com.dto;

import java.util.Date;

public class FlightDTO {
    private Long id;
    private String flightNumber;
    private String departure;
    private String destination;
    private Date date;
    private String time;
    private Double price;

    // Constructor
    public FlightDTO() {}

    public FlightDTO(Long id, String flightNumber, String departure, String destination, Date date, String time, Double price) {
        this.id = id;
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
