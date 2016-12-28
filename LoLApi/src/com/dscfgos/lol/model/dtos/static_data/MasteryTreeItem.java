package com.dscfgos.lol.model.dtos.static_data;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains mastery tree item data.
 */
public class MasteryTreeItem 
{
	private int    masteryId;
	private String prereq;
	
	public int getMasteryId() {
		return masteryId;
	}
	public void setMasteryId(int masteryId) {
		this.masteryId = masteryId;
	}
	public String getPrereq() {
		return prereq;
	}
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}
	
}
