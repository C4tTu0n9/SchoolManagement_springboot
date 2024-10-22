package com.tuongpc.my_project.controller;

import com.tuongpc.my_project.dto.UsersDTO;
import com.tuongpc.my_project.entity.Users;
import com.tuongpc.my_project.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@Controller
public class HomeController {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;


    public HomeController(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/register")
    public String registerGetPage(Model model) {
        model.addAttribute("user", new UsersDTO());
        return "client/register";
    }

    @PostMapping("/register")
    public String registerPost(@Valid @ModelAttribute("user") UsersDTO userDTO,
                           BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "client/register";
        }
        Users newUser = new Users();
        newUser.setFullName(userDTO.getFullName());
        newUser.setEmail(userDTO.getEmail());
        newUser.setPhone(userDTO.getPhone());
        Users user = this.userService.UserDTOtoUser(userDTO);
        String hashPassword = this.passwordEncoder.encode(user.getPasswordHash());
        user.setPasswordHash(hashPassword);
        user.setRole("parents");
        this.userService.handleSaveUsers(user);
        return "redirect:/";
    }

}
