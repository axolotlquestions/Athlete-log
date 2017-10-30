package com.example.alexandersmith.athletetracking;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public class Runner {
    public static void main(String[] args) {
        Boxer boxer = new Boxer(20, 5);
        boxer.run(5);
        boxer.run(5);
        boxer.run(5);
        boxer.run(5);
        boxer.run(5);
        boxer.run(10);

        PrintLogger logger = new PrintLogger("/Users/alexandersmith/Desktop/log2.txt");
        logger.log(boxer);
    }
}
