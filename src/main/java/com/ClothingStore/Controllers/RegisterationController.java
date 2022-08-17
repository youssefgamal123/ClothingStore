package com.ClothingStore.Controllers;



import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class RegisterationController {
    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDto userModel) {

        return  userservice.registerUser(userModel);
    }
}
