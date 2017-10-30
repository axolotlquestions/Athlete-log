package com.example.alexandersmith.athletetracking;

/**
 * Created by alexandersmith on 30/10/2017.
 */

class Boxer extends Athlete {

    private int hitsGiven;
    private int hitsReceived;

    public Boxer(int hitsGiven, int hitsReceived) {
        this.hitsGiven = hitsGiven;
        this.hitsReceived = hitsReceived;
    }

    @Override
    protected void calculatePoints() {
        this.totalPoints = hitsGiven - hitsReceived;
    }
}
