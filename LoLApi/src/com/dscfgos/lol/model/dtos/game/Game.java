package com.dscfgos.lol.model.dtos.game;

import java.util.List;

import com.dscfgos.lol.model.constants.GameMode;
import com.dscfgos.lol.model.constants.GameType;
import com.dscfgos.lol.model.constants.SubType;

/**
 * @author dscfgos
 * @version 1.0
 * @category game-v1.3
  * <br />
 * This object contains game information.
 */
public class Game 
{

	private int championId ; 					// - Champion ID associated with game.
	private long createDate	; 					// - Date that end game data was recorded, specified as epoch milliseconds.
	private List<Player> fellowPlayers ; 		// - Other players associated with the game.
	private long gameId ;						// - Game ID.
	private GameMode gameMode	;				// - Game mode. (Legal values: CLASSIC, ODIN, ARAM, TUTORIAL, ONEFORALL, ASCENSION, FIRSTBLOOD, KINGPORO, SIEGE)
	private GameType  gameType ;				// - Game type. (Legal values: CUSTOM_GAME, MATCHED_GAME, TUTORIAL_GAME)
	private boolean invalid	; 					// - Invalid flag.
	private int ipEarned	;					// - IP Earned.
	private int level	; 						// - Level.
	private int mapId	;						// - Map ID.
	private int spell1	;						// - ID of first summoner spell.
	private int spell2	;						// - ID of second summoner spell.
	private RawStats	stats ; 				// - Statistics associated with the game for this summoner.
	private SubType subType; 					// - Game sub-type. (Legal values: NONE, NORMAL, BOT, RANKED_SOLO_5x5, RANKED_PREMADE_3x3, RANKED_PREMADE_5x5, ODIN_UNRANKED, RANKED_TEAM_3x3, RANKED_TEAM_5x5, NORMAL_3x3, BOT_3x3, CAP_5x5, ARAM_UNRANKED_5x5, ONEFORALL_5x5, FIRSTBLOOD_1x1, FIRSTBLOOD_2x2, SR_6x6, URF, URF_BOT, NIGHTMARE_BOT, ASCENSION, HEXAKILL, KING_PORO, COUNTER_PICK, BILGEWATER, SIEGE, RANKED_FLEX_SR, RANKED_FLEX_TT)
	private int teamId	; 						// - Team ID associated with game. Team ID 100 is blue team. Team ID 200 is purple team.
	
	public int getChampionId() {
		return championId;
	}
	public void setChampionId(int championId) {
		this.championId = championId;
	}
	public long getCreateDate() {
		return createDate;
	}
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	public List<Player> getFellowPlayers() {
		return fellowPlayers;
	}
	public void setFellowPlayers(List<Player> fellowPlayers) {
		this.fellowPlayers = fellowPlayers;
	}
	public long getGameId() {
		return gameId;
	}
	public void setGameId(long gameId) {
		this.gameId = gameId;
	}
	public GameMode getGameMode() {
		return gameMode;
	}
	public void setGameMode(GameMode gameMode) {
		this.gameMode = gameMode;
	}
	public GameType getGameType() {
		return gameType;
	}
	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}
	public boolean isInvalid() {
		return invalid;
	}
	public void setInvalid(boolean invalid) {
		this.invalid = invalid;
	}
	public int getIpEarned() {
		return ipEarned;
	}
	public void setIpEarned(int ipEarned) {
		this.ipEarned = ipEarned;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public int getSpell1() {
		return spell1;
	}
	public void setSpell1(int spell1) {
		this.spell1 = spell1;
	}
	public int getSpell2() {
		return spell2;
	}
	public void setSpell2(int spell2) {
		this.spell2 = spell2;
	}
	public RawStats getStats() {
		return stats;
	}
	public void setStats(RawStats stats) {
		this.stats = stats;
	}
	public SubType getSubType() {
		return subType;
	}
	public void setSubType(SubType subType) {
		this.subType = subType;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
}
