package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "todoList";
    }

    @GetMapping("/api/v1/user")
    public String getUserView(@RequestParam(value = "id", required = false, defaultValue = "82058454") String id, Model model) {
    model.addAttribute("id", id);
    return "user"; // Thymeleaf 템플릿 이름 (user.html)
}
}
