package com.dscfgos.lol.model.constants;

public enum QueueType 
{
	
	CUSTOM(0, "Custom", "Custom games"),
	NORMAL_3x3(8, "NORMAL_3x3", "Normal 3v3 games"),
	NORMAL_5x5_BLIND(2, "NORMAL_5x5_BLIND", "Normal 5v5 Blind Pick games"),
	NORMAL_5x5_DRAFT(14, "NORMAL_5x5_DRAFT", "Normal 5v5 Draft Pick games"),
	@Deprecated
	RANKED_SOLO_5x5(4, "RANKED_SOLO_5x5", "Ranked Solo 5v5 games from earlier seasons"),
	@Deprecated
	RANKED_PREMADE_5x5(6, "RANKED_PREMADE_5x5", "Ranked Premade 5v5 games"),
	@Deprecated
	RANKED_PREMADE_3x3(9, "RANKED_PREMADE_3x3", "Used for both historical Ranked Premade 3v3 games and current Ranked Flex Twisted Treeline games"),
	RANKED_FLEX_TT(9, "RANKED_FLEX_TT", "Used for both historical Ranked Premade 3v3 games and current Ranked Flex Twisted Treeline games"),
	@Deprecated
	RANKED_TEAM_3x3(41, "RANKED_TEAM_3x3", "Ranked Team 3v3 games"),
	RANKED_TEAM_5x5(42, "RANKED_TEAM_5x5", "Ranked Team 5v5 games"),
	ODIN_5x5_BLIND(16, "ODIN_5x5_BLIND", "Dominion 5v5 Blind Pick games"),
	ODIN_5x5_DRAFT(17, "ODIN_5x5_DRAFT", "Dominion 5v5 Draft Pick games"),
	@Deprecated
	BOT_5x5(7, "BOT_5x5", "Historical Summoner's Rift Coop vs AI games"),
	BOT_ODIN_5x5(25, "BOT_ODIN_5x5", "Dominion Coop vs AI games"),
	BOT_5x5_INTRO(31, "BOT_5x5_INTRO", "Summoner's Rift Coop vs AI Intro Bot games"),
	BOT_5x5_BEGINNER(32, "BOT_5x5_BEGINNER", "Summoner's Rift Coop vs AI Beginner Bot games"),
	BOT_5x5_INTERMEDIATE(33, "BOT_5x5_INTERMEDIATE", "Historical Summoner's Rift Coop vs AI Intermediate Bot games"),
	BOT_TT_3x3(52, "BOT_TT_3x3", "Twisted Treeline Coop vs AI games"),
	GROUP_FINDER_5x5(61, "GROUP_FINDER_5x5", "Team Builder games"),
	ARAM_5x5(65, "ARAM_5x5", "ARAM games"),
	ONEFORALL_5x5(70, "ONEFORALL_5x5", "One for All games"),
	FIRSTBLOOD_1x1(72, "FIRSTBLOOD_1x1", "Snowdown Showdown 1v1 games"),
	FIRSTBLOOD_2x2(73, "FIRSTBLOOD_2x2", "Snowdown Showdown 2v2 games"),
	SR_6x6(75, "SR_6x6", "	Summoner's Rift 6x6 Hexakill games"),
	URF_5x5(76, "URF_5x5", "Ultra Rapid Fire games"),
	ONEFORALL_MIRRORMODE_5x5(78, "ONEFORALL_MIRRORMODE_5x5", "One for All (Mirror Mode)"),
	BOT_URF_5x5(83, "BOT_URF_5x5", "Ultra Rapid Fire games played against AI games"),
	NIGHTMARE_BOT_5x5_RANK1(91, "NIGHTMARE_BOT_5x5_RANK1", "Doom Bots Rank 1 games"),
	NIGHTMARE_BOT_5x5_RANK2(92, "NIGHTMARE_BOT_5x5_RANK2", "Doom Bots Rank 2 games"),
	NIGHTMARE_BOT_5x5_RANK5(93, "NIGHTMARE_BOT_5x5_RANK5", "Doom Bots Rank 5 games"),
	ASCENSION_5x5(96, "ASCENSION_5x5", "Ascension games"),
	HEXAKILL(98, "HEXAKILL", "Twisted Treeline 6x6 Hexakill games"),
	BILGEWATER_ARAM_5x5(100, "BILGEWATER_ARAM_5x5", "Butcher's Bridge games"),
	KING_PORO_5x5(300, "KING_PORO_5x5", "King Poro games"),
	COUNTER_PICK(310, "COUNTER_PICK", "Nemesis Draft games"),
	BILGEWATER_5x5(313, "BILGEWATER_5x5", "Black Market Brawlers games"),
	SIEGE(315, "SIEGE", "Nexus Siege games"),
	DEFINITELY_NOT_DOMINION_5x5(317, "DEFINITELY_NOT_DOMINION_5x5", "Definitely Not Dominion games"),
	ARURF_5X5(318, "ARURF_5X5", "All Random URF games"),
	TEAM_BUILDER_DRAFT_UNRANKED_5x5(400, "TEAM_BUILDER_DRAFT_UNRANKED_5x5", "Normal 5v5 Draft Pick games"),
	@Deprecated	
	TEAM_BUILDER_DRAFT_RANKED_5x5(410, "TEAM_BUILDER_DRAFT_RANKED_5x5", "Ranked 5v5 Draft Pick games"),
	TEAM_BUILDER_RANKED_SOLO(420, "TEAM_BUILDER_RANKED_SOLO", "Ranked Solo games from current season that use Team Builder matchmaking"),
	RANKED_FLEX_SR(440, "RANKED_FLEX_SR", "Ranked Flex Summoner's Rift games");
	
	private int id;
	private String name;
	private String description ;

	QueueType(int id, String name, String description) 
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
	
	public static QueueType getMapById(int queueId)
	{
		QueueType result= null;
		for (QueueType queue : QueueType.values()) 
		{
			if (queueId == queue.getId()) 
			{
				result = queue;
				break;
			}
		}
		
		return result;
	}
}
