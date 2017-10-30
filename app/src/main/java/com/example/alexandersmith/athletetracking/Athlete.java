package com.example.alexandersmith.athletetracking;

import java.util.ArrayList;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public abstract class Athlete {
    protected int totalPoints;
    protected ArrayList<Integer> sessions;
    protected abstract void calculatePoints();

    public Athlete() {
        sessions = new ArrayList<>();
        this.totalPoints = 0;
    }

    private String prepare(){
        return "Getting ready";
    }

    private String compete(){
        return "Competing";
    }

    private String awardMedal(){
        if(totalPoints >= 15){
            return "Gold medal!";
        }else if(totalPoints >= 10){
            return "Silver medal!";
        }else if(totalPoints > 5){
            return "Bronze medal!";
        }

        return "Did not place :(";
    }

    public String participate(){
        prepare();
        compete();
        calculatePoints();
        return awardMedal();
    }

    public int getTotalPoints() {
        return totalPoints;
    }


    public void run(int distance) {
        sessions.add(distance);
    }

    public ArrayList<Integer> getSessions() {
        return new ArrayList<Integer>(sessions);
    }

    public int totalDistance() {
        int totalDistance = 0;
        for (int distance : sessions){
            totalDistance += distance;
        }
        return totalDistance;
    }
}
