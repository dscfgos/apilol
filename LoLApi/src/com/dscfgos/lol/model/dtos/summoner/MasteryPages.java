package com.dscfgos.lol.model.dtos.summoner;

import java.util.Set;

/**
 * @author dscfgos
 * @version 1.0
 * @category summoner-v1.4
 * <br />
 * This object contains masteries information.
 */
public class MasteryPages 
{
	private Set<MasteryPage> pages;			// - Collection of mastery pages associated with the summoner.
	private long             summonerId;		// - Summoner ID.

	public Set<MasteryPage> getPages() {
		return pages;
	}
	public void setPages(Set<MasteryPage> pages) {
		this.pages = pages;
	}
	public long getSummonerId() {
		return summonerId;
	}
	public void setSummonerId(long summonerId) {
		this.summonerId = summonerId;
	}

}
