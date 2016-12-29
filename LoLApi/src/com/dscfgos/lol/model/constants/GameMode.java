package com.dscfgos.lol.model.constants;

public enum GameMode {
	ARAM("ARAM","ARAM games"),
	ASCENSION("ASCENSION","Ascension games"),
	CLASSIC("CLASSIC","Classic Summoner's Rift and Twisted Treeline games"),
	FIRSTBLOOD("FIRSTBLOOD","Snowdown Showdown games"),
	KINGPORO("KINGPORO","King Poro games"),
	ODIN("ODIN","Dominion/Crystal Scar games"),
	ONEFORALL("ONEFORALL","One for All games"),
	SIEGE("SIEGE","Nexus Siege games"),
	TUTORIAL("TUTORIAL","Tutorial games");
	
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

	@Override
	public String toString() {
		return this.getName();
	}
	
}
