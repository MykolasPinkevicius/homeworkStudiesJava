package sport;


public class Main {

	public static void main (String []args) {
		
		FootballPlayer joe = new FootballPlayer("Joe");
		League<Team1<FootballPlayer>> footballLeague = new League<>("AFL");	
		Team1<FootballPlayer> adelaineCrows = new Team1<>("Adelaine Crows");
		adelaineCrows.addPlayer(joe);
		Team1<FootballPlayer> jumboKings = new Team1<>("Jumbo Kings");
		adelaineCrows.addPlayer(joe);
		
		footballLeague.addTeam(adelaineCrows);
		footballLeague.addTeam(jumboKings);
		
		adelaineCrows.matchResults(jumboKings, 3, 5);
		jumboKings.matchResults(adelaineCrows, 3, 3);
		
		adelaineCrows.matchResults(jumboKings, 1, 3);
		jumboKings.matchResults(adelaineCrows, 4, 6);
		
		adelaineCrows.matchResults(jumboKings, 3, 8);
		jumboKings.matchResults(adelaineCrows, 3, 3);
		
		adelaineCrows.matchResults(jumboKings, 2, 6);
		jumboKings.matchResults(adelaineCrows, 3, 4);
		
		
		footballLeague.showLeagueTable();
	}
}
