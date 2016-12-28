package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains mastery information
 */
public class Mastery
{
	private long    masteryId;	// - Mastery ID
    private long rank;			// - Mastery rank
	public long getMasteryId() {
		return masteryId;
	}
	public void setMasteryId(long masteryId) {
		this.masteryId = masteryId;
	}
	public long getRank() {
		return rank;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
	
	
}
