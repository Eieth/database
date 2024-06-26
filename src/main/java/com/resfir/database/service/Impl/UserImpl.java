package com.resfir.database.service.Impl;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.resfir.database.entity.Level;
import com.resfir.database.entity.UniResponse;
import com.resfir.database.entity.User;
import com.resfir.database.entity.UserResponse;
import com.resfir.database.mapper.UserMapper;
import com.resfir.database.service.UserService;
import com.resfir.database.utils.JWTUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.resfir.database.entity.Level.SUPER_ADMIN;

@Service
public class UserImpl implements UserService {
    private final UserMapper userMapper;

    public UserImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public UserResponse login(User user) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", user.getUsername());
        User t = userMapper.selectOne(queryWrapper);
        if (t == null) {
            return null;
        }
        if (t.getPassword().equals(user.getPassword())) {
            UserResponse response = new UserResponse();
            try {
                Map<String, String> payload = new HashMap<>();
                payload.put("id", String.valueOf(t.getId()));
                payload.put("username",user.getUsername());
                payload.put("level", String.valueOf(t.getLevel()));
                // 生成jwt令牌
                String token = JWTUtils.getToken(payload);
                response.setToken(token);
                response.setId(t.getId());
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
            payload.put("id",String.valueOf(user.getId()));
            payload.put("username",user.getUsername());
            payload.put("level", String.valueOf(user.getLevel()));
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

    public Boolean resetPassword(String token, int posterId, int managedId, String newPassword) {
        if (isNotSuperAdmin(token, posterId)) return false;

        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", managedId).set("password", newPassword);

        return userMapper.update(null, updateWrapper) > 0;
    }
    private int getUserLevelById(int userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id", userId);
        User user = userMapper.selectOne(queryWrapper);
        return user.getLevel();
    }

    public int getUserLevelByToken(String token) {
        return Integer.parseInt(JWTUtils.getToken(token).getClaim("level").asString());
    }

    private boolean isNotSuperAdmin(String token, int posterId) {
        DecodedJWT verify = JWTUtils.getToken(token);
        if (!verify.getClaim("id").asString().equals(String.valueOf(posterId))) {
            return true;
        }
        if (verify.getClaim("level").asString() == null) {
            return this.getUserLevelById(posterId) != SUPER_ADMIN.getCode();
        }

        return !verify.getClaim("level").asString().equals(String.valueOf(SUPER_ADMIN.getCode()));
    }

    public Boolean setLevel(String token, int posterId, int managedId, int newLevel) {
        if (isNotSuperAdmin(token, posterId)) return false;

        UpdateWrapper<User> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", managedId).set("level", newLevel);

        return userMapper.update(null, updateWrapper) > 0;
    }

    public List<User> getUserList() {

        return userMapper.selectList(null);
    }

    public Boolean deleteUser(String token, int posterId, int managedId) {
        if (isNotSuperAdmin(token, posterId)) return false;

        return userMapper.deleteById(managedId) > 0;
    }
}
