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
	protected PictureForComment aPicture;

	public Comments(Location aLocation, String textComment) {

		this.aLocation = aLocation;
		this.textComment = textComment;

	}

	public abstract String getComment();

	public abstract User getUser();

	public abstract String editComment();

	public abstract Location getLocation();

}
