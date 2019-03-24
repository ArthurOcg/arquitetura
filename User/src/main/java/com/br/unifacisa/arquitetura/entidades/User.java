package com.br.unifacisa.arquitetura.entidades;

public class User {

	private Long id;
	private String nome;
	private String adress;
	private String country;
	private String city;
	private String clientProfile;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClientProfile() {
		return clientProfile;
	}
	public void setClientProfile(String clientProfile) {
		this.clientProfile = clientProfile;
	}
	
	
}
