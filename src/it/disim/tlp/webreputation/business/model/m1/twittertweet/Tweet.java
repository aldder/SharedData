package it.disim.tlp.webreputation.business.model.m1.twittertweet;

import it.disim.tlp.webreputation.business.model.m2.socialdata.SocialData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Tweet extends SocialData {
	private int id;
	private String link;
	private Date data;
	private String polarity;
	private String text;
	private Twitter sorgente;
	private List<Object> topics = new LinkedList<Object>();
	private int visibility;

	public Tweet(String link, Date data, String polarity, String text,
			Twitter sorgente, List<Object> topics, int visibility) {
		super(text);
		this.link = link;
		this.data = data;
		this.polarity = polarity;
		this.text = text;
		this.sorgente = sorgente;
		this.topics = topics;
		this.visibility = visibility;
	}

	public Tweet(int id, String link, Date data, String polarity, String text,
			Twitter sorgente, List<Object> topics, int visibility) {
		super(text);
		this.id = id;
		this.link = link;
		this.data = data;
		this.polarity = polarity;
		this.text = text;
		this.sorgente = sorgente;
		this.topics = topics;
		this.visibility = visibility;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getPolarity() {
		return polarity;
	}

	public void setPolarity(String polarity) {
		this.polarity = polarity;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Twitter getSorgente() {
		return sorgente;
	}

	public void setSorgente(Twitter sorgente) {
		this.sorgente = sorgente;
	}

	public List<Object> getTopics() {
		return topics;
	}

	public void setTopics(List<Object> topics) {
		this.topics = topics;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

}