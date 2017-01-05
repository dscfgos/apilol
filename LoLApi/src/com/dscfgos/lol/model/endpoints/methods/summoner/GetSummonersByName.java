/*
 * Copyright 2016 Taylor Caldwell
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dscfgos.lol.model.endpoints.methods.summoner;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.logging.Level;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.classes.api.RiotApi;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.dtos.summoner.Summoner;
import com.dscfgos.lol.utils.Convert;
import com.google.gson.reflect.TypeToken;

public class GetSummonersByName extends SummonerApiMethod {

	public GetSummonersByName(ApiConfig config, Region region, String summonerNames) {
		super(config);
		setRegion(region);
		summonerNames = Convert.normalizeSummonerName(summonerNames);
		setReturnType(new TypeToken<Map<String, Summoner>>() {
		}.getType());
		try {
			setUrlBase(region.getEndpoint() + "/v1.4/summoner/by-name/" + URLEncoder.encode(summonerNames, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// This should never happen
			RiotApi.log.log(Level.SEVERE, "URL Encoding Failed", e);
		}
		addApiKeyParameter();
	}
}