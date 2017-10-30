package com.example.alexandersmith.athletetracking;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public class PrintLogger implements AthleteLog {

 private String filePath;

    public PrintLogger(String filePath) {
        this.filePath = filePath;
    }

    public void log(Athlete athlete){

        File file = new File (filePath);
        file.getParentFile().mkdirs();
        try {
            PrintWriter printWriter = new PrintWriter(file);
            for (int distance: athlete.getSessions()){
                printWriter.println("You ran " + distance + " miles");
            }
            printWriter.println("You ran " + athlete.totalDistance() + " miles in total");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
