package com.behealthy.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

@Entity
@Table(name = "Recipes")
@Getter
@Setter
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "recipe")
    private Meal meal;

    private String name;

    private String origin;

    //TODO: handle video link properly
    private String videoLink;

    private Duration cookingTime;

    private Duration preparationTime;

    private Long servings;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nutritionInfoId",referencedColumnName = "id")
    private NutritionInfo nutritionInfo;


    @ManyToMany
    @JoinTable(name = "RecipeAndIngredient", joinColumns = @JoinColumn(name = "recipeId",referencedColumnName = "id"),
                                    inverseJoinColumns = @JoinColumn(name = "ingredientId",referencedColumnName = "id"))
    private List<Ingredient> ingredients;

}
