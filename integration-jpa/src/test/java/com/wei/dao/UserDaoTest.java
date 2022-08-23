package com.wei.dao;

import com.wei.consumer.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class UserDaoTest {

    @Resource
    UserService userService;

    @Test
    public void selectAllTest(){
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            long b = System.currentTimeMillis();
            userService.getAll();
            long e = System.currentTimeMillis();
            min = Math.min(min, e - b);
            max = Math.max(max, e - b);
            System.out.println(e - b);
        }
        System.out.println(min);
        System.out.println(max);
    }
}
