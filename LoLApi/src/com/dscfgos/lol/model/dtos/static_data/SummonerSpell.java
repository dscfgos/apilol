package com.dscfgos.lol.model.dtos.static_data;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category lol-static-data-v1.2
 * <br />
 * This object contains summoner spell data.
 */
public class SummonerSpell 
{
	private List<Double>       cooldown;
	private String             cooldownBurn;
	private List<Integer>      cost;
	private String             costBurn;
	private String             costType;
	private String             description;
	private List<List<Double>> effect;					// - 	This field is a List of List of Double.
	private List<String>       effectBurn;
	private int                id;
	private Image              image;
	private String             key;
	private LevelTip           leveltip;
	private int                maxrank;
	private List<String>       modes;
	private String             name;
	private Object             range;					// - This field is either a List of Integer or the String 'self' for spells that target one's own champion.
	private String             rangeBurn;
	private String             resource;
	private String             sanitizedDescription;
	private String             sanitizedTooltip;
	private int                summonerLevel;
	private String             tooltip;
	private List<SpellVars>    vars;
	public List<Double> getCooldown() {
		return cooldown;
	}
	public void setCooldown(List<Double> cooldown) {
		this.cooldown = cooldown;
	}
	public String getCooldownBurn() {
		return cooldownBurn;
	}
	public void setCooldownBurn(String cooldownBurn) {
		this.cooldownBurn = cooldownBurn;
	}
	public List<Integer> getCost() {
		return cost;
	}
	public void setCost(List<Integer> cost) {
		this.cost = cost;
	}
	public String getCostBurn() {
		return costBurn;
	}
	public void setCostBurn(String costBurn) {
		this.costBurn = costBurn;
	}
	public String getCostType() {
		return costType;
	}
	public void setCostType(String costType) {
		this.costType = costType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<List<Double>> getEffect() {
		return effect;
	}
	public void setEffect(List<List<Double>> effect) {
		this.effect = effect;
	}
	public List<String> getEffectBurn() {
		return effectBurn;
	}
	public void setEffectBurn(List<String> effectBurn) {
		this.effectBurn = effectBurn;
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
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public LevelTip getLeveltip() {
		return leveltip;
	}
	public void setLeveltip(LevelTip leveltip) {
		this.leveltip = leveltip;
	}
	public int getMaxrank() {
		return maxrank;
	}
	public void setMaxrank(int maxrank) {
		this.maxrank = maxrank;
	}
	public List<String> getModes() {
		return modes;
	}
	public void setModes(List<String> modes) {
		this.modes = modes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getRange() {
		return range;
	}
	public void setRange(Object range) {
		this.range = range;
	}
	public String getRangeBurn() {
		return rangeBurn;
	}
	public void setRangeBurn(String rangeBurn) {
		this.rangeBurn = rangeBurn;
	}
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	public String getSanitizedDescription() {
		return sanitizedDescription;
	}
	public void setSanitizedDescription(String sanitizedDescription) {
		this.sanitizedDescription = sanitizedDescription;
	}
	public String getSanitizedTooltip() {
		return sanitizedTooltip;
	}
	public void setSanitizedTooltip(String sanitizedTooltip) {
		this.sanitizedTooltip = sanitizedTooltip;
	}
	public int getSummonerLevel() {
		return summonerLevel;
	}
	public void setSummonerLevel(int summonerLevel) {
		this.summonerLevel = summonerLevel;
	}
	public String getTooltip() {
		return tooltip;
	}
	public void setTooltip(String tooltip) {
		this.tooltip = tooltip;
	}
	public List<SpellVars> getVars() {
		return vars;
	}
	public void setVars(List<SpellVars> vars) {
		this.vars = vars;
	}

}
