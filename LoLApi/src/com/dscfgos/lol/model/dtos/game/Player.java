package com.dscfgos.lol.model.dtos.game;

/**
 * @author dscfgos
 * @version 1.0
 * @category game-v1.3
 * <br />
 * This object contains player information.
 */
public class Player 
{
	private int championId	; 	// - Champion id associated with player.
	private long summonerId; 	// - Summoner id associated with player.
	private int teamId	; 		// - Team id associated with player.
	
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
