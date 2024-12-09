package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DriverEarningsService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Double calculateDriverMonthlyEarnings(int driverId, Integer month) {
        String sql = "SELECT dbo.CalculateDriverMonthlyEarnings(?, ?)";
        return jdbcTemplate.queryForObject(sql, Double.class, driverId, month);
    }
}
