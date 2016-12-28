package com.dscfgos.lol.model.dtos.summoner;

import java.util.Set;

/**
 * @author dscfgos
 * @version 1.0
 * @category summoner-v1.4
 * <br />
 * This object contains rune pages information.
 */
public class RunePages 
{
	private Set<RunePage> pages;				// - Collection of rune pages associated with the summoner.
	private long             summonerId;		// - Summoner ID.
	
	public Set<RunePage> getPages() {
		return pages;
	}
	public void setPages(Set<RunePage> pages) {
		this.pages = pages;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

	

}
