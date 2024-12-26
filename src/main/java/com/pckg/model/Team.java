package com.pckg.model;

public class Team {
	int teamId;
	String name;
	String city;
	String coach;
	
	public Team() {
		super();
	}

	public Team(int teamId, String name, String city, String coach) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.city = city;
		this.coach = coach;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [Id=" + teamId + ", Name=" + name + ", City=" + city + ", Coach=" + coach + "]";
	}
	
	
	

}
