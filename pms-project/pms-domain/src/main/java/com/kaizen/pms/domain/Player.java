package com.kaizen.pms.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Player extends Person {

	private String playerId;
	private String jerseyNumber;
	private String competitionLevel;
	private String registrationStatus;
	private String profilePicture;
	private List<PlayerPosition> positions = new ArrayList<PlayerPosition>();
	
	private Affiliation affiliation;
	private School school;
		
	public Player(PlayerBuilder builder) {
		
		super(new Name.NameBuilder().firstName(builder.firstName).
				middleName(builder.middleName).lastName(builder.lastName).build(),
				new PartyType(Party.PARTY_TYPE_PER_PLAYER),
				builder.gender, builder.dateOfBirth);
		
		// optional parameters
		this.playerId = builder.playerId;
		this.jerseyNumber = builder.jerseyNumber;
		this.competitionLevel = builder.competitionLevel;
		this.profilePicture = builder.profilePicture;
		this.registrationStatus = builder.registrationStatus;
				
		if( builder.positions!=null && !builder.positions.isEmpty() ) {
			this.positions.addAll( builder.positions );
		}
		
		if( builder.addresses!=null && !builder.addresses.isEmpty() ) {
			this.addresses.addAll( builder.addresses );
		}
		
		if( builder.emails!=null && !builder.emails.isEmpty() ) {
			this.emails.addAll( builder.emails );
		}
		
		if( builder.phones!=null && !builder.phones.isEmpty() ) {
			this.phones.addAll( builder.phones );
		}
	}
		
	public String getPlayerId() {
		return playerId;
	}

	public String getJerseyNumber() {
		return jerseyNumber;
	}

	public String getCompetitionLevel() {
		return competitionLevel;
	}

	public String getRegistrationStatus() {
		return registrationStatus;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public List<PlayerPosition> getPositions() {
		return positions;
	}

	public Affiliation getAffiliation() {
		return affiliation;
	}

	public School getSchool() {
		return school;
	}

	//Builder Class
	public static class PlayerBuilder{

		// required parameters
		private String firstName;
		private String middleName;
		private String lastName;
		private GenderType gender;
		private Date dateOfBirth;
		
		// optional parameters
		private String playerId;
		private String jerseyNumber;
		private String competitionLevel;
		private String registrationStatus;
		private String profilePicture;
		private List<Address> addresses = new ArrayList<Address>();
		private List<PlayerPosition> positions = new ArrayList<PlayerPosition>();
		protected List<EmailAddress> emails = new ArrayList<EmailAddress>();
		protected List<PhoneNumber> phones = new ArrayList<PhoneNumber>();
		
		private Affiliation affiliation;
		private School school;
		
		public PlayerBuilder(String firstName, String middleName, String lastName,
				GenderType gender, Date dob) {
			this.firstName = firstName;
			this.middleName = middleName;
			this.lastName = lastName;
			this.gender = gender;
			this.dateOfBirth = dob;
		}
		
		public PlayerBuilder playerId(String playerId) {
			this.playerId = playerId;
			return this;
		}
		public PlayerBuilder jerseyNumber(String jerseyNumber) {
			this.jerseyNumber = jerseyNumber;
			return this;
		}
		public PlayerBuilder competitionLevel(String competitionLevel) {
			this.competitionLevel = competitionLevel;
			return this;
		}
		public PlayerBuilder profilePicture(String profilePicture) {
			this.profilePicture = profilePicture;
			return this;
		}
		public PlayerBuilder registrationStatus(String registrationStatus) {
			this.registrationStatus = registrationStatus;
			return this;
		}		
		public PlayerBuilder addresses(List<Address> addresses) {
			if( addresses!=null && !addresses.isEmpty() ) {
				this.addresses.addAll(addresses);
			}
			return this;
		}
		public PlayerBuilder address(Address address) {
			if(address!=null) {
				this.addresses.add(address);
			}
			return this;
		}	
		public PlayerBuilder positions(List<PlayerPosition> positions) {
			if( positions!=null && !positions.isEmpty() ) {
				this.positions.addAll(positions);
			}
			return this;
		}
		public PlayerBuilder position(PlayerPosition position) {
			if(position!=null) {
				this.positions.add(position);
			}
			return this;
		}		
		public PlayerBuilder emails(List<EmailAddress> emails) {
			if( emails!=null && !emails.isEmpty() ) {
				this.emails.addAll(emails);
			}
			return this;
		}
		public PlayerBuilder email(EmailAddress email) {
			if(email!=null) {
				this.emails.add(email);
			}
			return this;
		}
		public PlayerBuilder phones(List<PhoneNumber> phones) {
			if( phones!=null && !phones.isEmpty() ) {
				this.phones.addAll(phones);
			}
			return this;
		}
		public PlayerBuilder email(PhoneNumber phone) {
			if(phone!=null) {
				this.phones.add(phone);
			}
			return this;
		}
				
		public Player build(){
			return new Player(this);
		}
	}
	
}
