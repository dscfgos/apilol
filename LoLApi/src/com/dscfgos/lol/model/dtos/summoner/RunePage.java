package com.dscfgos.lol.model.dtos.summoner;

import java.util.Set;

/**
 * @author dscfgos
 * @version 1.0
 * @category summoner-v1.4
 * <br />
 * This object contains rune page information.
 */
public class RunePage 
{
	private boolean       current;	// - Indicates if the page is the current page.
    private long          id;		// - Rune page ID. 
    private String        name;		// - Rune page name.
    private Set<RuneSlot> slots;	// - Collection of rune slots associated with the rune page.
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<RuneSlot> getSlots() {
		return slots;
	}
	public void setSlots(Set<RuneSlot> slots) {
		this.slots = slots;
	}

}
