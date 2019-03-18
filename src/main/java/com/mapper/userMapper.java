package com.mapper;

import com.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface userMapper {
    User getUser (User user);

}
