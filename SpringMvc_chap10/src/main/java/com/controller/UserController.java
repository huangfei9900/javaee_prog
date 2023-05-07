package com.controller;

import com.pojo.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

@Controller
public class UserController {
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestParam("name") String username, String password){
        System.out.println("user save...");
        System.out.println(username+" "+password);
        return "success";
    }
  @RequestMapping("/save1")
    @ResponseBody
    public void save1(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(username+" "+password);
    }

    @RequestMapping("/save2")
    @ResponseBody
    public String save2(User user)
    {
        System.out.println("user save2....");
        System.out.println("username:"+user.getName()+" "+"password:"+user.getPassword());
        return "success";
    }
    @RequestMapping("/getdate")
    @ResponseBody
    public String getdate(@DateTimeFormat(pattern = "YYYY-MM-dd") java.util.Date date)
    {
        System.out.println("getdate...");

        System.out.println("date:"+date);
        return "success";
    }
}
