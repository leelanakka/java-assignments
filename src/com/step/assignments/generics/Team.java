package com.step.assignments.generics;

public class Team {
    private String teamName;
    private int wonPoints;
    private int lostPoints;
    private int drawPoints;
    private int totalPoints;

    public Team(String teamName, int wonPoints, int lostPoints, int drawPoints) {
        this.teamName = teamName;
        this.wonPoints = wonPoints;
        this.lostPoints = lostPoints;
        this.drawPoints = drawPoints;
        this.totalPoints = 0;
    }

    public void wonTheMatch() {
        this.totalPoints += wonPoints;
    }

    public void lostTheMatch() {
        this.totalPoints += lostPoints;
    }

    public void drawTheMatch() {
        this.totalPoints += drawPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public String getTeamName() {
        return teamName;
    }
}
