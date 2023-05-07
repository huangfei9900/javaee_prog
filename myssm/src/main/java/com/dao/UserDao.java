package com.dao;

import com.pojo.User;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;
@Repository
public interface UserDao {
    List <User> getAll(User user);
    int save(User user);
    int delete(int id);
    int update(User user);
}
