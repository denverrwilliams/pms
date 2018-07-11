package com.kaizen.pms.domain;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

public class Guardian extends Person {
	
	private List<Player> players = new ArrayList<Player>();
	
	public Player getPlayer(Long playerId) {
		return null;
	}

	public void addPlayer(Player player) {
		
		if(player == null) {
			throw new InvalidParameterException("Player cannot be null");
		}
		
		// add player to database then add to player collection
		//TODO:: add player to database
		
		//add player to collection
		players.add(player);
		
	}
	
	public void removePlayer(String playerId) {
		
		if(StringUtils.isEmpty(playerId)) {
			throw new InvalidParameterException("Player Id cannot be null or empty");
		}
		
		// add player to database then add to player collection
		//TODO:: add player to database
		Player player = null;
		
		//add player to collection
		players.remove(player);
	}
}
