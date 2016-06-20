package it.disim.tlp.webreputation.business.model.m1.twittertweet;

import it.disim.tlp.webreputation.business.model.m2.socialdata.SDTopic;

import java.util.ArrayList;
import java.util.Collection;

public class TwTopic extends SDTopic {
	private int id;
	private String topic;
	private Float weight;
	private Collection<Tweet> posts = new ArrayList<Tweet>();
	
	public TwTopic(String topic) {
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
	public Collection<Tweet> getPosts() {
		return posts;
	}
	public void setPosts(Collection<Tweet> posts) {
		this.posts = posts;
	}
}