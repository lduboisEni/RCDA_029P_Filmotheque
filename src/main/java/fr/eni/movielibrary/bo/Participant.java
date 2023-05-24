package fr.eni.movielibrary.bo;

public class Participant {
	
	protected long id;
	protected String lastName;
	protected String firstName;
		
	
	/**
	 * @param id
	 * @param lastName
	 * @param firstName
	 */
	public Participant(long _id, String _lastName, String _firstName) {
		this.id = _id;
		this.lastName = _lastName;
		this.firstName = _firstName;
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
	
	
	
	
}

