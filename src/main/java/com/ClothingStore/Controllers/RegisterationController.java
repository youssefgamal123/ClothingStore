package com.ClothingStore.Controllers;

import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class RegisterationController {
    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public void registerUser(@RequestBody UserDto userModel) {
        User user = userservice.registerUser(userModel);
    }


}
