package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains match player information
 */
public class Player
{
	private String	matchHistoryUri;	// - Match history URI 
	private int 	profileIcon;		// - Profile icon ID 
	private long   	summonerId;			// - Summoner ID
	private String	summonerName;		// - Summoner name
	
	public String getMatchHistoryUri() {
		return matchHistoryUri;
	}
	public void setMatchHistoryUri(String matchHistoryUri) {
		this.matchHistoryUri = matchHistoryUri;
	}
	public int getProfileIcon() {
		return profileIcon;
	}
	public void setProfileIcon(int profileIcon) {
		this.profileIcon = profileIcon;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}
	public String getSummonerName() {
		return summonerName;
	}
	public void setSummonerName(String summonerName) {
		this.summonerName = summonerName;
	}
	
}
