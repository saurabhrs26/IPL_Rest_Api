package com.pckg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pckg.dao.MatchDao;
import com.pckg.model.Match;

@Service
public class MatchService {
@Autowired
MatchDao matchdao;

public String addMatch(Match newmatch)
{
	String res=matchdao.addMatch(newmatch);
	return res;
}

public ArrayList<Match> displayAllMatch()
{
	ArrayList<Match> al=matchdao.displayAllMatch();
	return al;
}

public Match getMatchById(int id)
{
	Match match=matchdao.getMatchById(id);
	return match;
}
public String deleteMatchByid(int id)
{
	String result=matchdao.deleteMatchByid(id);
	return result;
}

public String updateMatch(Match newMatch, int id)
{
	String result=matchdao.updateMatch(newMatch, id);
	return result;
}
}
