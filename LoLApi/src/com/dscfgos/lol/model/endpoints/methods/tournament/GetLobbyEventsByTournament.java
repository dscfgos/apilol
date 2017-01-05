package com.dscfgos.lol.model.endpoints.methods.tournament;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.dtos.tournament.LobbyEventList;

public class GetLobbyEventsByTournament extends TournamentApiMethod 
{

	public GetLobbyEventsByTournament(ApiConfig config, String tournamentCode) {
		super(config);
		setReturnType(LobbyEventList.class);
		setUrlBase("https://global.api.pvp.net/tournament/public/v1/lobby/events/by-code/" + tournamentCode);
		addTournamentApiKeyParameter();
	}

}
