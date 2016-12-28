package com.dscfgos.lol.model.dtos.stats;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category stats-v1.3
 * <br />
 * This object contains a collection of player stats summary information.
 */
public class PlayerStatsSummaryList 
{
	private List<PlayerStatsSummary> playerStatSummaries;	// - Collection of player stats summaries associated with the summoner.
	private long summonerId;								// - Summoner ID
	
	public List<PlayerStatsSummary> getPlayerStatSummaries() {
		return playerStatSummaries;
	}
	public void setPlayerStatSummaries(List<PlayerStatsSummary> playerStatSummaries) {
		this.playerStatSummaries = playerStatSummaries;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	

}
