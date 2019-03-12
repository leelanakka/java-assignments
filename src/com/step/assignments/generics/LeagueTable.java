package com.step.assignments.generics;

import java.util.ArrayList;

public class LeagueTable<T> {

    private ArrayList<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<T>();
    }

    public void addTeams(T team) {
        this.teams.add(team);
    }

    public void printTeams() {
        this.sortArray();
        for (int i = 0; i < this.teams.size(); i++) {
            Team team = (Team) this.teams.get(i);
            System.out.println(team.getTeamName());
        }
    }

    public ArrayList sortArray() {

        for (int i = 0; i < teams.size() - 1; i++)
            for (int j = i + 1; j < teams.size(); j++) {
                Team team1 = (Team) this.teams.get(i);
                int firstTeamPoints = team1.getTotalPoints();
                Team team2 = (Team) this.teams.get(j);
                int secondTeamPoints = team2.getTotalPoints();

                if (firstTeamPoints < secondTeamPoints) {
                    Team smaller = team1;
                    this.teams.set(i, (T) team2);
                    this.teams.set(j, (T) smaller);
                }
            }
        return this.teams;
    }
}

// Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store
// a list of teams that belong to the league.
//
// Your class should have a method to print out the teams in order,
// with the team at the top of the league printed first.
//
// Only teams of the same type should be added to any particular
// instance of the league class - the program should fail to compile
// if an attempt is made to add an incompatible team.
