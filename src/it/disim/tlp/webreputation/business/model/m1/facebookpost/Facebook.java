package it.disim.tlp.webreputation.business.model.m1.facebookpost;

import it.disim.tlp.webreputation.business.model.m2.socialdata.SDSource;

import java.util.ArrayList;
import java.util.Collection;

public class Facebook extends SDSource {
	private int id;
	private static String name = "Facebook";
	private String description;
	private String link;
	private String tipo;
	private String icona;
	private FbUser autore;
	private long last_timestamp;
	private Connector connector;
	private Collection<FbUser> utenti = new ArrayList<FbUser>();	
	private Collection<FbPost> posts = new ArrayList<FbPost>();
	
	public Facebook(String description, FbUser author) {
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
	public FbUser getAutore() {
		return autore;
	}
	public void setAutore(FbUser autore) {
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
	public Collection<FbUser> getUtenti() {
		return utenti;
	}
	public void setUtenti(Collection<FbUser> utenti) {
		this.utenti = utenti;
	}
	public Collection<FbPost> getPosts() {
		return posts;
	}
	public void setPosts(Collection<FbPost> posts) {
		this.posts = posts;
	}
}