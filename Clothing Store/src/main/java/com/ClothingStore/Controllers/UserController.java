package com.ClothingStore.Controllers;


import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/c")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/GetUsrById/{id}")
    public UserDto GetUsrByid(@PathVariable int id ){

        return userService.GetUserByid(id);
    }

}