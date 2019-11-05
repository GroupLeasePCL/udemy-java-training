package com.company;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footBallLeague = new League<>("Khmer I");
        Team<FootballPlayer> f1 = new Team<>("fPlayer1");
        Team<FootballPlayer> f2 = new Team<>("fPlayer2");
        Team<FootballPlayer> f3 = new Team<>("fPlayer3");
        Team<TenisPlayer> t1 = new Team<>("tPlayer1");

        f1.mathResult(f2, 3, 2);
        f1.mathResult(f3, 4, 5);

        footBallLeague.add(f1);
        footBallLeague.add(f2);
        footBallLeague.add(f3);
//        footBallLeague.add(t1);

        footBallLeague.showLeagueTable();



    }
}
