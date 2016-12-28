package com.dscfgos.lol.model.dtos.match;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains match participant information
 */
public class ParticipantIdentity
{
	private int                 championId;					// - Champion ID
	private String              highestAchievedSeasonTier;	// - Highest ranked tier achieved for the previous season, if any, otherwise null. Used to display border in game loading screen. (Legal values: CHALLENGER, MASTER, DIAMOND, PLATINUM, GOLD, SILVER, BRONZE, UNRANKED)
	private List<Mastery>       masteries;					// - List of mastery information
	private int                 participantId;				// - Participant ID
	private List<Rune>          runes;						// - List of rune information
	private int                 spell1Id;					// - First summoner spell ID
	private int                 spell2Id;					// - Second summoner spell ID
	private ParticipantStats    stats;						// - Participant statistics
	private int                 teamId;						// - Team ID
	private ParticipantTimeline timeline;					// - Timeline data. Delta fields refer to values for the specified period (e.g., the gold per minute over the first 10 minutes of the game versus the second 20 minutes of the game. Diffs fields refer to the deltas versus the calculated lane opponent(s).
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public String getHighestAchievedSeasonTier() {
		return highestAchievedSeasonTier;
	}
	public void setHighestAchievedSeasonTier(String highestAchievedSeasonTier) {
		this.highestAchievedSeasonTier = highestAchievedSeasonTier;
	}
	public List<Mastery> getMasteries() {
		return masteries;
	}
	public void setMasteries(List<Mastery> masteries) {
		this.masteries = masteries;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public List<Rune> getRunes() {
		return runes;
	}
	public void setRunes(List<Rune> runes) {
		this.runes = runes;
	}
	public int getSpell1Id() {
		return spell1Id;
	}
	public void setSpell1Id(int spell1Id) {
		this.spell1Id = spell1Id;
	}
	public int getSpell2Id() {
		return spell2Id;
	}
	public void setSpell2Id(int spell2Id) {
		this.spell2Id = spell2Id;
	}
	public ParticipantStats getStats() {
		return stats;
	}
	public void setStats(ParticipantStats stats) {
		this.stats = stats;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public ParticipantTimeline getTimeline() {
		return timeline;
	}
	public void setTimeline(ParticipantTimeline timeline) {
		this.timeline = timeline;
	}
	
}
