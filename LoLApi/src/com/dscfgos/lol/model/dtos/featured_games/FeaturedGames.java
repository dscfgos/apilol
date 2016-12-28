package com.dscfgos.lol.model.dtos.featured_games;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category featured-games-v1.0
 */
public class FeaturedGames 
{
	private long clientRefreshInterval ; // - The suggested interval to wait before requesting FeaturedGames again
	private List<FeaturedGameInfo> gameList ; // - The list of featured games
	public long getClientRefreshInterval() {
		return clientRefreshInterval;
	}
	public void setClientRefreshInterval(long clientRefreshInterval) {
		this.clientRefreshInterval = clientRefreshInterval;
	}
	public List<FeaturedGameInfo> getGameList() {
		return gameList;
	}
	public void setGameList(List<FeaturedGameInfo> gameList) {
		this.gameList = gameList;
	}
	
}
