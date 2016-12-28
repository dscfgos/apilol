package com.dscfgos.lol.model.dtos.match_list;

/**
 * @author dscfgos
 * @version 1.0
 * @category matchlist-v2.2
 * <br />
 * This object contains match list information
 */
public class MatchReference
{
	private long champion ;	
	private String lane	;			// - Legal values: MID, MIDDLE, TOP, JUNGLE, BOT, BOTTOM
	private long matchId ;	
	private String platformId ;	
	private String queue;			// - Legal values: RANKED_FLEX_SR, RANKED_SOLO_5x5, RANKED_TEAM_3x3, RANKED_TEAM_5x5, TEAM_BUILDER_DRAFT_RANKED_5x5, TEAM_BUILDER_RANKED_SOLO
	private String region;			// - Legal values: br, eune, euw, jp, kr, lan, las, na, oce, ru, tr
	private String role	;			// - Legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT
	private String season;			// - Legal values: PRESEASON3, SEASON3, PRESEASON2014, SEASON2014, PRESEASON2015, SEASON2015, PRESEASON2016, SEASON2016, PRESEASON2017, SEASON2017
	private long timestamp ;
	
	public long getChampion() {
		return champion;
	}
	public void setChampion(long champion) {
		this.champion = champion;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public long getMatchId() {
		return matchId;
	}
	public void setMatchId(long matchId) {
		this.matchId = matchId;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
	public String getQueue() {
		return queue;
	}
	public void setQueue(String queue) {
		this.queue = queue;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}				
	
	   
}
