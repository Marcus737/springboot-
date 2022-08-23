package com.wei.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.wei.MyBatisSpriingBootApplication;
import com.wei.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = MyBatisSpriingBootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class UserMapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    public void listUser(){
        List<User> users = userMapper.userList();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void getById(){
        User byId = userMapper.getById(1);
        System.out.println(byId);
    }

    @Test
    public void baseMapperTest(){
        List<User> users = userMapper.selectList(new QueryWrapper<>());
        for (User user : users) {
            System.out.println(user);
        }
    }
}
