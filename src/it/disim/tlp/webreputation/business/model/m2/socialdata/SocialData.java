package it.disim.tlp.webreputation.business.model.m2.socialdata;

import it.disim.tlp.webreputation.business.model.m3.shareddata.Data;

public class SocialData extends Data {
	
	private String text;

	public SocialData(String text) {
		super(text);
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
