package com.dscfgos.lol.model.dtos.tournament;

import java.util.List;

public class LobbyEventList 
{
	private List<LobbyEvent> eventList;

	public List<LobbyEvent> getEventList() {
		return eventList;
	}

	@Override
	public String toString() {
		return getEventList().toString();
	}
}
