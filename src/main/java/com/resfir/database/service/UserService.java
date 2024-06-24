package com.resfir.database.service;

import com.resfir.database.entity.User;
import com.resfir.database.entity.UserResponse;

public interface UserService {
    UserResponse login(User user);
    UserResponse signup(String username, String password);
}
