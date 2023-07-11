package com.example.RegisterLogin.controller;

import com.example.RegisterLogin.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    private static final String USERNAME = "john";
    private static final String PASSWORD = "pass123";

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        // Simulated login logic
        if (user.getUsername() != null && user.getPassword() != null) {
            if (user.getUsername().equals(USERNAME) && user.getPassword().equals(PASSWORD)) {
                return "Login successful";
            } else {
                return "Invalid username or password";
            }
        } else {
            return "Invalid input";
        }
    }
}
