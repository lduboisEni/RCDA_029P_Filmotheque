package fr.eni.movielibrary.bo;

public class Review {

	long id;
	int rating;
	String comment;
	
	Member membre;

	/**
	 * @param id
	 * @param rating
	 * @param comment
	 */
	public Review(long _id, int _rating, String _comment) {
		this.id = _id;
		this.rating = _rating;
		this.comment = _comment;
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
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return the membre
	 */
	public Member getMembre() {
		return membre;
	}

	/**
	 * @param membre the membre to set
	 */
	public void setMembre(Member membre) {
		this.membre = membre;
	}	
	
}
