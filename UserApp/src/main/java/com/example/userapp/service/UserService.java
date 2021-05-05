package com.example.userapp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.userapp.model.User;
import com.example.userapp.repository.UserRepository;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(users1 -> users.add(users1));
        return users;
    }

    public User getUserById(int id)
    {

        return userRepository.findById(id).get();
    }

    public void saveOrUpdate(User users)
    {
        userRepository.save(users);
    }

    public void delete(int id)
    {
        userRepository.deleteById(id);
    }

    public void update(User users, int userid)
    {
        userRepository.save(users);
    }
}