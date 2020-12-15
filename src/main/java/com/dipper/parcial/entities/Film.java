package com.dipper.parcial.entities;

public class Film {
	private String id;
	private String title;
	// private String description;
	private String director;

	/*
	 * private String producer; private String release_date; private String
	 * rt_score; private Client people[]; private Species species; private Locations
	 * locations[]; private Vehicles vehicles; private String url;
	 */
	public Film() {
		// TODO Auto-generated constructor stub
	}

	public Film(String id, String title, String director) {
		super();
		this.id = id;
		this.title = title;
		this.director = director;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

}
