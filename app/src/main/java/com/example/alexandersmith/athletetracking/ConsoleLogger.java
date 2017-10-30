package com.example.alexandersmith.athletetracking;

import java.util.ArrayList;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public class ConsoleLogger implements AthleteLog {

    public void log(Athlete athlete){
        for(Integer distance: athlete.getSessions()){
            System.out.println("You ran " + distance + " miles.");
        }

        System.out.println("You ran " + athlete.totalDistance() + " miles in total.");
    }
}
