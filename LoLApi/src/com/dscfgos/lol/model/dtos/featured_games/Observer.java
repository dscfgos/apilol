package com.dscfgos.lol.model.dtos.featured_games;

/**
 * @author dscfgos
 * @version 1.0
 * @category current-game-v1.0 featured-games-v1.0
 */
public class Observer 
{
	private String encryptionKey ; // - Key used to decrypt the spectator grid game data for playback

	public String getEncryptionKey() {
		return encryptionKey;
	}
	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}
}
