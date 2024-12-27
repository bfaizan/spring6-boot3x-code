package com.learn2code.beanimpl;

import com.learn2code.beans.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
