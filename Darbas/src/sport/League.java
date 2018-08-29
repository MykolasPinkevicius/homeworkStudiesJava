package sport;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("rawtypes")
public class League<T extends Team1> {

	private String name;
	
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	private ArrayList<T> teams = new ArrayList<>();

	public League(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addTeam(T team) {
		if (teams.contains(team)) {
			System.out.println((team).getName() + " is already on a league");
			return false;
		} else {
			teams.add(team);
			System.out.println((team).getName() + " was added for the league" + this.name);
			return true;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void showLeagueTable() {
		Collections.sort(teams);
		for (T t : teams) {
			System.out.println(t.getName() + " " + t.ranking());
		}
	}
	
	
	public void matchResults(League<T> opponent, int ourScore, int theirScore) {

		String message;

		if (ourScore > theirScore) {
			won++;
			message = " beat ";
		} else if (ourScore == theirScore) {
			tied++;
			message = " drew with ";
		} else {
			lost++;
			message = " lost to ";
		}
		if (opponent != null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResults(null, theirScore, ourScore);
		}
	}

	public int numTeams() {
		return this.teams.size();
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}

//	@Override
//	public int compareTo(League<E> league) {
//		if (this.ranking() > league.ranking()) {
//			return -1;
//		} else if (this.ranking() > league.ranking()) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
}
