package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains participant identity information
 */
public class Participant
{
	private int    participantId;	// - Participant ID
    private Player player;			// - Player information
	
    public int getParticipantId() {
		return participantId;
	}
	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
    
    
}
