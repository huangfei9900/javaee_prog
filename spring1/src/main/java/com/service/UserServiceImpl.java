package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.dao.UserDaoImpl2;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author admincoder
 * @create 2023-03-01 21:02
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void save() {
      userDao.save();
    }

  public UserDao getUserDao() {
        return userDao;
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
