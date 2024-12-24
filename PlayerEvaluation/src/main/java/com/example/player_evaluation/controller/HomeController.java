package com.example.player_evaluation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Trả về tên của tệp HTML cho trang chủ (index.html)
    }
}
