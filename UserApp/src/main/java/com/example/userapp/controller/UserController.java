package com.example.userapp.controller;

import com.example.userapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.userapp.service.UserService;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    private List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping ("/{userid}")
    private User getUserById(@PathVariable("userid") int userid)
    {
        return userService.getUserById(userid);
    }

    @PostMapping("/")
    private int saveUser(@RequestBody User user)
    {
        userService.saveOrUpdate(user);
        return user.getUserId();
    }

    @DeleteMapping("/{userid}")
    private void deleteUser(@PathVariable("userid") int userid)
    {
        userService.delete(userid);
    }

    @PutMapping("/{userId}")
    private ResponseEntity update(@RequestBody User user, @PathVariable("userId") int userId)
    {
        User oldUser = userService.getUserById(userId);
        if(oldUser==null)
        {
            return ResponseEntity.notFound().build();
        }
        user.setUserId(userId);
        userService.saveOrUpdate(user);
        return ResponseEntity.ok().body(user);
    }

}


