package com.example.userapp.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.userapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}

