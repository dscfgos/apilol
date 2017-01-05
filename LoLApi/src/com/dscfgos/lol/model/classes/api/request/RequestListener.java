package com.dscfgos.lol.model.classes.api.request;

import com.dscfgos.lol.model.classes.api.RiotApiException;

public interface RequestListener 
{
	public void onRequestFailed(RiotApiException e);
	public void onRequestSucceeded(AsyncRequest request);
	public void onRequestTimeout(AsyncRequest request);
}
