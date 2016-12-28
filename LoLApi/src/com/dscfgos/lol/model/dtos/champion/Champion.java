package com.dscfgos.lol.model.dtos.champion;

/**
 * @author dscfgos
 * @version 1.0
 * @category champion-v1.2
 * <br />
 * This object contains champion information.
 */
public class Champion 
{
	private int     id;					// - Champion ID. For static information correlating to champion IDs, please refer to the LoL Static Data API.
	private boolean active;				// - Indicates if the champion is active.
	private boolean botEnabled;			// - Bot enabled flag (for custom games).
	private boolean botMmEnabled;		// - Bot Match Made enabled flag (for Co-op vs. AI games).
	private boolean freeToPlay;			// - Indicates if the champion is free to play. Free to play champions are rotated periodically.
	private boolean rankedPlayEnabled;	// - Ranked play enabled flag.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isBotEnabled() {
		return botEnabled;
	}
	public void setBotEnabled(boolean botEnabled) {
		this.botEnabled = botEnabled;
	}
	public boolean isBotMmEnabled() {
		return botMmEnabled;
	}
	public void setBotMmEnabled(boolean botMmEnabled) {
		this.botMmEnabled = botMmEnabled;
	}
	public boolean isFreeToPlay() {
		return freeToPlay;
	}
	public void setFreeToPlay(boolean freeToPlay) {
		this.freeToPlay = freeToPlay;
	}
	public boolean isRankedPlayEnabled() {
		return rankedPlayEnabled;
	}
	public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
		this.rankedPlayEnabled = rankedPlayEnabled;
	}


}
