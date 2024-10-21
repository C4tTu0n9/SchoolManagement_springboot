package com.tuongpc.my_project.controller;

import com.tuongpc.my_project.entity.Users;
import com.tuongpc.my_project.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class HomeController {
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/register")
    public String register(Model model) {
        Users users = new Users();
        users.setUsername("test");
        users.setPasswordHash("123");
        users.setFullName("tuong");
        users.setEmail("test@tuongpc.com");
        users.setDob(LocalDate.parse("1990-01-01"));
        users.setRole("admin");
        users.setAddressId(1);
        this.userService.handleSaveUsers(users);
        model.addAttribute("user", users);
        return "client/register";
    }

}
