package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains mastery data.
 */
public class Mastery 
{
	private List<String>	description;
	private int         	id;
	private Image       	image;
	private String      	name;
	private String 			masteryTree ; // - Legal values: Cunning, Ferocity, Resolve
	private String       	prereq;
	private int          	ranks;
	private List<String> 	sanitizedDescription;
	
	public List<String> getDescription() {
		return description;
	}
	public void setDescription(List<String> description) {
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMasteryTree() {
		return masteryTree;
	}
	public void setMasteryTree(String masteryTree) {
		this.masteryTree = masteryTree;
	}
	public String getPrereq() {
		return prereq;
	}
	public void setPrereq(String prereq) {
		this.prereq = prereq;
	}
	public int getRanks() {
		return ranks;
	}
	public void setRanks(int ranks) {
		this.ranks = ranks;
	}
	public List<String> getSanitizedDescription() {
		return sanitizedDescription;
	}
	public void setSanitizedDescription(List<String> sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}
	
}
