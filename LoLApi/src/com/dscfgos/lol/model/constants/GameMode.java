package com.dscfgos.lol.model.constants;

public enum GameMode {
	CLASSIC("CLASSIC","Classic Summoner's Rift and Twisted Treeline games"),
	ODIN("ODIN","Dominion/Crystal Scar games"),
	ARAM("ARAM","ARAM games"),
	TUTORIAL("TUTORIAL","Tutorial games"),
	ONEFORALL("ONEFORALL","One for All games"),
	ASCENSION("ASCENSION","Ascension games"),
	FIRSTBLOOD("FIRSTBLOOD","Snowdown Showdown games"),
	KINGPORO("KINGPORO","King Poro games"),
	SIEGE("SIEGE","Nexus Siege games");
	
	private String name ;
	private String description ;
	GameMode(String name, String description) 
	{
        this.name 			= name;
        this.description 	= description;
    }
	
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}

	
}
