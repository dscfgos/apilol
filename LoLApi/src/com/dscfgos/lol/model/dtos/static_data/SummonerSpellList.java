package com.dscfgos.lol.model.dtos.static_data;

import java.util.Map;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains summoner spell list data.
 */
public class SummonerSpellList 
{
	private Map<String, SummonerSpell> data;
	private String                     type;
	private String                     version;
	public Map<String, SummonerSpell> getData() {
		return data;
	}
	public void setData(Map<String, SummonerSpell> data) {
		this.data = data;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}
