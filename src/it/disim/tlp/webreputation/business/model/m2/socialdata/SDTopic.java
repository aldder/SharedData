package it.disim.tlp.webreputation.business.model.m2.socialdata;

import it.disim.tlp.webreputation.business.model.m3.shareddata.Topic;

public class SDTopic extends Topic {

	private String topic;
	
	public SDTopic(String topic) {
		super(topic);
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
