package com.resfir.database.controller;

import com.resfir.database.entity.Level;
import com.resfir.database.entity.UniResponse;
import com.resfir.database.entity.User;
import com.resfir.database.entity.UserResponse;
import com.resfir.database.mapper.UserMapper;
import com.resfir.database.service.UserService;
import com.resfir.database.utils.JWTUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import static com.resfir.database.entity.DefaultStatus.FAILURE;
import static com.resfir.database.entity.DefaultStatus.SUCCESS;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public UniResponse<UserResponse> login(Map<String, Object> map) {
        UniResponse<UserResponse> response = new UniResponse<>();
        User user = new User((String) map.get("id"),(String) map.get("username"),(String) map.get("password"), Level.DEFAULT.getCode());
        UserResponse data = userService.login(user);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    @PostMapping("/signup")
    public UniResponse<UserResponse> signup(Map<String, Object> map) {
        UniResponse<UserResponse> response = new UniResponse<>();
        User user = new User((String) map.get("id"),(String) map.get("username"),(String) map.get("password"), Level.DEFAULT.getCode());
        UserResponse data = userService.signup(user.getUsername(), user.getPassword());
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    @PostMapping("/t")
    public UniResponse<UserResponse> t() {
        UniResponse<UserResponse> r = new UniResponse<>();
        r.setCode(SUCCESS);
        Map<String, String> payload = new HashMap<>();
        payload.put("id", "1");
        payload.put("username", "1");
        r.setData(new UserResponse() {{
            setToken(JWTUtils.getToken(payload));
        }});
        return r;
    }


}
