package com.dscfgos.lol.model.dtos.stats;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category stats-v1.3
 * <br />
 * This object contains ranked stats information.
 */
public class RankedStats 
{
	private List<ChampionStats> champions;		// - Collection of aggregated stats summarized by champion.
	private long                modifyDate;		// - Date stats were last modified specified as epoch milliseconds.
	private long                summonerId;		// - Summoner ID.
	public List<ChampionStats> getChampions() {
		return champions;
	}
	public void setChampions(List<ChampionStats> champions) {
		this.champions = champions;
	}
	public long getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(long modifyDate) {
		this.modifyDate = modifyDate;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

}
