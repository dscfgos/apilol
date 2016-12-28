package com.dscfgos.lol.model.constants;

public enum SubType {
	NONE("NONE","Custom games"),
	NORMAL("NORMAL","Summoner's Rift unranked games"),
	NORMAL_3x3("NORMAL_3x3","Twisted Treeline unranked games"),
	ODIN_UNRANKED("ODIN_UNRANKED","Dominion/Crystal Scar games"),
	ARAM_UNRANKED_5x5("ARAM_UNRANKED_5x5","ARAM / Howling Abyss games"),
	BOT("BOT","Summoner's Rift and Crystal Scar games played against Intro, Beginner, or Intermediate AI"),
	BOT_3x3("BOT_3x3","Twisted Treeline games played against AI"),
	RANKED_SOLO_5x5("RANKED_SOLO_5x5","Summoner's Rift ranked solo 5v5 games from earlier seasons and Summoner's Rift ranked solo games from current season that use Team Builder matchmaking"),
	RANKED_TEAM_3x3("RANKED_TEAM_3x3","Twisted Treeline ranked team games"),
	RANKED_TEAM_5x5("RANKED_TEAM_5x5","Summoner's Rift ranked team games"),
	ONEFORALL_5x5("ONEFORALL_5x5","One for All games"),
	FIRSTBLOOD_1x1("FIRSTBLOOD_1x1","Snowdown Showdown 1x1 games"),
	FIRSTBLOOD_2x2("FIRSTBLOOD_2x2","Snowdown Showdown 2x2 games"),
	SR_6x6("SR_6x6","Summoner's Rift 6x6 Hexakill games"),
	CAP_5x5("CAP_5x5","Team Builder games"),
	URF("URF","Ultra Rapid Fire games"),
	URF_BOT("URF_BOT","Ultra Rapid Fire games played against AI"),
	NIGHTMARE_BOT("NIGHTMARE_BOT","Summoner's Rift games played against Nightmare AI"),
	ASCENSION("ASCENSION","Ascension games"),
	HEXAKILL("HEXAKILL","Twisted Treeline 6x6 Hexakill games"),
	KING_PORO("KING_PORO","King Poro games"),
	COUNTER_PICK("COUNTER_PICK","Nemesis games"),
	BILGEWATER("BILGEWATER","Black Market Brawlers games"),
	SIEGE("SIEGE","Nexus Siege games"),
	RANKED_FLEX_TT("RANKED_FLEX_TT","Ranked Flex Twisted Treeline games"),
	RANKED_FLEX_SR("RANKED_FLEX_SR","Ranked Flex Summoner's Rift games");
	
	private String name ;
	private String description ;
	SubType(String name, String description) 
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
