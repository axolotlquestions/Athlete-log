package com.example.alexandersmith.athletetracking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public class BoxerTest {
    Boxer boxer;

    @Before
    public void setUp() throws Exception {
        boxer = new Boxer(20, 10);
    }

    @Test
    public void testCalculatePoints() throws Exception {
        boxer.calculatePoints();
        assertEquals(10, boxer.getTotalPoints());
    }

    @Test
    public void testParticipate() throws Exception {
        assertEquals("Silver medal!", boxer.participate());
    }

    @Test
    public void testRun(){
        boxer.run(5);
        assertEquals(1, boxer.getSessions().size());
    }

    @Test
    public void testTotalDistance(){
        boxer.run(5);
        boxer.run(10);
        assertEquals(15, boxer.totalDistance());
    }
}
