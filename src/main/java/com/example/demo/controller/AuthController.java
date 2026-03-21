package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        // 🔐 Only admin allowed
        if ("admin".equals(user.getUsername()) &&
            "admin123".equals(user.getPassword())) {

            return "admin-token";
        }

        throw new RuntimeException("Invalid credentials");
    }
}