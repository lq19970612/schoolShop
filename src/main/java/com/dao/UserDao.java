package com.dao;

import com.pojo.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface UserDao {
    public User getUser(String username);
}
