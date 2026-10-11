package com.pharmaorderanalytics.controller;

import org.springframework.web.bind.annotation.*;

import com.pharmaorderanalytics.entity.User;
import com.pharmaorderanalytics.service.UserService;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.findByEmail(email);
    }
    @PostMapping("/login")
    public User login(@RequestBody User user) {

        User existingUser = userService.findByEmail(user.getEmail());

        if (existingUser != null &&
            existingUser.getPassword().equals(user.getPassword())) {

            return existingUser;
        }

        return null;
    }
}