package com.dscfgos.lol.model.endpoints.methods.champion;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.champion.Champion;

public class GetChampionById extends ChampionApiMethod {

	public GetChampionById(ApiConfig config, Region region, int id) {
		super(config);
		setRegion(region);
		setReturnType(Champion.class);
		setUrlBase(region.getEndpoint() + "/v1.2/champion/" + id);
		addApiKeyParameter();
	}

}
