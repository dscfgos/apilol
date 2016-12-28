package com.dscfgos.lol.model.dtos.match;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains all timeline information
 */
public class ParticipantTimeline
{
	private ParticipantTimelineData ancientGolemAssistsPerMinCounts;	// - Ancient golem assists per minute timeline counts
    private ParticipantTimelineData ancientGolemKillsPerMinCounts;		// - Ancient golem kills per minute timeline counts
    private ParticipantTimelineData assistedLaneDeathsPerMinDeltas;		// - Assisted lane deaths per minute timeline data
    private ParticipantTimelineData assistedLaneKillsPerMinDeltas;		// - Assisted lane kills per minute timeline data
    private ParticipantTimelineData baronAssistsPerMinCounts;			// - Baron assists per minute timeline counts
    private ParticipantTimelineData baronKillsPerMinCounts;				// - Baron kills per minute timeline counts
    private ParticipantTimelineData creepsPerMinDeltas;					// - Creeps per minute timeline data
    private ParticipantTimelineData csDiffPerMinDeltas;					// - Creep score difference per minute timeline data
    private ParticipantTimelineData damageTakenDiffPerMinDeltas;		// - Damage taken difference per minute timeline data
    private ParticipantTimelineData damageTakenPerMinDeltas;			// - Damage taken per minute timeline data
    private ParticipantTimelineData dragonAssistsPerMinCounts;			// - Dragon assists per minute timeline counts
    private ParticipantTimelineData dragonKillsPerMinCounts;			// - Dragon kills per minute timeline counts
    private ParticipantTimelineData elderLizardAssistsPerMinCounts;		// - Elder lizard assists per minute timeline counts
    private ParticipantTimelineData elderLizardKillsPerMinCounts;		// - Elder lizard kills per minute timeline counts
    private ParticipantTimelineData goldPerMinDeltas;					// - Gold per minute timeline data
    private ParticipantTimelineData inhibitorAssistsPerMinCounts;		// - Inhibitor assists per minute timeline counts
    private ParticipantTimelineData inhibitorKillsPerMinCounts;			// - Inhibitor kills per minute timeline counts
    private String                  lane;								// - Participant's lane (Legal values: MID, MIDDLE, TOP, JUNGLE, BOT, BOTTOM)
    private String                  role;								// - Participant's role (Legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT)
    private ParticipantTimelineData towerAssistsPerMinCounts;			// - Tower assists per minute timeline counts
    private ParticipantTimelineData towerKillsPerMinCounts;				// - Tower kills per minute timeline counts
    private ParticipantTimelineData towerKillsPerMinDeltas;				// - Tower kills per minute timeline data
    private ParticipantTimelineData vilemawAssistsPerMinCounts;			// - Vilemaw assists per minute timeline counts
    private ParticipantTimelineData vilemawKillsPerMinCounts;			// - Vilemaw kills per minute timeline counts
    private ParticipantTimelineData wardsPerMinDeltas;					// - Wards placed per minute timeline data
    private ParticipantTimelineData xpDiffPerMinDeltas;					// - Experience difference per minute timeline data
    private ParticipantTimelineData xpPerMinDeltas;						// - Experience per minute timeline data
	public ParticipantTimelineData getAncientGolemAssistsPerMinCounts() {
		return ancientGolemAssistsPerMinCounts;
	}
	public void setAncientGolemAssistsPerMinCounts(ParticipantTimelineData ancientGolemAssistsPerMinCounts) {
		this.ancientGolemAssistsPerMinCounts = ancientGolemAssistsPerMinCounts;
	}
	public ParticipantTimelineData getAncientGolemKillsPerMinCounts() {
		return ancientGolemKillsPerMinCounts;
	}
	public void setAncientGolemKillsPerMinCounts(ParticipantTimelineData ancientGolemKillsPerMinCounts) {
		this.ancientGolemKillsPerMinCounts = ancientGolemKillsPerMinCounts;
	}
	public ParticipantTimelineData getAssistedLaneDeathsPerMinDeltas() {
		return assistedLaneDeathsPerMinDeltas;
	}
	public void setAssistedLaneDeathsPerMinDeltas(ParticipantTimelineData assistedLaneDeathsPerMinDeltas) {
		this.assistedLaneDeathsPerMinDeltas = assistedLaneDeathsPerMinDeltas;
	}
	public ParticipantTimelineData getAssistedLaneKillsPerMinDeltas() {
		return assistedLaneKillsPerMinDeltas;
	}
	public void setAssistedLaneKillsPerMinDeltas(ParticipantTimelineData assistedLaneKillsPerMinDeltas) {
		this.assistedLaneKillsPerMinDeltas = assistedLaneKillsPerMinDeltas;
	}
	public ParticipantTimelineData getBaronAssistsPerMinCounts() {
		return baronAssistsPerMinCounts;
	}
	public void setBaronAssistsPerMinCounts(ParticipantTimelineData baronAssistsPerMinCounts) {
		this.baronAssistsPerMinCounts = baronAssistsPerMinCounts;
	}
	public ParticipantTimelineData getBaronKillsPerMinCounts() {
		return baronKillsPerMinCounts;
	}
	public void setBaronKillsPerMinCounts(ParticipantTimelineData baronKillsPerMinCounts) {
		this.baronKillsPerMinCounts = baronKillsPerMinCounts;
	}
	public ParticipantTimelineData getCreepsPerMinDeltas() {
		return creepsPerMinDeltas;
	}
	public void setCreepsPerMinDeltas(ParticipantTimelineData creepsPerMinDeltas) {
		this.creepsPerMinDeltas = creepsPerMinDeltas;
	}
	public ParticipantTimelineData getCsDiffPerMinDeltas() {
		return csDiffPerMinDeltas;
	}
	public void setCsDiffPerMinDeltas(ParticipantTimelineData csDiffPerMinDeltas) {
		this.csDiffPerMinDeltas = csDiffPerMinDeltas;
	}
	public ParticipantTimelineData getDamageTakenDiffPerMinDeltas() {
		return damageTakenDiffPerMinDeltas;
	}
	public void setDamageTakenDiffPerMinDeltas(ParticipantTimelineData damageTakenDiffPerMinDeltas) {
		this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
	}
	public ParticipantTimelineData getDamageTakenPerMinDeltas() {
		return damageTakenPerMinDeltas;
	}
	public void setDamageTakenPerMinDeltas(ParticipantTimelineData damageTakenPerMinDeltas) {
		this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
	}
	public ParticipantTimelineData getDragonAssistsPerMinCounts() {
		return dragonAssistsPerMinCounts;
	}
	public void setDragonAssistsPerMinCounts(ParticipantTimelineData dragonAssistsPerMinCounts) {
		this.dragonAssistsPerMinCounts = dragonAssistsPerMinCounts;
	}
	public ParticipantTimelineData getDragonKillsPerMinCounts() {
		return dragonKillsPerMinCounts;
	}
	public void setDragonKillsPerMinCounts(ParticipantTimelineData dragonKillsPerMinCounts) {
		this.dragonKillsPerMinCounts = dragonKillsPerMinCounts;
	}
	public ParticipantTimelineData getElderLizardAssistsPerMinCounts() {
		return elderLizardAssistsPerMinCounts;
	}
	public void setElderLizardAssistsPerMinCounts(ParticipantTimelineData elderLizardAssistsPerMinCounts) {
		this.elderLizardAssistsPerMinCounts = elderLizardAssistsPerMinCounts;
	}
	public ParticipantTimelineData getElderLizardKillsPerMinCounts() {
		return elderLizardKillsPerMinCounts;
	}
	public void setElderLizardKillsPerMinCounts(ParticipantTimelineData elderLizardKillsPerMinCounts) {
		this.elderLizardKillsPerMinCounts = elderLizardKillsPerMinCounts;
	}
	public ParticipantTimelineData getGoldPerMinDeltas() {
		return goldPerMinDeltas;
	}
	public void setGoldPerMinDeltas(ParticipantTimelineData goldPerMinDeltas) {
		this.goldPerMinDeltas = goldPerMinDeltas;
	}
	public ParticipantTimelineData getInhibitorAssistsPerMinCounts() {
		return inhibitorAssistsPerMinCounts;
	}
	public void setInhibitorAssistsPerMinCounts(ParticipantTimelineData inhibitorAssistsPerMinCounts) {
		this.inhibitorAssistsPerMinCounts = inhibitorAssistsPerMinCounts;
	}
	public ParticipantTimelineData getInhibitorKillsPerMinCounts() {
		return inhibitorKillsPerMinCounts;
	}
	public void setInhibitorKillsPerMinCounts(ParticipantTimelineData inhibitorKillsPerMinCounts) {
		this.inhibitorKillsPerMinCounts = inhibitorKillsPerMinCounts;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ParticipantTimelineData getTowerAssistsPerMinCounts() {
		return towerAssistsPerMinCounts;
	}
	public void setTowerAssistsPerMinCounts(ParticipantTimelineData towerAssistsPerMinCounts) {
		this.towerAssistsPerMinCounts = towerAssistsPerMinCounts;
	}
	public ParticipantTimelineData getTowerKillsPerMinCounts() {
		return towerKillsPerMinCounts;
	}
	public void setTowerKillsPerMinCounts(ParticipantTimelineData towerKillsPerMinCounts) {
		this.towerKillsPerMinCounts = towerKillsPerMinCounts;
	}
	public ParticipantTimelineData getTowerKillsPerMinDeltas() {
		return towerKillsPerMinDeltas;
	}
	public void setTowerKillsPerMinDeltas(ParticipantTimelineData towerKillsPerMinDeltas) {
		this.towerKillsPerMinDeltas = towerKillsPerMinDeltas;
	}
	public ParticipantTimelineData getVilemawAssistsPerMinCounts() {
		return vilemawAssistsPerMinCounts;
	}
	public void setVilemawAssistsPerMinCounts(ParticipantTimelineData vilemawAssistsPerMinCounts) {
		this.vilemawAssistsPerMinCounts = vilemawAssistsPerMinCounts;
	}
	public ParticipantTimelineData getVilemawKillsPerMinCounts() {
		return vilemawKillsPerMinCounts;
	}
	public void setVilemawKillsPerMinCounts(ParticipantTimelineData vilemawKillsPerMinCounts) {
		this.vilemawKillsPerMinCounts = vilemawKillsPerMinCounts;
	}
	public ParticipantTimelineData getWardsPerMinDeltas() {
		return wardsPerMinDeltas;
	}
	public void setWardsPerMinDeltas(ParticipantTimelineData wardsPerMinDeltas) {
		this.wardsPerMinDeltas = wardsPerMinDeltas;
	}
	public ParticipantTimelineData getXpDiffPerMinDeltas() {
		return xpDiffPerMinDeltas;
	}
	public void setXpDiffPerMinDeltas(ParticipantTimelineData xpDiffPerMinDeltas) {
		this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
	}
	public ParticipantTimelineData getXpPerMinDeltas() {
		return xpPerMinDeltas;
	}
	public void setXpPerMinDeltas(ParticipantTimelineData xpPerMinDeltas) {
		this.xpPerMinDeltas = xpPerMinDeltas;
	}
    
	
}
