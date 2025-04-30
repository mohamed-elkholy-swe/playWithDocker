package com.example.PlayWithDocker.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepo userRepo;

    @PostMapping
    public String createUser(@RequestBody User user) {
        userRepo.save(user);
        return "User created successfully!";
    }

    @GetMapping
    public List<User> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users;
    }
}
