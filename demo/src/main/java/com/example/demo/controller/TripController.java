package com.example.demo.controller;

import com.example.demo.DTO.TripDetailsDTO;
import com.example.demo.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TripController {

    @Autowired
    private TripService tripService;

    @GetMapping("/trips/{username}")
    public List<TripDetailsDTO> getTripDetails(@PathVariable String username) {
        return tripService.getTripDetails(username);
    }
}

