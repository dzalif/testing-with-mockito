package com.kucingselfie.testwithmockito;

public class SoccerViewModel {
    int scoreHome = 0;
    int scoreAway = 0;
    String result = "";
    String teamHome = "";
    String teamAway = "";

    void setTeamHome(String teamName) {
        teamHome = teamName;
    }

    void setTeamAway(String teamName) {
        teamAway = teamName;
    }

    void goal(String team) {
        if (team.equals(teamHome)) {
            scoreHome++;
            result = String.format("score saat ini team %s %d : %s %d", teamHome, scoreHome, teamAway, scoreAway);
        } else {
            scoreAway++;
            result = String.format("score saat ini team %s %d : %s %d", teamAway, scoreAway, teamHome, scoreHome);
        }
    }
}
