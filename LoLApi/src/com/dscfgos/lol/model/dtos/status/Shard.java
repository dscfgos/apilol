package com.dscfgos.lol.model.dtos.status;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-status-v1.0
 */
public class Shard 
{
	private String       hostname;
    private List<String> locales;
    private String       name;
    private String       region_tag;
    private String       slug;
	
    public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public List<String> getLocales() {
		return locales;
	}
	public void setLocales(List<String> locales) {
		this.locales = locales;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion_tag() {
		return region_tag;
	}
	public void setRegion_tag(String region_tag) {
		this.region_tag = region_tag;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
    
}
