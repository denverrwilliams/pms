package com.kaizen.pms.domain;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.util.StringUtils;

public class Guardian extends Person {
	
	private List<Player> players = new ArrayList<Player>();
	
	public Guardian(GuardianBuilder builder) {
		
		super(new Name.NameBuilder().firstName(builder.firstName).
				middleName(builder.middleName).lastName(builder.lastName).build(),
				new PartyType(Party.PARTY_TYPE_PER_GUARDIAN),
				builder.gender, builder.dateOfBirth);
		
		// optional parameters		
		if( builder.players!=null && !builder.players.isEmpty() ) {
			this.players.addAll( builder.players );
		}
	}
	
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
	
	//Builder Class
	public static class GuardianBuilder{

		// required parameters
		private String firstName;
		private String middleName;
		private String lastName;
		private GenderType gender;
		private Date dateOfBirth;
		
		// optional parameters
		protected List<Player> players = new ArrayList<Player>();
				
		public GuardianBuilder(String firstName, String middleName, 
				String lastName, GenderType gender) {
			
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.gender = gender;
		}
		
		public GuardianBuilder playerId(Date dob) {
			this.dateOfBirth = dob;
			return this;
		}
		public GuardianBuilder players(List<Player> players) {
			if( players!=null && !players.isEmpty() ) {
				this.players.addAll(players);
			}
			return this;
		}
		public GuardianBuilder player(Player player) {
			if(player!=null) {
				this.players.add(player);
			}
			return this;
		}
				
		public Guardian build(){
			return new Guardian(this);
		}
	}
}
