package com.dscfgos.lol.model.dtos.current_game;

/**
 * @author dscfgos
 * @version 1.0
 * @category current-game-v1.0
 */
public class Rune 
{
	private long runeId ; 		// - The ID of the rune
	private int count ; 		// - The count of this rune used by the participant
	public long getRuneId() {
		return runeId;
	}
	public void setRuneId(long runeId) {
		this.runeId = runeId;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
}
