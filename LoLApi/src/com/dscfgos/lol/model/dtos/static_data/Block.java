package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains champion recommended block data.
 */
public class Block 
{
	private List<BlockItem> items;
	private boolean         recMath;
	private String          type;
	public List<BlockItem> getItems() {
		return items;
	}
	public void setItems(List<BlockItem> items) {
		this.items = items;
	}
	public boolean isRecMath() {
		return recMath;
	}
	public void setRecMath(boolean recMath) {
		this.recMath = recMath;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
