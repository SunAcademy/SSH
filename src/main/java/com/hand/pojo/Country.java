package com.hand.pojo;

// Generated 2015-8-20 23:30:34 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Country generated by hbm2java
 */
public class Country implements java.io.Serializable {

	private Short countryId;
	private City city;
	private String country;
	private Date lastUpdate;
	private Set cities = new HashSet(0);

	public Country() {
	}

	public Country(City city, String country, Date lastUpdate) {
		this.city = city;
		this.country = country;
		this.lastUpdate = lastUpdate;
	}

	public Country(City city, String country, Date lastUpdate, Set cities) {
		this.city = city;
		this.country = country;
		this.lastUpdate = lastUpdate;
		this.cities = cities;
	}

	public Short getCountryId() {
		return this.countryId;
	}

	public void setCountryId(Short countryId) {
		this.countryId = countryId;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Set getCities() {
		return this.cities;
	}

	public void setCities(Set cities) {
		this.cities = cities;
	}

}