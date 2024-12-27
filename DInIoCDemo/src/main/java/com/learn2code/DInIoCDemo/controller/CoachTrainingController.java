package com.learn2code.controller;

import com.learn2code.beans.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachTrainingController {

    private final Coach coach;

    @Autowired
    public CoachTrainingController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("dailyWorkOut")
    public String getDailyWorkout() {
        return this.coach.getDailyWorkout();
    }
}