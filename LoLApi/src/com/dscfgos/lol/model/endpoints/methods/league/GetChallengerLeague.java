package com.dscfgos.lol.model.endpoints.methods.league;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.classes.api.UrlParameter;
import com.dscfgos.lol.model.constants.QueueType;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.league.League;

public class GetChallengerLeague extends LeagueApiMethod {

	public GetChallengerLeague(ApiConfig config, Region region, QueueType queueType) {
		super(config);
		setRegion(region);
		setReturnType(League.class);
		setUrlBase(region.getEndpoint() + "/v2.5/league/challenger");
		add(new UrlParameter("type", queueType.name()));
		addApiKeyParameter();
	}

}
