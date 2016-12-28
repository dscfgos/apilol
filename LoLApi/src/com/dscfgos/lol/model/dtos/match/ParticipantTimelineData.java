package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains timeline data
 */
public class ParticipantTimelineData
{
	private double zeroToTen;			// - Value per minute from the beginning of the game to 10 min
	private double tenToTwenty;			// - Value per minute from 10 min to 20 min
	private double twentyToThirty;		// - Value per minute from 20 min to 30 min
	private double thirtyToEnd;			// - Value per minute from 30 min to the end of the game

	public double getZeroToTen() {
		return zeroToTen;
	}
	public void setZeroToTen(double zeroToTen) {
		this.zeroToTen = zeroToTen;
	}
	public double getTenToTwenty() {
		return tenToTwenty;
	}
	public void setTenToTwenty(double tenToTwenty) {
		this.tenToTwenty = tenToTwenty;
	}
	public double getTwentyToThirty() {
		return twentyToThirty;
	}
	public void setTwentyToThirty(double twentyToThirty) {
		this.twentyToThirty = twentyToThirty;
	}
	public double getThirtyToEnd() {
		return thirtyToEnd;
	}
	public void setThirtyToEnd(double thirtyToEnd) {
		this.thirtyToEnd = thirtyToEnd;
	}
	

}
