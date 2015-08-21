package com.hand.pojo;

import java.util.Date;



public class Film1 {

		private int film_id;
		private String title;
		private String description;
		private int release_year;
		private int language_id;
		private Integer original_language_id;
		private int rental_duration;
		private double rental_rate;
		private int length;
		private double replacement_cost;
		private String rating;
		private String special_features;
		private Date last_update;
		private int id;
		private String desciption;
		private Integer languange_id;
		
		
		
		
		public Integer getOriginal_language_id() {
			return original_language_id;
		}
		public void setOriginal_language_id(Integer original_language_id) {
			this.original_language_id = original_language_id;
		}
		public int getFilm_id() {
			return film_id;
		}
		public void setFilm_id(int film_id) {
			this.film_id = film_id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getRelease_year() {
			return release_year;
		}
		public void setRelease_year(int release_year) {
			this.release_year = release_year;
		}
		public int getLanguage_id() {
			return language_id;
		}
		public void setLanguage_id(int language_id) {
			this.language_id = language_id;
		}


		public int getRental_duration() {
			return rental_duration;
		}
		public void setRental_duration(int rental_duration) {
			this.rental_duration = rental_duration;
		}
		public double getRental_rate() {
			return rental_rate;
		}
		public void setRental_rate(double rental_rate) {
			this.rental_rate = rental_rate;
		}
		public int getLength() {
			return length;
		}
		public void setLength(int length) {
			this.length = length;
		}
		public double getReplacement_cost() {
			return replacement_cost;
		}
		public void setReplacement_cost(double replacement_cost) {
			this.replacement_cost = replacement_cost;
		}
		public String getRating() {
			return rating;
		}
		public void setRating(String rating) {
			this.rating = rating;
		}
		public String getSpecial_features() {
			return special_features;
		}
		public void setSpecial_features(String special_features) {
			this.special_features = special_features;
		}
		public Date getLast_update() {
			return last_update;
		}
		public void setLast_update(Date last_update) {
			this.last_update = last_update;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getDesciption() {
			return desciption;
		}
		public void setDesciption(String desciption) {
			this.desciption = desciption;
		}
	

		
		
		public Film1(int film_id, String title, String description,
				int release_year, int language_id,
				Integer original_language_id, int rental_duration,
				double rental_rate, int length, double replacement_cost,
				String rating, String special_features, Date last_update,
				int id, String desciption, Integer languange_id) {
			super();
			this.film_id = film_id;
			this.title = title;
			this.description = description;
			this.release_year = release_year;
			this.language_id = language_id;
			this.original_language_id = original_language_id;
			this.rental_duration = rental_duration;
			this.rental_rate = rental_rate;
			this.length = length;
			this.replacement_cost = replacement_cost;
			this.rating = rating;
			this.special_features = special_features;
			this.last_update = last_update;
			this.id = id;
			this.desciption = desciption;
			this.languange_id = languange_id;
		}
		public Integer getLanguange_id() {
			return languange_id;
		}
		public void setLanguange_id(Integer languange_id) {
			this.languange_id = languange_id;
		}
		public Film1() {
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Film [film_id=" + film_id + ", title=" + title
					+ ", description=" + description + ", release_year="
					+ release_year + ", language_id=" + language_id
					+ ", original_language_id=" + original_language_id
					+ ", rental_duration=" + rental_duration + ", rental_rate="
					+ rental_rate + ", length=" + length
					+ ", replacement_cost=" + replacement_cost + ", rating="
					+ rating + ", special_features=" + special_features
					+ ", last_update=" + last_update + ", id=" + id
					+ ", desciption=" + desciption + ", languange_id="
					+ languange_id + "]";
		}
		
		
		
		
		

		
	
}
