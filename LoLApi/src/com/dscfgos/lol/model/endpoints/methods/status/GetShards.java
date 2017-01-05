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

package com.dscfgos.lol.model.endpoints.methods.status;

import java.util.List;

import com.dscfgos.lol.model.classes.api.ApiConfig;
import com.dscfgos.lol.model.dtos.status.Shard;
import com.google.gson.reflect.TypeToken;

public class GetShards extends StatusApiMethod {

	public GetShards(ApiConfig config) {
		super(config);
		setReturnType(new TypeToken<List<Shard>>() {
		}.getType());
		setUrlBase("http://status.leagueoflegends.com/shards");
	}
}