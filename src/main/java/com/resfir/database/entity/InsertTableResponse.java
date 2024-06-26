package com.resfir.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InsertTableResponse {
    private int id;
    private boolean success;
}
