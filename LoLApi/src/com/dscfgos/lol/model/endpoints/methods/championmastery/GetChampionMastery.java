package com.dscfgos.lol.model.endpoints.methods.championmastery;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.PlatformId;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.champion_mastery.ChampionMastery;

public class GetChampionMastery extends ChampionMasteryApiMethod {

	public GetChampionMastery(ApiConfig config, PlatformId platformId, long summonerId, long championId) {
		super(config);
		setRegion(Region.getRegionByPlatformId(platformId));
		setReturnType(ChampionMastery.class);
		setUrlBase("https://" + platformId.getName() + ".api.pvp.net/championmastery/location/" + platformId.getId() + "/player/" + summonerId + "/champion/"
				+ championId);
		addApiKeyParameter();
	}

}
