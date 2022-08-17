package com.ClothingStore.Services;


import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Entities.Products;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerUser(UserDto usermodel) {
        User user = new User();
        user.setEmail(usermodel.getEmail());
        user.setUsername(usermodel.getUsername());
        user.setRole("USER");
        user.setPassword(passwordEncoder.encode(usermodel.getPassword()));
        userRepository.save(user);
        return user;
    }

    public User getUserById(Long id) {
        if (id != null) {
            return userRepository.findById(id).get();
        }
        return null;
    }
}