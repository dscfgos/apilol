package com.dscfgos.lol.model.dtos.summoner;

/**
 * @author dscfgos
 * @version 1.0
 * @category summoner-v1.4
 * <br />
 * This object contains mastery information.
 */
public class Mastery 
{
	private int id;		// - Mastery ID. For static information correlating to masteries, please refer to the LoL Static Data API.
    private int rank;	// - Mastery rank (i.e., the number of points put into this mastery).
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}

}
