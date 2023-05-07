package com.controller;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> getAll(User user) {
        return userService.getAll(user);
    }

    @PostMapping
    @ResponseBody
    public int save(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public int delete(@PathVariable int id) {
        return userService.delete(id);
    }

    @PutMapping
    @ResponseBody
    public int update(@RequestBody User user) {
        return userService.update(user);
    }
}
