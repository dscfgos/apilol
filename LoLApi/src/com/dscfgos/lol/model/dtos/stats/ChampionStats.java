package com.dscfgos.lol.model.dtos.stats;

/**
 * @author dscfgos
 * @version 1.0
 * @category stats-v1.3
 * <br />
 * This object contains a collection of champion stats information.
 */
public class ChampionStats 
{
	 private int             id;		// - Champion ID. Note that champion ID 0 represents the combined stats for all champions. For static information correlating to champion IDs, please refer to the LoL Static Data API.
	 private AggregatedStats stats;		// - Aggregated stats associated with the champion.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AggregatedStats getStats() {
		return stats;
	}
	public void setStats(AggregatedStats stats) {
		this.stats = stats;
	}

}
