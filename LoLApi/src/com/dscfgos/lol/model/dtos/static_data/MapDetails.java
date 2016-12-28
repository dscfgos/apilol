package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains map details data.
 */
public class MapDetails 
{
	private Image image ;	
	private long mapId ;	
	private String mapName ;
	private List<Long> unpurchasableItemList ;
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public long getMapId() {
		return mapId;
	}
	public void setMapId(long mapId) {
		this.mapId = mapId;
	}
	public String getMapName() {
		return mapName;
	}
	public void setMapName(String mapName) {
		this.mapName = mapName;
	}
	public List<Long> getUnpurchasableItemList() {
		return unpurchasableItemList;
	}
	public void setUnpurchasableItemList(List<Long> unpurchasableItemList) {
		this.unpurchasableItemList = unpurchasableItemList;
	}
	
	
}
