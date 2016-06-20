package it.disim.tlp.webreputation.business.model.m1.facebookpost;

import java.util.Collection;

public class Connector {
	
	private int id;
	private String name;
	private int updateInterval;
	private Collection<Facebook> sorgenti;
	private String activityDate;
	
	public Connector(){
		
	}

	
	public Connector(int id) {
		super();
		this.id = id;
	}

	
	public Connector(int id, String name, int updateInterval,
			Collection<Facebook> sorgenti, String activityDate) {
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


	public Collection<Facebook> getSorgenti() {
		return sorgenti;
	}


	public void setSorgenti(Collection<Facebook> sorgenti) {
		this.sorgenti = sorgenti;
	}
	
	public String getActivityDate() {
		return activityDate;
	}
	
	

}
