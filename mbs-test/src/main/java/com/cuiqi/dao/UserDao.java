package com.cuiqi.dao;

import com.cuiqi.domain.User;

import java.util.List;

/**
 * Created by 01439613 on 2016/11/8.
 */
public interface UserDao {

    User get(int id);

    List<User> getList(User user);
}
