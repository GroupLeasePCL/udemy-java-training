public class Main {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer peter = new BaseballPlayer("Peter");
        SoccerPlayer  beckham = new SoccerPlayer("Beckham");

        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(peter);
        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(peter);

        Team<SoccerPlayer>  brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer>  melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> framantle = new Team<>("Framantle");

        hawthorn.matchResult(framantle,1,0);
        hawthorn.matchResult(adelaideCrows,3,8);

        adelaideCrows.matchResult(framantle,2,1);
        adelaideCrows.matchResult(baseballTeam,1,1);
     }
}
