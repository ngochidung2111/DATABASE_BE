package com.example.demo.service;

import com.example.demo.DTO.UserAccountDTO;
import com.example.demo.Exception.UserNotFoundException;
import com.example.demo.model.UserAccount;
import com.example.demo.repository.UserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    // Phương thức lấy tất cả UserAccount có status nhất định
    public List<UserAccount> findalluser() {
        return userAccountRepository.findAll();
    }
    // Thêm mới UserAccount
    public UserAccount createUserAccount(UserAccount userAccount) {
        return userAccountRepository.save(userAccount);
    }
    public UserAccount updateUserAccount(String username, UserAccount userAccount) {
        if (!userAccountRepository.existsById(username)) {
            // Ném ngoại lệ khi không tìm thấy user ID
            throw new RuntimeException("User account with username " + username + " not found.");
        }
        userAccount.setUsername(username);
        return userAccountRepository.save(userAccount);
    }
    // Xóa UserAccount
    public void deleteUserAccount(String username) {
        if (!userAccountRepository.existsById(username)) {
            // Ném ngoại lệ tùy chỉnh khi không tìm thấy user ID
            throw new UserNotFoundException("User account with username " + username + " not found.");
        }
        userAccountRepository.deleteById(username);
    }
    public String deactivateUserAccount(String username) {
        if (!userAccountRepository.existsById(username)) {
            // Ném ngoại lệ tùy chỉnh khi không tìm thấy user ID
            throw new UserNotFoundException("User account with username " + username + " not found.");
        }
        return userAccountRepository.deactivateUserAccount(username);
    }
    public UserAccountDTO getUserAccount(String username) {
        // Gọi stored procedure
        List<Object[]> results = userAccountRepository.getUserAccount(username);

        if (results.isEmpty()) {
            return null;  // Nếu không có kết quả, trả về null hoặc xử lý lỗi
        }

        // Chuyển đổi kết quả thành DTO
        Object[] result = results.get(0);  // Lấy kết quả đầu tiên
        UserAccountDTO dto = new UserAccountDTO();

        dto.setUsername((String) result[0]);
        dto.setEmail((String) result[1]);
        dto.setPhoneNumber((String) result[2]);
        dto.setAccountStatus((String) result[3]);
        dto.setFamilyName((String) result[4]);
        dto.setFirstName((String) result[5]);
        dto.setAddress((String) result[6]);
        dto.setStartDate((Date) result[7]);
        dto.setTotalTrips((Integer) result[8]);
        dto.setTotalDriverTrips((Integer) result[9]);
        dto.setTotalAmountPaid((BigDecimal) result[10]);
        dto.setTotalAmountReceived((BigDecimal) result[11]);

        return dto;
    }
}
