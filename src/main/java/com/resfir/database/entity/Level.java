package com.resfir.database.entity;


public enum Level {
    DEFAULT(0),
    ADMIN(1),
    SUPER_ADMIN(2);
    private final int code;

    Level(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
