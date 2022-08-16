package com.ClothingStore.Services;


import com.ClothingStore.DTO.UserDto;
import com.ClothingStore.Entities.Products;
import com.ClothingStore.Entities.User;
import com.ClothingStore.Repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserService {

    @Autowired
    UserRepository userRepository;

// getting user by id

    public UserDto GetUserByid(int id) {


        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            UserDto userDto = new UserDto();
            BeanUtils.copyProperties(user.get(),userDto);
            return userDto;
        }
        return null;
    }
}