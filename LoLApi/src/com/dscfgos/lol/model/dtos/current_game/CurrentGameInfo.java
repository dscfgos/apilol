package com.dscfgos.lol.model.dtos.current_game;

import java.util.List;

import com.dscfgos.lol.model.constants.GameMode;
import com.dscfgos.lol.model.constants.GameType;


/**
 * @author dscfgos
 * @version 1.0
 * @category current-game-v1.0
 */
public class CurrentGameInfo 
{
	private List<BannedChampion> bannedChampions ; 		// - Banned champion information
	private long gameId ; 								// - The ID of the game
	private long gameLength ; 							// - The amount of time in seconds that has passed since the game started
	private GameMode gameMode ; 						// - The game mode (Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO)
	private long gameQueueConfigId ; 					// - The queue type (queue types are documented on the Game Constants page)
	private long gameStartTime ; 						// - The game start time represented in epoch milliseconds
	private GameType gameType ; 						// - The game type (Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
	private long mapId ; 								// - The ID of the map
	private Observer observers ; 						// - The observer information
	private List<CurrentGameParticipant> participants ; // - The participant information
	private String platformId ; 						// - The ID of the platform on which the game is being played
	
	
	public List<BannedChampion> getBannedChampions() {
		return bannedChampions;
	}
	public void setBannedChampions(List<BannedChampion> bannedChampions) {
		this.bannedChampions = bannedChampions;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public long getGameLength() {
		return gameLength;
	}
	public void setGameLength(long gameLength) {
		this.gameLength = gameLength;
	}
	public GameMode getGameMode() {
		return gameMode;
	}
	public void setGameMod(GameMode gameMode) {
		this.gameMode = gameMode;
	}
	public long getGameQueueConfigId() {
		return gameQueueConfigId;
	}
	public void setGameQueueConfigId(long gameQueueConfigId) {
		this.gameQueueConfigId = gameQueueConfigId;
	}
	public long getGameStartTime() {
		return gameStartTime;
	}
	public void setGameStartTime(long gameStartTime) {
		this.gameStartTime = gameStartTime;
	}
	public GameType getGameType() {
		return gameType;
	}
	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}
	public long getMapId() {
		return mapId;
	}
	public void setMapId(long mapId) {
		this.mapId = mapId;
	}
	public Observer getObservers() {
		return observers;
	}
	public void setObservers(Observer observers) {
		this.observers = observers;
	}
	public List<CurrentGameParticipant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<CurrentGameParticipant> participants) {
		this.participants = participants;
	}
	public String getPlatformId() {
		return platformId;
	}
	public void setPlatformId(String platformId) {
		this.platformId = platformId;
	}
}
