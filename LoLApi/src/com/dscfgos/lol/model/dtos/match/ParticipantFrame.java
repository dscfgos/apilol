package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains participant frame information
 */
public class ParticipantFrame
{
	private int      currentGold;			// - Participant's current gold
	private int      dominionScore;			// - Dominion score of the participant
	private int      jungleMinionsKilled;	// - Number of jungle minions killed by participant
	private int      level;					// - Participant's current level
	private int      minionsKilled;			// - Number of minions killed by participant
	private int      participantId;			// - Participant ID
	private Position position;				// - Participant's position
	private int      teamScore;				// - Team score of the participant
	private int      totalGold;				// - Participant's total gold
	private int      xp;					// - Experience earned by participant
	public int getCurrentGold() {
		return currentGold;
	}
	public void setCurrentGold(int currentGold) {
		this.currentGold = currentGold;
	}
	public int getDominionScore() {
		return dominionScore;
	}
	public void setDominionScore(int dominionScore) {
		this.dominionScore = dominionScore;
	}
	public int getJungleMinionsKilled() {
		return jungleMinionsKilled;
	}
	public void setJungleMinionsKilled(int jungleMinionsKilled) {
		this.jungleMinionsKilled = jungleMinionsKilled;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMinionsKilled() {
		return minionsKilled;
	}
	public void setMinionsKilled(int minionsKilled) {
		this.minionsKilled = minionsKilled;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public int getTeamScore() {
		return teamScore;
	}
	public void setTeamScore(int teamScore) {
		this.teamScore = teamScore;
	}
	public int getTotalGold() {
		return totalGold;
	}
	public void setTotalGold(int totalGold) {
		this.totalGold = totalGold;
	}
	public int getXp() {
		return xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}

}
