package me.dh.service;

import me.dh.entity.User;

import java.util.List;

public interface UserService {

    List<User> listUser();

    void update(User user);

    User findById(Integer id);
}
