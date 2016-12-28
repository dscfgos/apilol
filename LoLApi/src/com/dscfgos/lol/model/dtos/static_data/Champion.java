package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains champion data.
 */
public class Champion 
{
	private List<String> allytips ;	
	private String blurb ; 	
	private List<String> enemytips ;	
	private int id ;	
	private Image image ;	
	private Info info ;	
	private String key ;	
	private String lore ;	
	private String name ;	
	private String partype ;	
	private Passive passive ;	
	private List<Recommended> recommended ;	
	private List<Skin> skins ;	
	private List<ChampionSpell> spells ;	
	private Stats stats ;	
	private List<String> tags ;	
	private String title ;
	
	public List<String> getAllytips() {
		return allytips;
	}
	public void setAllytips(List<String> allytips) {
		this.allytips = allytips;
	}
	public String getBlurb() {
		return blurb;
	}
	public void setBlurb(String blurb) {
		this.blurb = blurb;
	}
	public List<String> getEnemytips() {
		return enemytips;
	}
	public void setEnemytips(List<String> enemytips) {
		this.enemytips = enemytips;
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
	public Info getInfo() {
		return info;
	}
	public void setInfo(Info info) {
		this.info = info;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getLore() {
		return lore;
	}
	public void setLore(String lore) {
		this.lore = lore;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPartype() {
		return partype;
	}
	public void setPartype(String partype) {
		this.partype = partype;
	}
	public Passive getPassive() {
		return passive;
	}
	public void setPassive(Passive passive) {
		this.passive = passive;
	}
	public List<Recommended> getRecommended() {
		return recommended;
	}
	public void setRecommended(List<Recommended> recommended) {
		this.recommended = recommended;
	}
	public List<Skin> getSkins() {
		return skins;
	}
	public void setSkins(List<Skin> skins) {
		this.skins = skins;
	}
	public List<ChampionSpell> getSpells() {
		return spells;
	}
	public void setSpells(List<ChampionSpell> spells) {
		this.spells = spells;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
