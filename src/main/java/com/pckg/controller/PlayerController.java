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

import com.pckg.model.Players;
import com.pckg.service.PlayerService;

@RestController
@RequestMapping("/api/")
public class PlayerController {
	@Autowired
	PlayerService service;
	
	@PostMapping("players")
	public String getPlayer(@RequestBody Players player)
	{
		String res=service.addPlayer(player);
		return res;
	}
	
	@GetMapping("players")
	public ArrayList<Players> showPlayers()
	{
		ArrayList<Players> al=service.showPlayers();
		return al;
	}
	
	@GetMapping("players/{id}")
	public Object getPlayer(@PathVariable  int id)
	{
	  return service.getPlayer(id);
	}
	
	@DeleteMapping("players/{id}")
	public String deletePlayer(@PathVariable  int id)
	{
		String result=service.deletePlayer(id);
		return result;
	}
	
	@PutMapping("players/{id}")
	public String updatePlayer(@RequestBody Players player,@PathVariable int id)
	{
		
		String result=service.updatePlayer(player, id);
		return result;
		
	}
	
	
	

}
