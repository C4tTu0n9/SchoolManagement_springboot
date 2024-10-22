package com.tuongpc.my_project.service;

import com.tuongpc.my_project.dto.UsersDTO;
import com.tuongpc.my_project.entity.Users;
import com.tuongpc.my_project.repository.UserRepository;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService{
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users handleSaveUsers(Users user){
        this.userRepository.save(user);
        return user;
    }
    public Users getUserByUsername(String username){
        return this.userRepository.findByUsername(username);
    }
    public Users getUserByEmail(String email){
        return this.userRepository.findByEmail(email);
    }
    public Users UserDTOtoUser(UsersDTO registerDTO) {
        Users user = new Users();
        user.setFullName(registerDTO.getFullName());
        user.setEmail(registerDTO.getEmail());
        user.setPhone(registerDTO.getPhone());
        user.setPasswordHash(registerDTO.getPassword());
        return user;
    }
}
