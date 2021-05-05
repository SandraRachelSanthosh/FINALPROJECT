package com.example.userapp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    @NotNull
    @NotEmpty
    @Column
    private String name;
    @NotNull
    @NotEmpty
    @Column
    private String userRole;
    @NotNull
    @NotEmpty
    @Column
    private String password;

    public User() {
    }

    public User(int userId, String name, String userRole, String password) {
        this.userId = userId;
        this.name = name;
        this.userRole = userRole;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
