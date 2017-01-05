package com.dscfgos.lol.model.classes.api;

import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.dscfgos.lol.model.classes.api.request.RequestMethod;
import com.dscfgos.lol.model.constants.Region;
import com.google.gson.Gson;

public class ApiMethod 
{
	private final ApiConfig config;
	private final String service;
	private Region region = null;
	private String urlBase;
	private final List<UrlParameter> urlParameters = new LinkedList<UrlParameter>();
	private final List<HttpHeadParameter> httpHeadParameters = new LinkedList<HttpHeadParameter>();
	private RequestMethod method = RequestMethod.GET;
	private String body = null;
	private Type returnType = null;

	protected ApiMethod(ApiConfig config, String service) {
		this.config = config;
		this.service = service;
	}

	protected void add(HttpHeadParameter p) {
		httpHeadParameters.add(p);
	}

	protected void add(UrlParameter p) {
		urlParameters.add(p);
	}

	protected void addApiKeyParameter() {
		add(new UrlParameter("api_key", config.getKey()));
	}

	protected void addTournamentApiKeyHttpHeadParameter() {
		add(new HttpHeadParameter("X-Riot-Token", config.getTournamentKey()));
	}

	protected void addTournamentApiKeyParameter() {
		add(new UrlParameter("api_key", config.getTournamentKey()));
	}

	public void buildJsonBody(Map<String, Object> map) {
		body = new Gson().toJson(map);
	}

	public String getBody() {
		return body;
	}

	public Region getRegion() {
		return region;
	}

	public Type getReturnType() {
		return returnType;
	}

	public List<HttpHeadParameter> getHttpHeadParameters() {
		return httpHeadParameters;
	}

	public RequestMethod getMethod() {
		return method;
	}

	public String getService() {
		return service;
	}

	public String getUrl() {
		StringBuilder url = new StringBuilder(urlBase);
		char connector = '?';
		for (UrlParameter p : urlParameters) {
			url.append(connector).append(p.toString());
			connector = '&';
		}
		return url.toString();
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}

	protected void setMethod(RequestMethod method) {
		this.method = method;
	}

	protected void setUrlBase(String urlBase) {
		this.urlBase = urlBase;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}
}
