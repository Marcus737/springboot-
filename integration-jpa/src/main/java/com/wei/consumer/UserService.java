package com.wei.consumer;

import com.wei.entity.User;

import java.util.List;

public interface UserService {

    User insert(User user);

    List<User> getAll();

    User update(User user);

    boolean delete(User user);
}
