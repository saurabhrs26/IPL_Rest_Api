package com.pckg.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.pckg.model.Match;

@Repository
public class MatchDao {
	ArrayList<Match> match = new ArrayList<Match>();

	MatchDao() {
		match.add(new Match(1, 1, 2, "24-02-2023", "Mumbai", "Drawn"));
		match.add(new Match(2, 3, 4, "26-02-2023", "Pune", "Team-1 won"));

	}

	public String addMatch(Match newmatch) {
		match.add(newmatch);
		return "new match data added";
	}

	public ArrayList<Match> displayAllMatch()

	{
		return match;
	}

	public Match getMatchById(int id) {
		for (Match match2 : match) {
			if (match2.getMatchId() == id) {
				return match2;
			}
		}
		return null;
	}

	public String deleteMatchByid(int id) {
		for (int i = 0; i < match.size(); i++) {
			if (match.get(i).getMatchId() == id) {
				match.remove(i);
				return "Match removed successfully";
			}

		}

		return "invalid id";

	}
	
	public String updateMatch(Match newMatch, int id)
	{
		for(int i=0;i<match.size();i++)
		{
			if(match.get(i).getMatchId()==id)
			{
				match.set(i, newMatch);
				return "Match details updated successfully";
			}
		}
		return "Invalid ID";
	}

}
