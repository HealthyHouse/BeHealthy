package com.behealthy.project.ENUM;

public enum ExerciseGoal {
    LoseWeight(0),
    Maintain(1),
    GainWeight(2);

    private int code;

    private ExerciseGoal(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
