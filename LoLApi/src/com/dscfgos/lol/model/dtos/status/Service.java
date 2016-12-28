package com.dscfgos.lol.model.dtos.status;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-status-v1.0
 */
public class Service 
{
	private List<Incident> incidents;
    private String         name;
    private String         slug;
    private String         status;
	public List<Incident> getIncidents() {
		return incidents;
	}
	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
}
