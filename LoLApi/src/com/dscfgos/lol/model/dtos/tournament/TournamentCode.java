package com.dscfgos.lol.model.dtos.tournament;

import java.util.Set;

public class TournamentCode {
	private String code;
	private int id;
	private String lobbyName;
	private String map;
	private String metaData;
	private Set<Long> participants;
	private String password;
	private String pickType;
	private int providerId;
	private String region;
	private String spectators;
	private int teamSize;
	private int tournamentId;

	public String getCode() {
		return code;
	}

	public int getId() {
		return id;
	}

	public String getLobbyName() {
		return lobbyName;
	}

	public String getMap() {
		return map;
	}

	public String getMetaData() {
		return metaData;
	}

	public Set<Long> getParticipants() {
		return participants;
	}

	public String getPassword() {
		return password;
	}

	public String getPickType() {
		return pickType;
	}

	public int getProviderId() {
		return providerId;
	}

	public String getRegion() {
		return region;
	}

	public String getSpectators() {
		return spectators;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public int getTournamentId() {
		return tournamentId;
	}

	@Override
	public String toString() {
		return getCode();
	}
}
