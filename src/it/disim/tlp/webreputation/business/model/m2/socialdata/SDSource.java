package it.disim.tlp.webreputation.business.model.m2.socialdata;

import it.disim.tlp.webreputation.business.model.m3.shareddata.Source;

public class SDSource extends Source {

	private String name;
	
	public SDSource(String name) {
		super(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
