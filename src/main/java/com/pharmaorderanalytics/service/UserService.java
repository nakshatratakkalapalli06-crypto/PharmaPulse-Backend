package com.pharmaorderanalytics.service;

import org.springframework.stereotype.Service;

import com.pharmaorderanalytics.entity.User;
import com.pharmaorderanalytics.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}