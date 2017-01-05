package com.dscfgos.lol.model.endpoints.methods.tournament;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.classes.api.UrlParameter;
import com.dscfgos.lol.model.classes.api.request.RequestMethod;
import com.dscfgos.lol.model.constants.PickType;
import com.dscfgos.lol.model.constants.SpectatorType;
import com.dscfgos.lol.model.constants.TournamentMap;
import com.google.gson.reflect.TypeToken;

public class CreateTournamentCodes extends TournamentApiMethod {

	public CreateTournamentCodes(ApiConfig config, int tournamentId, int count, int teamSize, TournamentMap mapType, PickType pickType,
		SpectatorType spectatorType, String metaData, long... allowedSummonerIds) {
		super(config);
		setMethod(RequestMethod.POST);
		setReturnType(new TypeToken<List<String>>() {
		}.getType());
		setUrlBase("https://global.api.pvp.net/tournament/public/v1/code");
		add(new UrlParameter("tournamentId", tournamentId));
		add(new UrlParameter("count", count));
		addTournamentApiKeyParameter();
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("teamSize", teamSize);
		body.put("mapType", mapType);
		body.put("pickType", pickType);
		body.put("spectatorType", spectatorType);
		if (metaData != null) {
			body.put("metaData", metaData);
		}
		if (allowedSummonerIds != null && allowedSummonerIds.length > 0) {
			HashMap<String, Object> allowedSummonerIdsMap = new HashMap<String, Object>();
			allowedSummonerIdsMap.put("participants", allowedSummonerIds);
			body.put("allowedSummonerIds", allowedSummonerIdsMap);
		}
		buildJsonBody(body);
	}

}
