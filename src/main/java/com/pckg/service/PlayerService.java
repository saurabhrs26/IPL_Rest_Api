package com.pckg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pckg.dao.PlayerDao;
import com.pckg.model.Players;

@Service
public class PlayerService {
@Autowired
PlayerDao playerdao;

public String addPlayer(Players player)
{
	String res=playerdao.addPlayer(player);
	return res;
}

public ArrayList<Players> showPlayers()
{
	 ArrayList<Players> al=playerdao.showPlayers();
	 return al;
}
public Object getPlayer(int id)
{
  return playerdao.getPlayer(id);
}

public String deletePlayer(int id)
{
	String result=playerdao.deletePlayer(id);
	return result;
}

public String updatePlayer( Players player, int id)
{
	String result=playerdao.updatePlayer(player, id);
	return result;

}
}
