package com.behealthy.project.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "WeeklyMealPlans")
@Getter
@Setter
public class WeeklyMealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "weeklyMealPlan")
    private List<DailyMealPlan> dailyMealPlans;

}
