package com.example.demo.controller;

import com.example.demo.DTO.UserAccountDTO;
import com.example.demo.model.UserAccount;
import com.example.demo.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;


    @GetMapping("/")
    public List<UserAccount> getActiveUserAccounts() {
        return userAccountService.findalluser();
    }
    @PostMapping("/create")
    public UserAccount createUserAccount(@RequestBody UserAccount userAccount) {
        return userAccountService.createUserAccount(userAccount);
    }
    @PutMapping("/update/{username}")
    public UserAccount updateUserAccount(@PathVariable String username, @RequestBody UserAccount userAccount) {
        return userAccountService.updateUserAccount(username, userAccount);
    }
    @DeleteMapping("/delete/{username}")
    public void deleteUserAccount(@PathVariable String username) {
        userAccountService.deleteUserAccount(username);
    }
    @DeleteMapping("/deleteuser/{username}")
    public String deactivateUser(@PathVariable String username) {
        return userAccountService.deactivateUserAccount(username);
    }
    @GetMapping("/account/{username}")
    public UserAccountDTO getUserAccount(@PathVariable String username) {
        return userAccountService.getUserAccount(username);
    }
}
