package com.pckg.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;


import com.pckg.model.Team;

@Repository
public class TeamDao {
	ArrayList<Team>teams=new ArrayList<Team>();
	
	TeamDao()
	{
		teams.add(new Team(1, "Royal Challengers Banglore", "Banglore", "ABD Villiers"));
		teams.add(new Team(2, "Mumbai Indains", "Mumbai", "Steve Smith"));
		
	}
	
	
	public String addTeam(Team team)
	{
		teams.add(team);
		return "Team added successfully";
	}
	
	public ArrayList<Team> showTeam()
	{
		return teams;
	}
	
	public Team getTeamById(int id)
	{
		for (Team team : teams) {
			if(team.getTeamId()==id)
			{
				return team;
			}
		}
		return null;
	}
	
	public String deleteTeam(int id)
	{
		for(int i=0;i<teams.size();i++)
		{
			if(teams.get(i).getTeamId()==id)
			{
				teams.remove(i);
				return "Team reoved successfully";
			}
		}
		return "Invalid id";
		
	}
	
	public String updateTeam(int id,Team team)
	{
		for(int i=0;i<teams.size();i++)
		{
			if(teams.get(i).getTeamId()==id)
			{
				teams.set(i, team);
				return "Team updated successfully";
			}
		}
		return "Invalid ID";
	}

}
