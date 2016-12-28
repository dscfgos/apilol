package com.dscfgos.lol.model.dtos.current_game;

/**
 * @author dscfgos
 * @version 1.0
 * @category current-game-v1.0
 */
public class Mastery 
{
	private long masteryId ; 	// - The ID of the mastery
	private int rank ; 			// - The number of points put into this mastery by the user

	public long getMasteryId() {
		return masteryId;
	}
	public void setMasteryId(long masteryId) {
		this.masteryId = masteryId;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
}
