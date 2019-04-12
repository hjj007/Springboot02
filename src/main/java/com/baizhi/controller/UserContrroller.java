package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserContrroller {
    @Autowired
    private UserService userService;
    @RequestMapping("user")
    public String select(Map map){
        List<User> list = userService.selectall();
        map.put("list",list);
        return "index";
    }
}
