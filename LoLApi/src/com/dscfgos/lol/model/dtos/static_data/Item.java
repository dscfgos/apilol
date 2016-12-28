package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;
import java.util.Map;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains item data.
 */
public class Item 
{
	private String               colloq;
	private boolean              consumeOnFull;
	private boolean              consumed;
	private int                  depth;
	private String               description;
	private List<String>         from;
	private Gold                 gold;		// - Data Dragon includes the gold field for basic data, which is shared by both rune and item. However, only items have a gold field on them, representing their gold cost in the store. Since runes are not sold in the store, they have no gold cost.
	private String               group;
	private boolean              hideFromAll;
	private int                  id;
	private Image                image;
	private boolean              inStore;
	private List<String>         into;
	private Map<String, Boolean> maps;
	private String               name;
	private String               plaintext;
	private String               requiredChampion;
	private MetaData             rune;
	private String               sanitizedDescription;
	private int                  specialRecipe;
	private int                  stacks;
	private BasicDataStats       stats;
	private List<String>         tags;
	public String getColloq() {
		return colloq;
	}
	public void setColloq(String colloq) {
		this.colloq = colloq;
	}
	public boolean isConsumeOnFull() {
		return consumeOnFull;
	}
	public void setConsumeOnFull(boolean consumeOnFull) {
		this.consumeOnFull = consumeOnFull;
	}
	public boolean isConsumed() {
		return consumed;
	}
	public void setConsumed(boolean consumed) {
		this.consumed = consumed;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getFrom() {
		return from;
	}
	public void setFrom(List<String> from) {
		this.from = from;
	}
	public Gold getGold() {
		return gold;
	}
	public void setGold(Gold gold) {
		this.gold = gold;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public boolean isHideFromAll() {
		return hideFromAll;
	}
	public void setHideFromAll(boolean hideFromAll) {
		this.hideFromAll = hideFromAll;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public boolean isInStore() {
		return inStore;
	}
	public void setInStore(boolean inStore) {
		this.inStore = inStore;
	}
	public List<String> getInto() {
		return into;
	}
	public void setInto(List<String> into) {
		this.into = into;
	}
	public Map<String, Boolean> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Boolean> maps) {
		this.maps = maps;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlaintext() {
		return plaintext;
	}
	public void setPlaintext(String plaintext) {
		this.plaintext = plaintext;
	}
	public String getRequiredChampion() {
		return requiredChampion;
	}
	public void setRequiredChampion(String requiredChampion) {
		this.requiredChampion = requiredChampion;
	}
	public MetaData getRune() {
		return rune;
	}
	public void setRune(MetaData rune) {
		this.rune = rune;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public void setSanitizedDescription(String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}
	public int getSpecialRecipe() {
		return specialRecipe;
	}
	public void setSpecialRecipe(int specialRecipe) {
		this.specialRecipe = specialRecipe;
	}
	public int getStacks() {
		return stacks;
	}
	public void setStacks(int stacks) {
		this.stacks = stacks;
	}
	public BasicDataStats getStats() {
		return stats;
	}
	public void setStats(BasicDataStats stats) {
		this.stats = stats;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	

}
