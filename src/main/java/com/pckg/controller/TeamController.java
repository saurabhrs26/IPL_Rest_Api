package com.pckg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pckg.model.Team;
import com.pckg.service.TeamService;

@RestController
@RequestMapping("/api/")
public class TeamController {
	@Autowired
	TeamService teamservice;
	@PostMapping("teams")
	public String addTeam(@RequestBody Team team)
	{
		
		String res=teamservice.addTeam(team);
		return res;
	}
	
	@GetMapping("teams")
	public ArrayList<Team> showTeam()
	{
		ArrayList<Team> al=teamservice.showTeam();
		return al;
	}
	@GetMapping("teams/{id}")
	public Object getTeamByid(@PathVariable  int id)
	{
		Team team=teamservice.getTeamById(id);
		if(team!=null)
		{
			return team;
		}
		else
			return "Team not found";
	}
	
	@DeleteMapping("teams/{id}")
	public String deleteTeam(@PathVariable  int id)
	{
			String ans=teamservice.deleteTeam(id);
			return ans;
		
	}
	
	@PutMapping("teams/{id}")
	public String updateTeam(@PathVariable int id,@RequestBody Team team)
	{
		String result=teamservice.updateTeam(id, team);
		return result;
	}
	
	
	
}
