package com.ClothingStore.Controllers;


import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/c")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/GetUsrById/{id}")
    public User GetUsrByid(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}