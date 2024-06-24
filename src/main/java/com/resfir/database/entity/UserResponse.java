package com.resfir.database.entity;

import lombok.Data;

@Data
public class UserResponse {
    private String id;
    private String username;
    private String token;
    private int level;
}
