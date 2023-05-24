package fr.eni.movielibrary.bo;

public class Genre {
	
	protected long id;
	protected String label;	
	
	/**
	 * @param label
	 * @param id
	 */
	public Genre(long _id, String _label) {
		this.id = _id;
		this.label = _label;
	}
	
	
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
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
	
	

}
