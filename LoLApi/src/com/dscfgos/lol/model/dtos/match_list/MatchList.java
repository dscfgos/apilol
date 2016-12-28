package com.dscfgos.lol.model.dtos.match_list;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category matchlist-v2.2
 * <br />
 * This object contains match list information
 */
public class MatchList
{
	private int endIndex;					 	
	private List<MatchReference> matches;	 	
	private int startIndex; 				 	
	private int totalGames;
	
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public List<MatchReference> getMatches() {
		return matches;
	}
	public void setMatches(List<MatchReference> matches) {
		this.matches = matches;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getTotalGames() {
		return totalGames;
	}
	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	} 				
	
	   
}
