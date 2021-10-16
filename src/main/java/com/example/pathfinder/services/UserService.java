package com.example.pathfinder.services;

import com.example.pathfinder.models.service.UserServiceModel;
import org.springframework.stereotype.Service;


public interface UserService {

    void registerUser(UserServiceModel userServiceModel);

    UserServiceModel findUserByUsernameAndPassword(String username, String password);
}
