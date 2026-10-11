package com.pharmaorderanalytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pharmaorderanalytics.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}