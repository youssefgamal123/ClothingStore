package com.ClothingStore.Services;


import com.ClothingStore.Entities.Products;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

@Autowired
    UserRepository userRepository;

// getting user by id

    public Optional<User> GetUserByid(int id ){

        return userRepository.findById(id);
    }





}
