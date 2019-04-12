package com.baizhi.service.impl;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Userserviceimpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> selectall() {
        List<User> list = userDAO.selectAll();
        return list;
    }
}
