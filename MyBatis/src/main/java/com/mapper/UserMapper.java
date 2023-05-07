package com.mapper;

import com.pojo.User;


import java.util.List;

public interface UserMapper {

    public User getUserPassword(String name);
    public User getUserName(int password);

}
