package com.dscfgos.lol.model.dtos.match;

import java.util.List;
import java.util.Map;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains game frame information
 */
public class Frame
{
	private List<Event>   events;									// - List of events for this frame.
	private Map<String, ParticipantFrame>   participantFrames;		// - Map of each participant ID to the participant's information for the frame.
	private long   timestamp;										// - Represents how many milliseconds into the game the frame occurred.
	
	public List<Event> getEvents() {
		return events;
	}
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public Map<String, ParticipantFrame> getParticipantFrames() {
		return participantFrames;
	}
	public void setParticipantFrames(Map<String, ParticipantFrame> participantFrames) {
		this.participantFrames = participantFrames;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	   
}
