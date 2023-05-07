package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Controller
@RequestMapping("/users")

public class UserController {
    //  @RequestMapping(value = "/user",method = RequestMethod.POST)
    List  <User>list = new ArrayList<User>();

    @PostMapping("/save")
    @ResponseBody

    public String save(@RequestBody User user) {

        System.out.println("save");
        user.setId((new Random().nextInt()));
        list.add(user);
        return "success";
    }

    @RequestMapping("/update")
    @ResponseBody

    public String update(@RequestBody User user) {

        System.out.println("update");
        //int j = 0;
        //list.set(j, user);
        for (User u:list)
        {if (u.getId()==user.getId())
        {
            u.setUsername(user.getUsername());
            u.setName(user.getName());
            u.setAge(user.getAge());
            break;

        }
        }
        return "修改成功！";


    }

    @RequestMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable int id) {

        System.out.println("delete");

       // System.out.println("id=" + user.getId());
       // System.out.println("age=" + user.getAge());
        int i = 0;
        for (User u:list) {
            if (u.getId() == id) {
                list.remove(u);
                break;
            }
        }
      //  list.remove(i);
        return "删除成功！";


    }

    // @RequestMapping(value = "/user",method = RequestMethod.GET)
    @GetMapping("/getAll")
    @ResponseBody
    public List getuser() {


        System.out.println("getuser");
        User user = new User();
        user.setPassword(123);
        user.setName("huangfei");
        user.setAge(21);
        user.setUsername("xiaobai");
        user.setId(0);

        User user1 = new User();
        user1.setName("happy");
        user1.setPassword(234);
        user1.setAge(20);
        user1.setUsername("xiaohuang");
        user1.setId(1);
        list.add(user);
        list.add(user1);

        return list;


    }

}


