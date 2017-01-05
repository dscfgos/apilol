package com.dscfgos.lol.model.endpoints.methods.champion;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.classes.api.UrlParameter;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.champion.ChampionList;

public class GetChampions extends ChampionApiMethod {

	public GetChampions(ApiConfig config, Region region, boolean freeToPlay) {
		super(config);
		setRegion(region);
		setReturnType(ChampionList.class);
		setUrlBase(region.getEndpoint(true) + "/v1.2/champion");
		if (freeToPlay) {
			add(new UrlParameter("freeToPlay", freeToPlay));
		}
		addApiKeyParameter();
	}

}
