package it.disim.tlp.webreputation.business.model.m1.twittertweet;

import java.util.Collection;

public class Connector {
	
	private int id;
	private String name;
	private int updateInterval;
	private Collection<Twitter> sorgenti;
	private String activityDate;
	
	public Connector(){
		
	}

	
	public Connector(int id) {
		super();
		this.id = id;
	}

	
	public Connector(int id, String name, int updateInterval,
			Collection<Twitter> sorgenti, String activityDate) {
		super();
		this.id = id;
		this.name = name;
		this.updateInterval = updateInterval;
		this.sorgenti = sorgenti;
		this.activityDate = activityDate;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUpdateInterval() {
		return updateInterval;
	}


	public void setUpdateInterval(int updateInterval) {
		this.updateInterval = updateInterval;
	}


	public Collection<Twitter> getSorgenti() {
		return sorgenti;
	}


	public void setSorgenti(Collection<Twitter> sorgenti) {
		this.sorgenti = sorgenti;
	}
	
	public String getActivityDate() {
		return activityDate;
	}
	
	

}
