package in.swapnilsingh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");
        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        hawthorn.matchResult(freemantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(freemantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(freemantle);
//        footballLeague.add(baseballPlayerTeam);
        footballLeague.showLeagueTable();
    }
}
