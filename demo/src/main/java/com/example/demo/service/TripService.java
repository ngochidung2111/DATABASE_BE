package com.example.demo.service;

import com.example.demo.DTO.TripDetailsDTO;
import com.example.demo.DTO.UserAccountDTO;
import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UserAccountRepository;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private UserAccountRepository userAccountRepository;
    public List<TripDetailsDTO> getTripDetails(String username) {
        if (!userAccountRepository.existsById(username)) {
            // Ném ngoại lệ tùy chỉnh khi không tìm thấy user ID
            throw new UserNotFoundException("User account with username " + username + " not found.");
        }
        List<Object[]> results =  tripRepository.getTripDetailsByUsername(username);
        if (results.isEmpty()) {
            return null;  // Nếu không có kết quả, trả về null hoặc xử lý lỗi
        }
        // Map results to TripDetailsDTO
        return results.stream().map(result -> {
            TripDetailsDTO trip = new TripDetailsDTO();
            trip.setTripId((Integer) result[0]);
            trip.setDeparture((String) result[1]);
            trip.setDestination((String) result[2]);
            // Chuyển đổi từ Timestamp sang LocalDateTime
            Timestamp tripStartTimestamp = (Timestamp) result[3];
            trip.setTripStart(tripStartTimestamp.toLocalDateTime());

            Timestamp tripEndTimestamp = (Timestamp) result[4];
            trip.setTripEnd(tripEndTimestamp.toLocalDateTime());
            trip.setServiceName((String) result[5]);
            trip.setTotalCost((BigDecimal) result[6]);
            trip.setRating((Integer) result[7]);
            trip.setFeedback((String) result[8]);
            trip.setDriverFirstName((String) result[9]);
            trip.setDriverFamilyName((String) result[10]);
            return trip;
        }).toList();
    }
}
