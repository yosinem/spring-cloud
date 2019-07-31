package com.db.mongoService;

import com.db.mongoService.documents.User;
import com.db.mongoService.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    private UserRepository userRepository;

    @GetMapping("users/all")
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

}
