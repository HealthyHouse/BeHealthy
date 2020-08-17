package com.behealthy.project.ENUM;

public enum ExperienceLevel {
    Novice(0),
    Beginner(1),
    Intermediate(2),
    Advance(3);

    private int code;

    private ExperienceLevel(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }
}
