package com.resfir.database.service;

import com.resfir.database.entity.User;
import com.resfir.database.entity.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse login(User user);
    UserResponse signup(String username, String password);
    Boolean resetPassword(String token, int posterId, int managedId, String newPassword);
    Boolean setLevel(String token, int posterId, int managedId, int newLevel);

    List<User> getUserList();

    int getUserLevelByToken(String token);
}
