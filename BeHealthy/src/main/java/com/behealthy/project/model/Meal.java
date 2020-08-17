package com.behealthy.project.model;

import com.behealthy.project.ENUM.MealTime;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Meals")
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long cost;

    private MealTime mealTime;

    // TODO: handle meal description properly
    private String description;

    @ManyToMany(mappedBy = "meals")
    private List<DailyMealPlan> dailyMealPlans;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipeId", referencedColumnName = "id")
    private Recipe recipe;


}
