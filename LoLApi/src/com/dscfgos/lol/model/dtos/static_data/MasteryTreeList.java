package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains mastery tree list data.
 */
public class MasteryTreeList 
{
    private List<MasteryTreeItem> masteryTreeItems;

	public List<MasteryTreeItem> getMasteryTreeItems() {
		return masteryTreeItems;
	}

	public void setMasteryTreeItems(List<MasteryTreeItem> masteryTreeItems) {
		this.masteryTreeItems = masteryTreeItems;
	}
}
