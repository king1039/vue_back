package com.jinke.mapper;

import com.jinke.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryList();

    User findById(Integer id);

    void updateUser(User user);
}
