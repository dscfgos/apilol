package com.dscfgos.lol.model.endpoints.methods.league;

import java.util.List;
import java.util.Map;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.league.League;
import com.google.gson.reflect.TypeToken;

public class GetLeagueEntryBySummoners extends LeagueApiMethod {

	public GetLeagueEntryBySummoners(ApiConfig config, Region region, String summonerIds) {
		super(config);
		setRegion(region);
		setReturnType(new TypeToken<Map<String, List<League>>>() {
		}.getType());
		setUrlBase(region.getEndpoint() + "/v2.5/league/by-summoner/" + summonerIds + "/entry");
		addApiKeyParameter();
	}

}
