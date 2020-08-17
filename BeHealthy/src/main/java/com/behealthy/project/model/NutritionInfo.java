package com.behealthy.project.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "NutritionInformation")
@Getter
@Setter
public class NutritionInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fat;

    private Long calories;

    private Long carbohydrates;

    private Long protein;
}
