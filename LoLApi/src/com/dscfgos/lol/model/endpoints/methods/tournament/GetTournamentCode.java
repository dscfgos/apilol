package com.dscfgos.lol.model.endpoints.methods.tournament;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.dtos.tournament.TournamentCode;

public class GetTournamentCode extends TournamentApiMethod 
{
	public GetTournamentCode(ApiConfig config, String tournamentCode) {
		super(config);
		setReturnType(TournamentCode.class);
		setUrlBase("https://global.api.pvp.net/tournament/public/v1/code/" + tournamentCode);
		addTournamentApiKeyParameter();
	}

}
