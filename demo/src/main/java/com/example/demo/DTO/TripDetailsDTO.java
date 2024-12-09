package com.example.demo.DTO;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TripDetailsDTO {
    private int tripId;
    private String departure;
    private String destination;
    private LocalDateTime tripStart;
    private LocalDateTime tripEnd;
    private String serviceName;
    private BigDecimal totalCost;
    private int rating;
    private String feedback;
    private String driverFirstName;
    private String driverFamilyName;

    // Getters and Setters
    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
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

    public LocalDateTime getTripStart() {
        return tripStart;
    }

    public void setTripStart(LocalDateTime tripStart) {
        this.tripStart = tripStart;
    }

    public LocalDateTime getTripEnd() {
        return tripEnd;
    }

    public void setTripEnd(LocalDateTime tripEnd) {
        this.tripEnd = tripEnd;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverFamilyName() {
        return driverFamilyName;
    }

    public void setDriverFamilyName(String driverFamilyName) {
        this.driverFamilyName = driverFamilyName;
    }
}

