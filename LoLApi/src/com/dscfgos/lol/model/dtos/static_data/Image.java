package com.dscfgos.lol.model.dtos.static_data;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains meta data.
 */
public class Image 
{
	private boolean isRune;
	private String  tier;
	private String  type;
	public boolean isRune() {
		return isRune;
	}
	public void setRune(boolean isRune) {
		this.isRune = isRune;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
