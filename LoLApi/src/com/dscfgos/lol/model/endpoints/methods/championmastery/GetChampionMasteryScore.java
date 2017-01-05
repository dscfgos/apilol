package com.dscfgos.lol.model.endpoints.methods.championmastery;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.PlatformId;
import com.dscfgos.lol.model.constants.Region;

public class GetChampionMasteryScore extends ChampionMasteryApiMethod {

	public GetChampionMasteryScore(ApiConfig config, PlatformId platformId, long summonerId) {
		super(config);
		setRegion(Region.getRegionByPlatformId(platformId));
		setReturnType(Integer.class);
		setUrlBase("https://" + platformId.getName() + ".api.pvp.net/championmastery/location/" + platformId.getId() + "/player/" + summonerId + "/score");
		addApiKeyParameter();
	}

}
