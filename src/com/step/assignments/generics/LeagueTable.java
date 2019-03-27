package com.step.assignments.generics;

import java.util.ArrayList;

class LeagueTable<T> {

    private ArrayList<T> teams;

    LeagueTable() {
        this.teams = new ArrayList<T>();
    }

    void addTeams(T team) {
        this.teams.add(team);
    }

    void printTeams() {
        this.sortArray();
        for (T team1 : this.teams) {
            Team team = (Team) team1;
            System.out.println(team.getTeamName());
        }
    }

    private ArrayList sortArray() {

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
