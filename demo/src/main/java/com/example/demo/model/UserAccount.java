package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.Date;


@Entity
@Table(name = "UserAccount")
public class UserAccount {

    @Id
    @Column(name = "Username")
    private String Username;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "AccountStatus")
    private String accountStatus;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "FamilyName")
    private String familyName;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "Address")
    private String address;

    // Getters and Setters
    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
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
}
