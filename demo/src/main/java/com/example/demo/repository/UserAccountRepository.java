package com.example.demo.repository;

import com.example.demo.DTO.UserAccountDTO;
import com.example.demo.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
    @Query(value = "{call deactivateUserAccount(:username)}", nativeQuery = true)
    String deactivateUserAccount(@Param("username") String username);
    @Query(value = "{call GetUserAccount(:username)}", nativeQuery = true)
    List<Object[]> getUserAccount(@Param("username") String username);

}
