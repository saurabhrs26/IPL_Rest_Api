package com.pckg.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;


import com.pckg.model.Players;

@Repository
public class PlayerDao {
	ArrayList<Players>players=new ArrayList<Players>();
	
	public String addPlayer(Players player)
	{
		players.add(player);
		return "Player added";
	}
	public ArrayList<Players> showPlayers()
	{
		return players;
	}
	
    public Object getPlayer(int id)
    {
       for(int i=0;i<players.size();i++)
       {
    	   if(id==players.get(i).getPlayerId())
    	   {
    		 return  players.get(i);
    	   }
    	 
       }
       return "Player not found";
	
    }
    
    public String deletePlayer(int id)
    {
    	for(int i=0;i<players.size();i++)
    	{
    		if(players.get(i).getPlayerId()==id)
    		{
    			players.remove(i);
    			return "Player deleted sucessfully";
    		}
    	}
    	return "Invalid id";
    }
    
    public String updatePlayer( Players player, int id)
    {
    	for(int i=0;i<players.size();i++)
    	{
    		if(players.get(i).getPlayerId()==id)
    		{
    			players.set(i, player);
    			return "Player updated";
    		}
    	}
    	return "Invalid ID";
    }
    
	
	
}
