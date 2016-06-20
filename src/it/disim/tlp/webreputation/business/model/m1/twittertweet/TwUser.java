package it.disim.tlp.webreputation.business.model.m1.twittertweet;

import it.disim.tlp.webreputation.business.model.m2.socialdata.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TwUser extends User {
	private int id;
	private String name;
	private String surname;
	private String email;
	private String password;
	private Date birthdate;
	private String city;
	private Date insdate;
	private boolean admin;
	private boolean active;
	private TwUser createdby;
	private Collection<TwUser> users = new ArrayList<TwUser>();	
	private Collection<Twitter> sources = new ArrayList<Twitter>();
		
	public TwUser(String name, String surname) {
		super(name, surname);
		this.name = name;
		this.surname = surname;
		// TODO Auto-generated constructor stub
	}

	public TwUser(int id) {
		super("", "");
		this.id = id;
	}

	public TwUser(int id, String nome, String cognome, String email,
			String password, Date data_nascita, String citta, Date data_ins,
			boolean admin, boolean attivo) {
		super(nome, cognome);
		this.id = id;
		this.name = nome;
		this.surname = cognome;
		this.email = email;
		this.password = password;
		this.birthdate = data_nascita;
		this.city = citta;
		this.insdate = data_ins;
		this.admin = admin;
		this.active = attivo;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public String getCognome() {
		return surname;
	}
	public void setCognome(String cognome) {
		this.surname = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getData_nascita() {
		return birthdate;
	}
	public void setData_nascita(Date data_nascita) {
		this.birthdate = data_nascita;
	}
	public String getCitta() {
		return city;
	}
	public void setCitta(String citta) {
		this.city = citta;
	}
	public Date getData_ins() {
		return insdate;
	}
	public void setData_ins(Date data_ins) {
		this.insdate = data_ins;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isAttivo() {
		return active;
	}
	public void setAttivo(boolean attivo) {
		this.active = attivo;
	}
	public TwUser getCreato_da() {
		return createdby;
	}
	public void setCreato_da(TwUser creato_da) {
		this.createdby = creato_da;
	}
	public Collection<TwUser> getUtenti() {
		return users;
	}
	public void setUtenti(Collection<TwUser> utenti) {
		this.users = utenti;
	}
	public Collection<Twitter> getSorgenti() {
		return sources;
	}
	public void setSorgenti(Collection<Twitter> sorgenti) {
		this.sources = sorgenti;
	}			
	
	
}