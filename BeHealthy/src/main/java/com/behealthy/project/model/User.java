package com.behealthy.project.model;

import com.behealthy.project.ENUM.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private Long mobileNumber;

    private String email;

    private boolean active;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user")
    private WeeklyMealPlan weeklyMealPlan;

    @OneToOne(mappedBy = "user")
    private ExcercisePlan excercisePlan;

    @OneToOne(mappedBy = "user")
    private UserPreferences userPreferences;

}
