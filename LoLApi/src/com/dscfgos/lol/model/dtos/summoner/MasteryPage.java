package com.dscfgos.lol.model.dtos.summoner;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category summoner-v1.4
 * <br />
 * This object contains mastery page information.
 */
public class MasteryPage 
{
	private boolean       current;		// - Indicates if the mastery page is the current mastery page.
    private long          id;			// - Mastery page ID.
    private List<Mastery> masteries;	// - Collection of masteries associated with the mastery page.
    private String        name;			// - Mastery page name.
	
    public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public List<Mastery> getMasteries() {
		return masteries;
	}
	public void setMasteries(List<Mastery> masteries) {
		this.masteries = masteries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
