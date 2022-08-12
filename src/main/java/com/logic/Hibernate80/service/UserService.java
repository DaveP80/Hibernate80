package com.logic.Hibernate80.service;

import com.logic.Hibernate80.Repository.UserRepository;
import com.logic.Hibernate80.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Users save(Users user) {

        return userRepository.save(user);
    }

    public List<Users> findAllUsers() {

        return userRepository.findAll();
    }
}
