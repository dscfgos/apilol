package com.dscfgos.lol.model.dtos.champion;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category champion-v1.2
 * <br />
 * This object contains a collection of champion information.
 */
public class ChampionList 
{
    private List<Champion> champions;		// - The collection of champion information.
    
	public List<Champion> getChampions() {
		return champions;
	}
	public void setChampions(List<Champion> champions) {
		this.champions = champions;
	}

}
