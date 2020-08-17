package com.behealthy.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Ingredients")
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nutritionInfoId", referencedColumnName = "id")
    private NutritionInfo nutritionInfo;

}
