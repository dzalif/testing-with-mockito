package com.kucingselfie.testwithmockito;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SoccerViewModelTest {
    private String teamHome = "Harimau";
    private String teamAway = "Kijang";
    private SoccerViewModel soccerViewModel;

    @Before
    public void setUp() {
        soccerViewModel = new SoccerViewModel();
        soccerViewModel.setTeamAway(teamAway);
        soccerViewModel.setTeamHome(teamHome);
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testing() {
        soccerViewModel.goal(teamAway);
        soccerViewModel.goal(teamAway);
        soccerViewModel.goal(teamHome);

        assertEquals(String.format("score saat ini team %s %d : %s %d", teamHome, 1, teamAway, 2), soccerViewModel.result);
    }
}