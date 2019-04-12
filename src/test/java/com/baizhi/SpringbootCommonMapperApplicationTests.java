package com.baizhi;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCommonMapperApplicationTests {

    @Autowired
    UserDAO userDAO;

    @Test
    public void test1() {
        List<User> users = userDAO.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
    }



}
