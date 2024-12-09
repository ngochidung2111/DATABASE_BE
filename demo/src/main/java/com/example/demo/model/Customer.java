package com.example.demo.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @Column(name = "Customer_Username")
    private String customerUsername;

    @Column(name = "JoinedDate")
    @Temporal(TemporalType.DATE)
    private Date joinedDate;

    @Column(name = "AccountStatus")
    private String accountStatus;

    @Column(name = "Email")
    private String email;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    // Quan hệ với bảng UserAccount
    @ManyToOne
    @JoinColumn(name = "Customer_Username", referencedColumnName = "Username", insertable = false, updatable = false)
    private UserAccount userAccount;

    // Getters and Setters
    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
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

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
}

