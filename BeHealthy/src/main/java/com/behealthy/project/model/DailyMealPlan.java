package com.behealthy.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DailyMealPlans")
@Getter
@Setter
public class DailyMealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //TODO: include nutrition target

    @ManyToOne
    @JoinColumn(name = "weeklyMealPlanId", referencedColumnName = "id")
    private WeeklyMealPlan weeklyMealPlan;

    @ManyToMany
    @JoinTable(name = "DailyMealPlanAndMeal", joinColumns = @JoinColumn(name = "dailyMealPlanId",referencedColumnName = "id"),
                                        inverseJoinColumns = @JoinColumn(name = "mealId",referencedColumnName = "id"))
    private List<Meal> meals;

}
