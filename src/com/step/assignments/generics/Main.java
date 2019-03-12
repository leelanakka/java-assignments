package com.step.assignments.generics;

public class Main {

    public static void main(String[] args) {

        System.out.println("*********** printing cricket teams ****************");
        FootBallTeam indXiF = new FootBallTeam("IND XI F", 1, -2, 0);
        indXiF.wonTheMatch();
        indXiF.wonTheMatch();
        indXiF.wonTheMatch();

        FootBallTeam ausXiF = new FootBallTeam("AUS XI F", 1, -2, 0);
        ausXiF.lostTheMatch();
        ausXiF.lostTheMatch();
        ausXiF.lostTheMatch();
        ausXiF.drawTheMatch();

        FootBallTeam rsaXiF = new FootBallTeam("RSA XI F", 1, -2, 0);
        rsaXiF.wonTheMatch();
        rsaXiF.wonTheMatch();
        rsaXiF.drawTheMatch();


        CricketTeam legends = new CricketTeam("legends", 2, 0, 1);
        legends.lostTheMatch();
        legends.lostTheMatch();
        legends.drawTheMatch();

        CricketTeam bahubali = new CricketTeam("bahubali", 2, 0, 1);
        bahubali.lostTheMatch();
        bahubali.lostTheMatch();
        bahubali.wonTheMatch();

        CricketTeam sparks = new CricketTeam("sparks", 2, 0, 1);
        sparks.wonTheMatch();
        sparks.wonTheMatch();
        sparks.drawTheMatch();

        LeagueTable<CricketTeam> cricketTeamLeagueTable = new LeagueTable<>();
        cricketTeamLeagueTable.addTeams(sparks);
        cricketTeamLeagueTable.addTeams(legends);
        cricketTeamLeagueTable.addTeams(bahubali);
        cricketTeamLeagueTable.printTeams();

        System.out.println("****************printing football teams*********");
        LeagueTable<FootBallTeam> footbalTeamLeauge = new LeagueTable<>();
        footbalTeamLeauge.addTeams(indXiF);
        footbalTeamLeauge.addTeams(ausXiF);
        footbalTeamLeauge.addTeams(rsaXiF);
        footbalTeamLeauge.printTeams();

    }
}
