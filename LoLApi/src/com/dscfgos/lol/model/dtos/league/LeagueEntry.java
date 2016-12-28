package com.dscfgos.lol.model.dtos.league;

/**
 * @author dscfgos
 * @version 1.0
 * @category league-v2.5
 * <br />
 * This object contains league participant information representing a summoner or team.
 */
public class LeagueEntry 
{
	private String division ; 			// - The league division of the participant.
	private boolean isFreshBlood ; 		// - Specifies if the participant is fresh blood.
	private boolean isHotStreak ; 		// - Specifies if the participant is on a hot streak.
	private boolean isInactive ; 		// - Specifies if the participant is inactive.
	private boolean isVeteran ; 		// - Specifies if the participant is a veteran.
	private int leaguePoints ; 			// - The league points of the participant.
	private int losses ; 				// - The number of losses for the participant.
	private MiniSeries miniSeries ; 	// - Mini series data for the participant. Only present if the participant is currently in a mini series.
	private String playerOrTeamId ; 	// - The ID of the participant (i.e., summoner or team) represented by this entry.
	private String playerOrTeamName ; 	// - The name of the the participant (i.e., summoner or team) represented by this entry.
	private String playstyle ; 			// - The playstyle of the participant. (Legal values: NONE, SOLO, SQUAD, TEAM)
	private int wins ; 					// - The number of wins for the participant.
	
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public boolean isFreshBlood() {
		return isFreshBlood;
	}
	public void setFreshBlood(boolean isFreshBlood) {
		this.isFreshBlood = isFreshBlood;
	}
	public boolean isHotStreak() {
		return isHotStreak;
	}
	public void setHotStreak(boolean isHotStreak) {
		this.isHotStreak = isHotStreak;
	}
	public boolean isInactive() {
		return isInactive;
	}
	public void setInactive(boolean isInactive) {
		this.isInactive = isInactive;
	}
	public boolean isVeteran() {
		return isVeteran;
	}
	public void setVeteran(boolean isVeteran) {
		this.isVeteran = isVeteran;
	}
	public int getLeaguePoints() {
		return leaguePoints;
	}
	public void setLeaguePoints(int leaguePoints) {
		this.leaguePoints = leaguePoints;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public MiniSeries getMiniSeries() {
		return miniSeries;
	}
	public void setMiniSeries(MiniSeries miniSeries) {
		this.miniSeries = miniSeries;
	}
	public String getPlayerOrTeamId() {
		return playerOrTeamId;
	}
	public void setPlayerOrTeamId(String playerOrTeamId) {
		this.playerOrTeamId = playerOrTeamId;
	}
	public String getPlayerOrTeamName() {
		return playerOrTeamName;
	}
	public void setPlayerOrTeamName(String playerOrTeamName) {
		this.playerOrTeamName = playerOrTeamName;
	}
	public String getPlaystyle() {
		return playstyle;
	}
	public void setPlaystyle(String playstyle) {
		this.playstyle = playstyle;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	
	
}
