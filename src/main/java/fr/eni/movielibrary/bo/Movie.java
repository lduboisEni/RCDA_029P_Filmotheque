package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {
	
	protected long id;
	protected String tittle;
	protected int year;
	protected int duration;
	protected String synopsis;
	
	//--
	protected Genre genre;
	//--
	protected List<Review> reviews;
	//--
	protected Participant director;
	protected List<Participant> actors;
	
	/**
	 * @param id
	 * @param tittle
	 * @param year
	 * @param duration
	 * @param synopsis
	 */
	
	public Movie(long id, String tittle, int year, int duration, String synopsis) {
		this.id = id;
		this.tittle = tittle;
		this.year = year;
		this.duration = duration;
		this.synopsis = synopsis;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the tittle
	 */
	public String getTittle() {
		return tittle;
	}
	/**
	 * @param tittle the tittle to set
	 */
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * @return the synopsis
	 */
	public String getSynopsis() {
		return synopsis;
	}
	/**
	 * @param synopsis the synopsis to set
	 */
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	/**
	 * @return the reviews
	 */
	public List<Review> getReviews() {
		return reviews;
	}
	/**
	 * @param reviews the reviews to set
	 */
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	/**
	 * @return the director
	 */
	public Participant getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(Participant director) {
		this.director = director;
	}
	/**
	 * @return the actors
	 */
	public List<Participant> getActors() {
		return actors;
	}
	/**
	 * @param actors the actors to set
	 */
	public void setActors(List<Participant> actors) {
		this.actors = actors;
	}

}
