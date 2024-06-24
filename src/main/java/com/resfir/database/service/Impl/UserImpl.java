package com.resfir.database.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.resfir.database.entity.Level;
import com.resfir.database.entity.User;
import com.resfir.database.entity.UserResponse;
import com.resfir.database.mapper.UserMapper;
import com.resfir.database.service.UserService;
import com.resfir.database.utils.JWTUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserImpl implements UserService {
    private final UserMapper userMapper;

    public UserImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserResponse login(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", user.getId());
        User t = userMapper.selectOne(queryWrapper);
        if (t == null) {
            return null;
        }
        if (t.getPassword().equals(user.getPassword())) {
            UserResponse response = new UserResponse();
            try {
                Map<String, String> payload = new HashMap<>();
                payload.put("id",user.getId());
                payload.put("username",user.getUsername());
                // 生成jwt令牌
                String token = JWTUtils.getToken(payload);
                response.setToken(token);
                response.setId(user.getId());
                response.setUsername(user.getUsername());
                response.setLevel(t.getLevel());
                return response;
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }


    public UserResponse signup(String username, String password) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", username);
        User t = userMapper.selectOne(queryWrapper);
        if (t != null) {
            return null;
        }

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        userMapper.insert(user);

        UserResponse response = new UserResponse();
        try {
            Map<String, String> payload = new HashMap<>();
            payload.put("id",user.getId());
            payload.put("username",user.getUsername());
            // 生成jwt令牌
            String token = JWTUtils.getToken(payload);
            response.setToken(token);
            response.setId(user.getId());
            response.setUsername(user.getUsername());
            response.setLevel(Level.DEFAULT.getCode());
            return response;
        } catch (Exception e) {
            return null;
        }
    }
}
