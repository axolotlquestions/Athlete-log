package com.example.alexandersmith.athletetracking;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public class Gymnast extends Athlete {

    private int difficulty;
    private int execution;

    public Gymnast(int difficulty, int execution) {
        this.difficulty = difficulty;
        this.execution = execution;

    }

    @Override
    protected void calculatePoints() {
        this.totalPoints = this.difficulty + this.execution;
    }
}
