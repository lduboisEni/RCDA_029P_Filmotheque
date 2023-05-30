package fr.eni.movielibrary.bo;

import java.util.List;

public class Member {
	
	long id;
	String lastName;
	String firstName;
	String login;
	String password;
	boolean isAdmin;
	
	List<Review> reviews;
	
	
	

	/**
	 * @param login
	 * @param password
	 */
	public Member() {
		login = "";
		password = "";
	}



	/**
	 * @param id
	 * @param lastName
	 * @param firstName
	 * @param login
	 * @param password
	 * @param isAdmin
	 */
	public Member(long _id, String _lastName, String _firstName, String _login, String _password, boolean _isAdmin) {
		this.id = _id;
		this.lastName = _lastName;
		this.firstName = _firstName;
		this.login = _login;
		this.password = _password;
		this.isAdmin = _isAdmin;
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
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isAdmin
	 */
	public boolean isAdmin() {
		return isAdmin;
	}

	/**
	 * @param isAdmin the isAdmin to set
	 */
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
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

}
