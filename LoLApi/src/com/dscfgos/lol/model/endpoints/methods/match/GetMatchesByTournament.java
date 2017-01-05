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

package com.dscfgos.lol.model.endpoints.methods.match;

import java.util.List;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.constants.Region;
import com.google.gson.reflect.TypeToken;

public class GetMatchesByTournament extends MatchApiMethod {

	public GetMatchesByTournament(ApiConfig config, Region region, String tournamentCode) {
		super(config);
		setRegion(region);
		setReturnType(new TypeToken<List<Long>>() {
		}.getType());
		setUrlBase(region.getEndpoint() + "/v2.2/match/by-tournament/" + tournamentCode + "/ids");
		addTournamentApiKeyParameter();
	}
}