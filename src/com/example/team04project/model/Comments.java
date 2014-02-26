package com.example.team04project.model;

import android.location.Location;

/**
 * This class gather al the information need it for a comment.
 * 
 * 
 */
public abstract class Comments {

	protected User aUser;
	protected Location aLocation;
	protected String textComment;
	protected PictureModel aPicture;

	public Comments(Location aLocation, String textComment, User aUser) {

		this.aLocation = aLocation;
		this.textComment = textComment;
		this.aUser=aUser;
	}

	public abstract String getComment();

	public abstract User getUser();

	public abstract String editComment();

	public abstract Location getLocation();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comments [aUser=" + aUser + ", aLocation=" + aLocation
				+ ", textComment=" + textComment + ", aPicture=" + aPicture
				+ "]";
	}

}
