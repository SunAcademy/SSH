package com.hand.pojo;

// Generated 2015-8-20 23:30:34 by Hibernate Tools 3.4.0.CR1

/**
 * HobbyTab generated by hbm2java
 */
public class HobbyTab implements java.io.Serializable {

	private HobbyTabId id;
	private Events events;

	public HobbyTab() {
	}

	public HobbyTab(HobbyTabId id, Events events) {
		this.id = id;
		this.events = events;
	}

	public HobbyTabId getId() {
		return this.id;
	}

	public void setId(HobbyTabId id) {
		this.id = id;
	}

	public Events getEvents() {
		return this.events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

}
