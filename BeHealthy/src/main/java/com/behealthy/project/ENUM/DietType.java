package com.behealthy.project.ENUM;

public enum DietType {
    Veg(0),
    NonVeg(1),
    Keto(2);

    private int code;

    private DietType(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
