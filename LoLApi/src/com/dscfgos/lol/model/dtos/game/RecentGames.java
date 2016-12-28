package com.dscfgos.lol.model.dtos.game;

import java.util.Set;

/**
 * @author dscfgos
 * @version 1.0
 * @category game-v1.3
 * <br />
 * This object contains recent games information.
 */
public class RecentGames 
{
	private Set<Game> games	; // - Collection of recent games played (max 10).
	private long summonerId; // - Summoner ID.
	
	public Set<Game> getGames() {
		return games;
	}
	public void setGames(Set<Game> games) {
		this.games = games;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
}
