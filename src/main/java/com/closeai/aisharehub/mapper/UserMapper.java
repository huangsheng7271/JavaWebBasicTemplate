package com.closeai.aisharehub.mapper;

import com.closeai.aisharehub.model.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Users getUserById(Integer id);
}