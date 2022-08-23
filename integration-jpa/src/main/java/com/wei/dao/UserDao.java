package com.wei.dao;

import com.wei.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.redis.core.RedisHash;


public interface UserDao extends JpaRepository<User, Long> {
}
