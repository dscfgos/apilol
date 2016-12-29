package com.dscfgos.lol.model.constants;

public enum PlayerStatSummaryType 
{
	Unranked("Unranked", "Summoner's Rift Unranked"),
	Unranked3x3("Unranked3x3", "Twisted Treeline Unranked"),
	OdinUnranked("OdinUnranked", "Dominion/Crystal Scar"),
	AramUnranked5x5("AramUnranked5x5", "ARAM / Howling Abyss"),
	CoopVsAI("CoopVsAI", "Summoner's Rift and Crystal Scar games played against AI"),
	CoopVsAI3x3("", "Twisted Treeline games played against AI"),

	RankedSolo5x5("RankedSolo5x5", "Summoner's Rift ranked solo queue games"),
	RankedTeam3x3("RankedTeam3x3", "Twisted Treeline ranked team games"),
	RankedTeam5x5("RankedTeam5x5", "Summoner's Rift ranked team games"),
	OneForAll5x5("OneForAll5x5", "One for All"),
	FirstBlood1x1("FirstBlood1x1", "Snowdown Showdown 1x1 games"),
	FirstBlood2x2("FirstBlood2x2", "Snowdown Showdown 2x2 games"),
	SummonersRift6x6("SummonersRift6x6", "Summoner's Rift 6x6 Hexakill games"),
	CAP5x5("CAP5x5", "Team Builder games"),
	URF("URF", "Ultra Rapid Fire games"),
	URFBots("URFBots", "Ultra Rapid Fire games played against AI"),
	NightmareBot("NightmareBot", "Summoner's Rift games played against Nightmare AI"),
	Ascension("Ascension", "Ascension games"),
	Hexakill("Hexakill", "Twisted Treeline 6x6 Hexakill games"),
	KingPoro("KingPoro", "King Poro games"),
	CounterPick("CounterPick", "Nemesis games"),
	Bilgewater("Bilgewater", "Black Market Brawlers games"),
	Siege("Siege", "Nexus Siege games"),
	RankedFlexTT("RankedFlexTT", "Ranked Flex Twisted Treeline games"),
	RankedFlexSR("RankedFlexSR", "Ranked Flex Summoner's Rift games");
	
	private String name;
	private String description;
	
	PlayerStatSummaryType(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return getName();
	}
}
