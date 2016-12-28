package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains rune information
 */
public class Rune
{
	private long   rank;	// - Rune rank
	private long   runeId;	// - Rune ID
	
	public long getRank() {
		return rank;
	}
	public void setRank(long rank) {
		this.rank = rank;
	}
	public long getRuneId() {
		return runeId;
	}
	public void setRuneId(long runeId) {
		this.runeId = runeId;
	}
	
    
}
