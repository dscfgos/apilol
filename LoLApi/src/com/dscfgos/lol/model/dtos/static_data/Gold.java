package com.dscfgos.lol.model.dtos.static_data;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains item gold data.
 */
public class Gold 
{
	private int     base;
	private boolean purchasable;
	private int     sell;
	private int     total;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public boolean isPurchasable() {
		return purchasable;
	}
	public void setPurchasable(boolean purchasable) {
		this.purchasable = purchasable;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
}
