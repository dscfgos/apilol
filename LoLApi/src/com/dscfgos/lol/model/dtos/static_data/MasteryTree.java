package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains mastery tree data..
 */
public class MasteryTree 
{
	private List<MasteryTreeList> cunning;
	private List<MasteryTreeList> ferocity;
	private List<MasteryTreeList> resolve;
	public List<MasteryTreeList> getCunning() {
		return cunning;
	}
	public void setCunning(List<MasteryTreeList> cunning) {
		this.cunning = cunning;
	}
	public List<MasteryTreeList> getFerocity() {
		return ferocity;
	}
	public void setFerocity(List<MasteryTreeList> ferocity) {
		this.ferocity = ferocity;
	}
	public List<MasteryTreeList> getResolve() {
		return resolve;
	}
	public void setResolve(List<MasteryTreeList> resolve) {
		this.resolve = resolve;
	}
	
}
