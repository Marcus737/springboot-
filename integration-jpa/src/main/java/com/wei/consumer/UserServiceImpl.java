package com.wei.consumer;

import com.wei.dao.UserDao;
import com.wei.entity.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Resource
    UserDao userDao;

    @Override
    @Transactional
    public User insert(User user) {
        return userDao.save(user);
    }

    @Override
    @Cacheable(value = "user")
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    @CachePut(value = "user", key = "#user.id")
    public User update(User user) {
        return userDao.save(user);
    }

    @Override
    @CacheEvict(value = "user", key = "#user.id")
    public boolean delete(User user) {
        userDao.delete(user);
        return true;
    }
}
