package org.example.sksa.user.controller;

import org.example.sksa.user.entity.User;
import org.example.sksa.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User create(@RequestBody User user){
        return new User();
    }

    @PutMapping("/{id}")
    public User update(@RequestBody User user){
        return user;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return new User();
    }

    @GetMapping
    public List<User> query(String name){
        return userRepository.findByName(name);
    }
}
