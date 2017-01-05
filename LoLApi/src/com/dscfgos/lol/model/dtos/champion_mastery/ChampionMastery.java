package com.dscfgos.lol.model.dtos.champion_mastery;

/**
 * @author dscfgos
 * @version 1.0
 * @category championmastery
 * <br />
 * This object contains single Champion Mastery information for player and champion combination.
 */
public class ChampionMastery 
{
	private long championId ; 						// - Champion ID for this entry.
	private int championLevel ; 					// - Champion level for specified player and champion combination.
	private int championPoints ; 					// - Total number of champion points for this player and champion combination - they are used to determine championLevel.
	private long championPointsSinceLastLevel ; 	// - Number of points earned since current level has been achieved. Zero if player reached maximum champion level for this champion.
	private long championPointsUntilNextLevel ; 	// - Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion.
	private boolean chestGranted ; 					// - Is chest granted for this champion or not in current season.
	private long lastPlayTime ; 					// - Last time this champion was played by this player - in Unix milliseconds time format.
	private long playerId ; 						// - Player ID for this entry.
	public long getChampionId() {
		return championId;
	}
	public void setChampionId(long championId) {
		this.championId = championId;
	}
	public int getChampionLevel() {
		return championLevel;
	}
	public void setChampionLevel(int championLevel) {
		this.championLevel = championLevel;
	}
	public int getChampionPoints() {
		return championPoints;
	}
	public void setChampionPoints(int championPoints) {
		this.championPoints = championPoints;
	}
	public long getChampionPointsSinceLastLevel() {
		return championPointsSinceLastLevel;
	}
	public void setChampionPointsSinceLastLevel(long championPointsSinceLastLevel) {
		this.championPointsSinceLastLevel = championPointsSinceLastLevel;
	}
	public long getChampionPointsUntilNextLevel() {
		return championPointsUntilNextLevel;
	}
	public void setChampionPointsUntilNextLevel(long championPointsUntilNextLevel) {
		this.championPointsUntilNextLevel = championPointsUntilNextLevel;
	}
	public boolean isChestGranted() {
		return chestGranted;
	}
	public void setChestGranted(boolean chestGranted) {
		this.chestGranted = chestGranted;
	}
	public long getLastPlayTime() {
		return lastPlayTime;
	}
	public void setLastPlayTime(long lastPlayTime) {
		this.lastPlayTime = lastPlayTime;
	}
	public long getPlayerId() {
		return playerId;
	}
	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}
	
}
