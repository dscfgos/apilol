package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains spell vars data.
 */
public class MetaData 
{
	private List<Double> coeff;
	private String       dyn;
	private String       key;
	private String       link;
	private String       ranksWith;
	public List<Double> getCoeff() {
		return coeff;
	}
	public void setCoeff(List<Double> coeff) {
		this.coeff = coeff;
	}
	public String getDyn() {
		return dyn;
	}
	public void setDyn(String dyn) {
		this.dyn = dyn;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getRanksWith() {
		return ranksWith;
	}
	public void setRanksWith(String ranksWith) {
		this.ranksWith = ranksWith;
	}

}
