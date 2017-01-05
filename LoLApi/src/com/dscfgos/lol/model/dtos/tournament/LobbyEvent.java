package com.dscfgos.lol.model.dtos.tournament;

public class LobbyEvent 
{
	private String eventType;
	private String summonerId;
	private String timestamp;

	public String getEventType() {
		return eventType;
	}

	public String getSummonerId() {
		return summonerId;
	}

	public String getTimestamp() {
		return timestamp;
	}

	@Override
	public String toString() {
		return getEventType();
	}
}
