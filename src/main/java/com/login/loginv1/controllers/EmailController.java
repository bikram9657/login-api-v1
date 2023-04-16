package com.login.loginv1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "http://localhost:4200")
public class EmailController {

    @PostMapping
    public ResponseEntity<?> receiveEmail(@RequestBody Map<String, String> payload) {
        String email = payload.get("email");
        System.out.println("Email received: " + email);
        return ResponseEntity.ok().body(Map.of("message", "Email received"));
    }
}
