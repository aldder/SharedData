package it.disim.tlp.webreputation.business.model.m2.opendata;

import it.disim.tlp.webreputation.business.model.m3.shareddata.Source;

public class ODSource extends Source {
	
	private String link;

	public ODSource(String name, String link) {
		super(name);
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
