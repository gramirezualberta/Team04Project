package com.example.team04project.model;

import android.graphics.Bitmap;
import android.location.Location;

/**
 * This class gather al the information need it for a comment.
 * 
 * 
 */
public abstract class Comments {

	protected Author aUser;
	protected Location aLocation;
	protected String textComment;
	protected Bitmap aPicture;

	public Comments(String textComment, Author aUser, Bitmap aPicture) {

		this.textComment = textComment;
		this.aUser=aUser;
		this.aLocation = aUser.getUserLocation();
		this.aPicture=aPicture;
	}

	/**
	 * @return the aUser
	 */
	public String getaUser() {
		return aUser.getUserName();
	}

	/**
	 * @return the aLocation
	 */
	public Location getaLocation() {
		return aLocation;
	}

	/**
	 * @param aLocation the aLocation to set
	 */
	public void setaLocation(Location aLocation) {
		this.aLocation=aLocation;
	}

	/**
	 * @return the textComment
	 */
	public String getTextComment() {
		return textComment;
	}

	/**
	 * @param textComment the textComment to set
	 */
	public void setTextComment(String textComment) {
		this.textComment = textComment;
	}

	/**
	 * @return the aPicture
	 */
	public Bitmap getaPicture() {
		return aPicture;
			
	}

	/**
	 * @param aPicture the aPicture to set
	 */
	public void setaPicture(Bitmap aPicture) {
		this.aPicture = aPicture;
	}
	

}
