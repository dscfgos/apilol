package com.dscfgos.lol.model.dtos.summoner;

/**
 * @author dscfgos
 * @version 1.0
 * @category summoner-v1.4
 * <br />
 * This object contains rune slot information.
 */
public class RuneSlot 
{
	private int runeId;		// - Rune ID associated with the rune slot. For static information correlating to rune IDs, please refer to the LoL Static Data API.
    private int runeSlotId;	// - Rune slot ID.

    public int getRuneId() {
		return runeId;
	}
	public void setRuneId(int runeId) {
		this.runeId = runeId;
	}
	public int getRuneSlotId() {
		return runeSlotId;
	}
	public void setRuneSlotId(int runeSlotId) {
		this.runeSlotId = runeSlotId;
	}


}
