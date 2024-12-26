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

import com.pckg.model.Match;
import com.pckg.service.MatchService;


@RestController
@RequestMapping("/api/")
public class MatchController {
	
	@Autowired
	MatchService matchservice;
	
	@PostMapping("matches")
	public String showAllMatch(@RequestBody Match newmatch)
	{
		String res=matchservice.addMatch(newmatch);
		return res;
		
	}
	
	@GetMapping("matches")
	public ArrayList<Match> displayAllMatch()
	{
		 ArrayList<Match> al=matchservice.displayAllMatch();
		 return al;
	}
	
	@GetMapping("matches/{id}")
	public Object getMatchById(@PathVariable int id)
	{
		Match match=matchservice.getMatchById(id);
		if(match!=null)
		{
			return match;
		}
		else
		{
			return "Match not found";
		}
		
	}
	
	@DeleteMapping("matches/{id}")
	public String deleteMatchByid(@PathVariable  int id)
	{
		String res=matchservice.deleteMatchByid(id);
		return res;
	}
	
	@PutMapping("matches/{id}")
	public String updateMatch(@RequestBody Match newMatch,@PathVariable int id)
	{
		String result=matchservice.updateMatch(newMatch, id);
		return result;
		
	}

}
