package com.example.demo.controller;



import com.example.demo.service.DriverEarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverEarningsController {

    private final DriverEarningsService driverEarningsService;

    @Autowired
    public DriverEarningsController(DriverEarningsService driverEarningsService) {
        this.driverEarningsService = driverEarningsService;
    }

    @GetMapping("/calculate-earnings")
    public Double getMonthlyEarnings(@RequestParam("driverId") int driverId,
                                     @RequestParam("month") int month) {
        return driverEarningsService.calculateDriverMonthlyEarnings(driverId, month);
    }
}
