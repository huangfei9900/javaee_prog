package com.service;

import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll(User user) {
        return userDao.getAll(user);
    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }
}
