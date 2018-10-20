package com.spaceapps.canopener.SpaceAppCanOpener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spaceapps.canopener.SpaceAppCanOpener.entity.User;
import com.spaceapps.canopener.SpaceAppCanOpener.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createNewUser (User userRequest) throws Exception{

        return userRepository.save(userRequest);
    }
}
