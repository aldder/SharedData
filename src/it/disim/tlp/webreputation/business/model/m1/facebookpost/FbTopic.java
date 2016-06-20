package it.disim.tlp.webreputation.business.model.m1.facebookpost;

import it.disim.tlp.webreputation.business.model.m2.socialdata.SDTopic;

import java.util.ArrayList;
import java.util.Collection;

public class FbTopic extends SDTopic {
	private int id;
	private String topic;
	private Float weight;
	private Collection<FbPost> posts = new ArrayList<FbPost>();
	
	public FbTopic(String topic) {
		super(topic);
		this.topic = topic;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public Float getWeight() {
		return weight;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public Collection<FbPost> getPosts() {
		return posts;
	}
	public void setPosts(Collection<FbPost> posts) {
		this.posts = posts;
	}
}