package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;
import com.sky.vo.UserLoginVO;

public interface UserService {
    public UserLoginVO login(UserLoginDTO userLoginDTO);

    public User wxLogin(UserLoginDTO userLoginDTO);
}
