package com.dscfgos.lol.model.endpoints.methods.championmastery;

import java.util.List;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.PlatformId;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.champion_mastery.ChampionMastery;
import com.google.gson.reflect.TypeToken;

public class GetChampionMasteries extends ChampionMasteryApiMethod {

	public GetChampionMasteries(ApiConfig config, PlatformId platformId, long summonerId) {
		super(config);
		setRegion(Region.getRegionByPlatformId(platformId));
		setReturnType(new TypeToken<List<ChampionMastery>>() {
		}.getType());
		setUrlBase("https://" + platformId.getName() + ".api.pvp.net/championmastery/location/" + platformId.getId() + "/player/" + summonerId + "/champions");
		addApiKeyParameter();
	}

}
