package com.dscfgos.lol.model.dtos.static_data;

import java.util.Map;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains realm data.
 */
public class Realm 
{
	private String              cdn;				// - The base CDN url.
	private String              css;				// - Latest changed version of Dragon Magic's css file.
	private String              dd;					// - Latest changed version of Dragon Magic.
	private String              l;					// - Default language for this realm.
	private String              lg;					// - Legacy script mode for IE6 or older.
	private Map<String, String> n;					// - Latest changed version for each data type listed.
	private int                 profileiconmax;		// - Special behavior number identifying the largest profileicon id that can be used under 500. Any profileicon that is requested between this number and 500 should be mapped to 0.
	private String              store;				// - Additional api data drawn from other sources that may be related to data dragon functionality.
	private String              v;					// - Current version of this file for this realm.
	public String getCdn() {
		return cdn;
	}
	public void setCdn(String cdn) {
		this.cdn = cdn;
	}
	public String getCss() {
		return css;
	}
	public void setCss(String css) {
		this.css = css;
	}
	public String getDd() {
		return dd;
	}
	public void setDd(String dd) {
		this.dd = dd;
	}
	public String getL() {
		return l;
	}
	public void setL(String l) {
		this.l = l;
	}
	public String getLg() {
		return lg;
	}
	public void setLg(String lg) {
		this.lg = lg;
	}
	public Map<String, String> getN() {
		return n;
	}
	public void setN(Map<String, String> n) {
		this.n = n;
	}
	public int getProfileiconmax() {
		return profileiconmax;
	}
	public void setProfileiconmax(int profileiconmax) {
		this.profileiconmax = profileiconmax;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}

}
