package it.disim.tlp.webreputation.business.model.m1.twittertweet;

import it.disim.tlp.webreputation.business.model.m2.socialdata.SDSource;

import java.util.ArrayList;
import java.util.Collection;

public class Twitter extends SDSource {
	private int id;
	private static String name = "Twitter";
	private String description;
	private String link;
	private String tipo;
	private String icona;
	private TwUser autore;
	private long last_timestamp;
	private Connector connector;
	private Collection<TwUser> utenti = new ArrayList<TwUser>();	
	private Collection<Tweet> posts = new ArrayList<Tweet>();
	
	public Twitter(String description, TwUser author) {
		super(name);
		this.description = description;
		this.autore = author;
		// TODO Auto-generated constructor stub
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
	/*public void setName(String name) {
		this.name = name;
	}*/
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getIcona() {
		return icona;
	}
	public void setIcona(String icona) {
		this.icona = icona;
	}
	public TwUser getAutore() {
		return autore;
	}
	public void setAutore(TwUser autore) {
		this.autore = autore;
	}
	public long getLast_timestamp() {
		return last_timestamp;
	}
	public void setLast_timestamp(long last_timestamp) {
		this.last_timestamp = last_timestamp;
	}
	public Connector getConnector() {
		return connector;
	}
	public void setConnector(Connector connector) {
		this.connector = connector;
	}
	public Collection<TwUser> getUtenti() {
		return utenti;
	}
	public void setUtenti(Collection<TwUser> utenti) {
		this.utenti = utenti;
	}
	public Collection<Tweet> getPosts() {
		return posts;
	}
	public void setPosts(Collection<Tweet> posts) {
		this.posts = posts;
	}
}