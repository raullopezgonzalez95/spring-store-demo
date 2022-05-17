package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;
import org.springframework.web.bind.annotation.*;
import org.webjars.NotFoundException;

import java.util.Optional;

@RestController
@RequestMapping(path="/user")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setEmail(email);
        userRepository.save(userEntity);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping
    public @ResponseBody Optional<UserEntity> getUserById(@RequestParam Integer id) {
        return Optional.ofNullable(userRepository.findById(id).orElseThrow(
                () -> new NotFoundException("NotFoundException")
        ));
    }

}
