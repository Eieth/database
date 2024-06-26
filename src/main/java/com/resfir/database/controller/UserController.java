package com.resfir.database.controller;

import com.resfir.database.entity.UniResponse;
import com.resfir.database.entity.User;
import com.resfir.database.entity.UserResponse;
import com.resfir.database.entity.view.*;
import com.resfir.database.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.resfir.database.entity.DefaultStatus.FAILURE;
import static com.resfir.database.entity.DefaultStatus.SUCCESS;
import static com.resfir.database.entity.Level.DEFAULT;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
@Tag(name = "用户控制服务")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @Operation(summary = "用户登录")
    @PostMapping("/login")
    public UniResponse<UserResponse> login(@RequestBody UserLoginView userLoginView) {
        UniResponse<UserResponse> response = new UniResponse<>();
        User user = new User(-1, userLoginView.getUsername(), userLoginView.getPassword(), DEFAULT.getCode());
        UserResponse data = userService.login(user);
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }
    @Operation(summary = "用户注册")
    @PostMapping("/signup")
    public UniResponse<UserResponse> signup(@RequestBody UserSignupView userSignupView) {
        UniResponse<UserResponse> response = new UniResponse<>();
        String username = userSignupView.getUsername();
        String password = userSignupView.getPassword();
        String password_rep = userSignupView.getPassword_rep();
        if (!password.equals(password_rep)) {
            response.setCode(FAILURE);
            response.setMessage("密码不一致");
            return response;
        }
        User user = new User(-1, username, password, DEFAULT.getCode());
        UserResponse data = userService.signup(user.getUsername(), user.getPassword());
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }

    @Operation(summary = "超级管理员重置其余用户密码")
    @PostMapping("/resetPassword")
    public UniResponse<Boolean> resetPassword(HttpServletRequest request, @RequestBody ResetView view) {
        UniResponse<Boolean> response = new UniResponse<>();
        String token = request.getHeader("token");
        Boolean result = userService.resetPassword(token, view.getPosterId(), view.getManagedId(), view.getNewPassword());
        response.setData(result);
        return response;
    }

    @Operation(summary = "超级管理员设置其余用户权限")
    @PostMapping("/setLevel")
    public UniResponse<Boolean> setLevel(HttpServletRequest request, @RequestBody SetView view) {
        UniResponse<Boolean> response = new UniResponse<>();
        String token = request.getHeader("token");
        Boolean result = userService.setLevel(token, view.getPosterId(), view.getManagedId(), view.getNewLevel());
        response.setData(result);
        return response;
    }

    @Operation(summary = "查询所有用户")
    @PostMapping("/getUsers")
    public UniResponse<List<User>> getUserList() {
        UniResponse<List<User>> response = new UniResponse<>();
        List<User> data = userService.getUserList();
        if (data == null) {
            response.setCode(FAILURE);
        } else {
            response.setCode(SUCCESS);
            response.setData(data);
        }
        return response;
    }
    @Operation(summary = "删除用户")
    @PostMapping("/deleteUser")
    public UniResponse<Boolean> deleteUser(HttpServletRequest request, @RequestBody UserDeleteView view) {
        UniResponse<Boolean> response = new UniResponse<>();
        String token = request.getHeader("token");
        Boolean result = userService.deleteUser(token, view.getPosterId(), view.getManagedId());
        response.setData(result);
        return response;
    }
}
