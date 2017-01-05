package com.dscfgos.lol.model.endpoints.methods.current_game;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.PlatformId;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.current_game.CurrentGameInfo;

public class GetCurrentGameInfo extends CurrentGameApiMethod {

	public GetCurrentGameInfo(ApiConfig config, PlatformId platformId, long summonerId) {
		super(config);
		setRegion(Region.getRegionByPlatformId(platformId));
		setReturnType(CurrentGameInfo.class);
		setUrlBase(
				"https://" + platformId.getName() + ".api.pvp.net/observer-mode/rest/consumer/getSpectatorGameInfo/" + platformId.getId() + '/' + summonerId);
		addApiKeyParameter();
	}

}
