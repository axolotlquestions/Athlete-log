package com.example.alexandersmith.athletetracking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by alexandersmith on 30/10/2017.
 */

public class GymnastTest {
    Gymnast gymnast;

    @Before
    public void setUp() throws Exception {
        gymnast = new Gymnast(10, 5);
    }

    @Test
    public void testCalculatePoints() throws Exception {
        gymnast.calculatePoints();
        assertEquals(15, gymnast.getTotalPoints());
    }

    @Test
    public void testParticipate() throws Exception {
        assertEquals("Gold medal!", gymnast.participate());
    }
}
