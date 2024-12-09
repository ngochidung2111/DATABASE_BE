package com.example.demo.repository;

import com.example.demo.DTO.TripDetailsDTO;
import com.example.demo.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, String> {

    @Query(value = "{call GetTripDetails(:username)}", nativeQuery = true)
    List<Object[]> getTripDetailsByUsername(@Param("username") String username);
}
