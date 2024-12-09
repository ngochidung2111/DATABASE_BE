package com.example.demo.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class UserAccountDTO {
    private String username;
    private String email;
    private String phoneNumber;
    private String accountStatus;
    private String familyName;
    private String firstName;
    private String address;
    private Date startDate;
    private int totalTrips;
    private int totalDriverTrips;
    private BigDecimal totalAmountPaid;
    private BigDecimal totalAmountReceived;

    // Constructor, getters và setters
    public UserAccountDTO(String username, String email, String phoneNumber, String accountStatus, Date startDate,
                          String familyName, String firstName, String address, int totalTrips, int totalDriverTrips,
                          BigDecimal totalAmountPaid, BigDecimal totalAmountReceived) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountStatus = accountStatus;
        this.startDate = startDate;
        this.familyName = familyName;
        this.firstName = firstName;
        this.address = address;
        this.totalTrips = totalTrips;
        this.totalDriverTrips = totalDriverTrips;
        this.totalAmountPaid = totalAmountPaid;
        this.totalAmountReceived = totalAmountReceived;
    }

    public UserAccountDTO() {

    }

    // Getters và Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTotalTrips() {
        return totalTrips;
    }

    public void setTotalTrips(int totalTrips) {
        this.totalTrips = totalTrips;
    }

    public int getTotalDriverTrips() {
        return totalDriverTrips;
    }

    public void setTotalDriverTrips(int totalDriverTrips) {
        this.totalDriverTrips = totalDriverTrips;
    }

    public BigDecimal getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(BigDecimal totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

    public BigDecimal getTotalAmountReceived() {
        return totalAmountReceived;
    }

    public void setTotalAmountReceived(BigDecimal totalAmountReceived) {
        this.totalAmountReceived = totalAmountReceived;
    }
}
