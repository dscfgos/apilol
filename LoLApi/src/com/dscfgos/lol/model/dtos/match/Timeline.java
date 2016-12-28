package com.dscfgos.lol.model.dtos.match;

import java.util.List;

/**
 * @author dscfgos
 * @version 1.0
 * @category match-v2.2
 * <br />
 * This object contains game timeline information
 */
public class Timeline
{
	private long    frameInterval;		// - Time between each returned frame in milliseconds.
    private List<Frame> frames;			// - List of timeline frames for the game.
    
	public long getFrameInterval() {
		return frameInterval;
	}
	public void setFrameInterval(long frameInterval) {
		this.frameInterval = frameInterval;
	}
	public List<Frame> getFrames() {
		return frames;
	}
	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
	
}
