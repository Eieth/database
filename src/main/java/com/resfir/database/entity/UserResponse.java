package com.resfir.database.entity;

import lombok.Data;

@Data
public class UserResponse {
    private int id;
    private String username;
    private String token;
    private int level;
}
