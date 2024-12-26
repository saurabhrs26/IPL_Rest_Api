package com.pckg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pckg.dao.TeamDao;

import com.pckg.model.Team;

@Service
public class TeamService {
	@Autowired
	TeamDao teamdao;

	public String addTeam(Team team) {
		String res = teamdao.addTeam(team);
		return res;
	}

	public ArrayList<Team> showTeam() {
		ArrayList<Team> al = teamdao.showTeam();
		return al;
	}

	public Team getTeamById(int id) {
		return teamdao.getTeamById(id);
	}

	public String deleteTeam(int id) {
		String ans = teamdao.deleteTeam(id);
		return ans;

	}

	public String updateTeam(int id, Team team) {
		String result = teamdao.updateTeam(id, team);
		return result;
	}

}
