package com.dscfgos.lol.model.classes.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class UrlParameter implements Cloneable 
{
	private final String key;
	private final String value;

	public UrlParameter(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public UrlParameter(String key, int value) {
		this(key, String.valueOf(value));
	}

	public UrlParameter(String key, long value) {
		this(key, String.valueOf(value));
	}

	public UrlParameter(String key, boolean value) {
		this(key, value ? "true" : "false");
	}

	public UrlParameter(String key, Object value) {
		this(key, value.toString());
	}

	public UrlParameter clone() {
		return new UrlParameter(key, value);
	}

	protected String getKey() {
		return key;
	}

	protected String getValue() {
		return value;
	}

	@Override
	public String toString() 
	{
		String parameter = null;
		try 
		{
			parameter = URLEncoder.encode(getKey(), "UTF-8") + "=" + URLEncoder.encode(getValue(), "UTF-8");
		} 
		catch (UnsupportedEncodingException e) 
		{
	
		}
		return parameter;
	}
}
