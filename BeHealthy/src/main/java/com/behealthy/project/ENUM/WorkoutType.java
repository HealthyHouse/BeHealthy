package com.behealthy.project.ENUM;

public enum WorkoutType {
    HomeWorkout(0),
    GymWorkout(1),
    Yoga(2);

    private int code;

    private WorkoutType(int code){
        this.code=code;
    }

    public int getCode(){
        return this.code;
    }
}
