package com.behealthy.project.ENUM;

public enum MealTime {
    BREAKFAST(0),
    DINNER(1),
    LUNCH(2),
    SNACKS(3);

    private int code;

    private MealTime(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }
}
