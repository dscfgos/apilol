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

package com.dscfgos.lol.model.endpoints.methods.stats;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.classes.api.UrlParameter;
import com.dscfgos.lol.model.constants.Region;
import com.dscfgos.lol.model.constants.Season;
import com.dscfgos.lol.model.dtos.stats.RankedStats;

public class GetRankedStats extends StatsApiMethod {

	public GetRankedStats(ApiConfig config, Region region, Season season, long summonerId) {
		super(config);
		setRegion(region);
		setReturnType(RankedStats.class);
		setUrlBase(region.getEndpoint() + "/v1.3/stats/by-summoner/" + summonerId + "/ranked");
		if (season != null) {
			add(new UrlParameter("season", season));
		}
		addApiKeyParameter();
	}
}