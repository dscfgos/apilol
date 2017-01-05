package com.dscfgos.lol.model.endpoints.methods.tournament;

import java.util.HashMap;
import java.util.Map;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.classes.api.request.RequestMethod;
import com.dscfgos.lol.model.constants.Region;

public class CreateProvider extends TournamentApiMethod 
{

	public CreateProvider(ApiConfig config, Region region, String callbackUrl) {
		super(config);
		setMethod(RequestMethod.POST);
		setReturnType(Integer.class);
		setUrlBase("https://global.api.pvp.net/tournament/public/v1/provider");
		addTournamentApiKeyParameter();
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("region", region.getRegion().toUpperCase());
		body.put("url", callbackUrl);
		buildJsonBody(body);
	}

}
