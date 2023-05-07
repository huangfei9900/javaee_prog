package com.service;

import com.pojo.User;

import java.util.List;

public interface UserService {
    List<User>getAll(User user);
    int save(User user);
    int delete(int id);
    int update(User user);
}
