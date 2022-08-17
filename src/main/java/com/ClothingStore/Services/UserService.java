package com.ClothingStore.Services;


import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public ResponseEntity<?> registerUser(UserDto usermodel) {

        User user = new User();
        if (userRepository.existsByEmail(usermodel.getEmail())  ) {
            return new ResponseEntity<>("Email already exist", HttpStatus.BAD_REQUEST);
        }
        else {
            user.setEmail(usermodel.getEmail());
            user.setUsername(usermodel.getUsername());
            user.setRole("USER");
            user.setPassword(passwordEncoder.encode(usermodel.getPassword()));
            userRepository.save(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }

    }

    public User getUserById(Long id) {
        if (id != null) {
            return userRepository.findById(id).get();
        }
        return null;
    }
}