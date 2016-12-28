package com.dscfgos.lol.model.dtos.status;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-status-v1.0
 */
public class Incident 
{
	private boolean       active;
	private String        created_at;
	private long          id;
	private List<Message> updates;
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Message> getUpdates() {
		return updates;
	}
	public void setUpdates(List<Message> updates) {
		this.updates = updates;
	}
	
}
