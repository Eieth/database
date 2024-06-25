package com.resfir.database.entity.view;

import lombok.Data;

@Data
public class ResetView {
    private int posterId;
    private int managedId;
    private String newPassword;
}
