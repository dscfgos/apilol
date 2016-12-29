package com.dscfgos.lol.model.constants;

public enum Map 
{
	SUMMONERS_RIFT_SUMMER(1, "SUMMONERS_RIFT_SUMMER" , "Summoner's Rift Original Summer Variant"),
	SUMMONERS_RIFT_AUTUMN(2, "SUMMONERS_RIFT_AUTUMN" , "Summoner's Rift Original Autumn Variant"),
	PROVING_GROUNDS(3, "PROVING_GROUNDS", "The Proving Grounds Tutorial Map"),
	TUTORIAL(3, "TUTORIAL", "Tutotial Map"),
	TWISTED_TREELINE_ORIGINAL(4, "TWISTED_TREELINE_ORIGINAL",  "Twisted Treeline Original Version"),
	CRYSTAL_SCAR(8, "CRYSTAL_SCAR", "The Crystal Scar"),
	DOMINION(8, "DOMINION",  "Dominion Map"),
	TWISTED_TREELINE_CURRENT(10, "TWISTED_TREELINE_CURRENT", "Twisted Treeline	Current Version"),
    SUMMONERS_RIFT_CURRENT(11, "SUMMONERS_RIFT_CURRENT", "Summoner's Rift Current Version"),
	ARAM(12, "ARAM", "ARAM Map"),
	HOWLING_ABYSS(12, "HOWLING_ABYSS", "Howling Abyss"),
	BUTCHERS_BRIDGE(14,"BUTCHERS_BRIDGE", "Butcher's Bridge	ARAM Map");
	
	private int id;
	private String name;
	private String description ;

	Map(int id, String name, String description) 
	{
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return this.getName();
	}
	
	public static Map getMapById(int mapId)
	{
		Map result= null;
		for (Map map : Map.values()) 
		{
			if (mapId == map.getId()) 
			{
				result = map;
				break;
			}
		}
		
		return result;
	}
}
