package com.example.RegisterLogin.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {

    @PostMapping("/logout")
    public String logout() {
        // Simulated logout logic
        return "Logout successful";
    }
}
