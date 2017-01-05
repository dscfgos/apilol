package com.dscfgos.lol.model.constants;

public enum Region 
{
	BR("BR1", "br.api.pvp.net", "br"),
	EUNE("EUNE1", "eune.api.pvp.net", "eune"),
	EUW("EUW1", "euw.api.pvp.net", "euw"),
	JP("JP1", "jp.api.pvp.net", "jp"),
	KR("KR", "kr.api.pvp.net", "kr"),
	LAN("LA1", "lan.api.pvp.net", "lan"),
	LAS("LA2", "las.api.pvp.net", "las"),
	NA("NA1", "na.api.pvp.net", "na"),
	OCE("OC1", "oce.api.pvp.net", "oce"),
	TR("TR1", "tr.api.pvp.net", "tr"),
	RU("RU", "ru.api.pvp.net", "ru"),
	PBE("PBE1", "pbe.api.pvp.net", "pbe"),
	GLOBAL("GLOBAL", "global.api.pvp.net", "global");
	
	private String id ;
	private String endpoint;
	private String region;
	
	Region(String id, String endpoint, String region) 
	{
        this.id 			= id;
        this.region 		= region;
        this.endpoint 		= endpoint;
    }
	
	public String getId() {
		return id;
	}
	public String getRegion() {
		return region;
	}
	public String getEndpoint() {
		return getEndpoint(true);
	}
	
	
	public static Region getRegionByName(String name) 
	{
		Region result = null;
		for (Region region : Region.values()) 
		{
			if (region.getRegion().equals(name.toLowerCase())) 
			{
				result = region;
				break;
			}
		}
		
		return result;
	}

	public static Region getRegionByPlatformId(PlatformId platformId) 
	{
		return getRegionByName(platformId.getName());
	}
	
	public String getEndpoint(boolean withRegion) 
	{
		String url = "https://" + endpoint + "/api/lol/";
		if (withRegion) 
		{
			url += getRegion();
		}
		return url;
	}

	@Override
	public String toString() {
		return getRegion();
	}
	
}
