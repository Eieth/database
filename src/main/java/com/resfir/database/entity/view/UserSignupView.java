package com.resfir.database.entity.view;

import lombok.Data;

@Data
public class UserSignupView extends UserLoginView {
    private String password_rep;
}
