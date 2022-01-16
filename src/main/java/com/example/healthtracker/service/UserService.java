package com.example.healthtracker.service;

import com.example.healthtracker.model.User;
import com.example.healthtracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(String login, String password, String name) {
        if(login !=null && password !=null) {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setName(name);
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public User authenticate(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
}
