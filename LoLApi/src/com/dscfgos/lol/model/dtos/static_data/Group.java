package com.dscfgos.lol.model.dtos.static_data;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains item group data.
 */
public class Group 
{
	private String maxGroupOwnable;
	private String key;
	public String getMaxGroupOwnable() {
		return maxGroupOwnable;
	}
	public void setMaxGroupOwnable(String maxGroupOwnable) {
		this.maxGroupOwnable = maxGroupOwnable;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}

}
