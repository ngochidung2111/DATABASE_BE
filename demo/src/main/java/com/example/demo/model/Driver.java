package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Driver_ID")
    private int driverId;

    @Column(name = "Address")
    private String address;

    @Column(name = "StartDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "DriverUsername")
    private String driverUsername;

    @Column(name = "AccountStatus")
    private String accountStatus;

    @Column(name = "Star")
    private int star;

    // Quan hệ với bảng UserAccount
    @ManyToOne
    @JoinColumn(name = "DriverUsername", referencedColumnName = "Username", insertable = false, updatable = false)
    private UserAccount userAccount;

    // Getters and Setters
    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDriverUsername() {
        return driverUsername;
    }

    public void setDriverUsername(String driverUsername) {
        this.driverUsername = driverUsername;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}
