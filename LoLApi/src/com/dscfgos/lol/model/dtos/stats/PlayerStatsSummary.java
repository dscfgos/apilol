package com.dscfgos.lol.model.dtos.stats;

/**
 * @author dscfgos
 * @version 1.0
 * @category stats-v1.3
 * <br />
 * This object contains player stats summary information.
 */
public class PlayerStatsSummary 
{
	private AggregatedStats aggregatedStats;			// - Aggregated stats.
	private int             losses;						// - Number of losses for this queue type. Returned for ranked queue types only.
	private long            modifyDate;					// - Date stats were last modified specified as epoch milliseconds.
	private String          playerStatSummaryType;		// - Player stats summary type. (Legal values: AramUnranked5x5, Ascension, Bilgewater, CAP5x5, CoopVsAI, CoopVsAI3x3, CounterPick, FirstBlood1x1, FirstBlood2x2, Hexakill, KingPoro, NightmareBot, OdinUnranked, OneForAll5x5, RankedPremade3x3, RankedPremade5x5, RankedSolo5x5, RankedTeam3x3, RankedTeam5x5, SummonersRift6x6, Unranked, Unranked3x3, URF, URFBots, Siege, RankedFlexSR, RankedFlexTT)
	private int             wins;						// - Number of wins for this queue type.
	
	public AggregatedStats getAggregatedStats() {
		return aggregatedStats;
	}
	public void setAggregatedStats(AggregatedStats aggregatedStats) {
		this.aggregatedStats = aggregatedStats;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getPlayerStatSummaryType() {
		return playerStatSummaryType;
	}
	public void setPlayerStatSummaryType(String playerStatSummaryType) {
		this.playerStatSummaryType = playerStatSummaryType;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}


}
