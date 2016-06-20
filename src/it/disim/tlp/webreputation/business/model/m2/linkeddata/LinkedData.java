package it.disim.tlp.webreputation.business.model.m2.linkeddata;

import it.disim.tlp.webreputation.business.model.m3.shareddata.Data;

public class LinkedData extends Data {

	private String link;

	public LinkedData(String text, String link) {
		super(text);
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
}
