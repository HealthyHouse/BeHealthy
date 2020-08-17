package com.behealthy.project.model;


import com.behealthy.project.ENUM.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Duration;

@Entity
@Table(name = "UserPreferences")
@Getter
@Setter
public class UserPreferences {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    private Long age;

    private Gender gender;

    private Long weight;

    private Long height;

    private ExerciseGoal exerciseGoal;

    @Enumerated(value = EnumType.STRING)
    private BodyFat bodyFat;

    private ActivityLevel activityLevel;

    private Long targetWeight;

    private Double weightChangeRate;

    private Duration exerciseDuration;

    private ExperienceLevel experienceLevel;

    private DietType dietType;

    private Long dietBudget;

    private WorkoutType workoutType;

    //TODO:handle list of exercise days

}
