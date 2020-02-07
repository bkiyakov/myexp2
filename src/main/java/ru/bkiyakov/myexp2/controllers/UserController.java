package ru.bkiyakov.myexp2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bkiyakov.myexp2.models.User;
import ru.bkiyakov.myexp2.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public List<User> getAll(){
        return userService.findAll();
    }
}
