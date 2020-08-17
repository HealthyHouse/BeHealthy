package com.behealthy.project.ENUM;

public enum ActivityLevel {
    Sedentary(0),
    Light(1),
    Moderate(2),
    Extreme(3);

    private int code;

    private ActivityLevel(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
