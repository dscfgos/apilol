package com.dscfgos.lol.model.dtos.match;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains game event information. Note that not all legal type values documented below are valid for all games. <br />
 * Event data evolves over time and certain values may be relevant only for older or newer games.
 */
public class Event
{
	private String        ascendedType;					// - The ascended type of the event. Only present if relevant. Note that CLEAR_ASCENDED refers to when a participants kills the ascended player. (Legal values: CHAMPION_ASCENDED, CLEAR_ASCENDED, MINION_ASCENDED)
	private List<Integer> assistingParticipantIds;		// - The assisting participant IDs of the event. Only present if relevant.
	private String        buildingType;					// - The building type of the event. Only present if relevant. (Legal values: INHIBITOR_BUILDING, TOWER_BUILDING)
	private int           creatorId;					// - The creator ID of the event. Only present if relevant.
	private String        eventType;					// - Event type. (Legal values: ASCENDED_EVENT, BUILDING_KILL, CAPTURE_POINT, CHAMPION_KILL, ELITE_MONSTER_KILL, ITEM_DESTROYED, ITEM_PURCHASED, ITEM_SOLD, ITEM_UNDO, PORO_KING_SUMMON, SKILL_LEVEL_UP, WARD_KILL, WARD_PLACED)
	private int           itemAfter;					// - The ending item ID of the event. Only present if relevant.
	private int           itemBefore;					// - The starting item ID of the event. Only present if relevant.
	private int           itemId;						// - The item ID of the event. Only present if relevant.
	private int           killerId;						// - The killer ID of the event. Only present if relevant. Killer ID 0 indicates a minion.
	private String        laneType;						// - The lane type of the event. Only present if relevant. (Legal values: BOT_LANE, MID_LANE, TOP_LANE)
	private String        levelUpType;					// - The level up type of the event. Only present if relevant. (Legal values: EVOLVE, NORMAL)
	private String        monsterSubType;				// - The monster subtype of the event. Only present if relevant.
	private String        monsterType;					// - The monster type of the event. Only present if relevant. (Legal values: BARON_NASHOR, BLUE_GOLEM, DRAGON, RED_LIZARD, RIFTHERALD, VILEMAW)
	private int           participantId;				// - The participant ID of the event. Only present if relevant.
	private String        pointCaptured;				// - The point captured in the event. Only present if relevant. (Legal values: POINT_A, POINT_B, POINT_C, POINT_D, POINT_E)
	private Position      position;						// - The position of the event. Only present if relevant.
	private int           skillSlot;					// - The skill slot of the event. Only present if relevant.
	private int           teamId;						// - The team ID of the event. Only present if relevant.
	private long          timestamp;					// - Represents how many milliseconds into the game the event occurred.
	private String        towerType;					// - The tower type of the event. Only present if relevant. (Legal values: BASE_TURRET, FOUNTAIN_TURRET, INNER_TURRET, NEXUS_TURRET, OUTER_TURRET, UNDEFINED_TURRET)
	private int           victimId;						// - The victim ID of the event. Only present if relevant.
	private String        wardType;						// - The ward type of the event. Only present if relevant. (Legal values: BLUE_TRINKET, SIGHT_WARD, TEEMO_MUSHROOM, UNDEFINED, VISION_WARD, YELLOW_TRINKET, YELLOW_TRINKET_UPGRADE)
	public String getAscendedType() {
		return ascendedType;
	}
	public void setAscendedType(String ascendedType) {
		this.ascendedType = ascendedType;
	}
	public List<Integer> getAssistingParticipantIds() {
		return assistingParticipantIds;
	}
	public void setAssistingParticipantIds(List<Integer> assistingParticipantIds) {
		this.assistingParticipantIds = assistingParticipantIds;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	public int getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public int getItemAfter() {
		return itemAfter;
	}
	public void setItemAfter(int itemAfter) {
		this.itemAfter = itemAfter;
	}
	public int getItemBefore() {
		return itemBefore;
	}
	public void setItemBefore(int itemBefore) {
		this.itemBefore = itemBefore;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getKillerId() {
		return killerId;
	}
	public void setKillerId(int killerId) {
		this.killerId = killerId;
	}
	public String getLaneType() {
		return laneType;
	}
	public void setLaneType(String laneType) {
		this.laneType = laneType;
	}
	public String getLevelUpType() {
		return levelUpType;
	}
	public void setLevelUpType(String levelUpType) {
		this.levelUpType = levelUpType;
	}
	public String getMonsterSubType() {
		return monsterSubType;
	}
	public void setMonsterSubType(String monsterSubType) {
		this.monsterSubType = monsterSubType;
	}
	public String getMonsterType() {
		return monsterType;
	}
	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}
	public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public String getPointCaptured() {
		return pointCaptured;
	}
	public void setPointCaptured(String pointCaptured) {
		this.pointCaptured = pointCaptured;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public int getSkillSlot() {
		return skillSlot;
	}
	public void setSkillSlot(int skillSlot) {
		this.skillSlot = skillSlot;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public String getTowerType() {
		return towerType;
	}
	public void setTowerType(String towerType) {
		this.towerType = towerType;
	}
	public int getVictimId() {
		return victimId;
	}
	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}
	public String getWardType() {
		return wardType;
	}
	public void setWardType(String wardType) {
		this.wardType = wardType;
	}

}
