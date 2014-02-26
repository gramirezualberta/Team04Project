package com.example.team04project.model;

import android.graphics.Bitmap;

public class PictureForComment {
	
	private Bitmap picture;
	private String userID;
	private String commentID;
	
	public PictureForComment(Bitmap picture, String userID, String commentID)
	{
		this.picture=picture;
		this.userID=userID;
		this.commentID=commentID;
	}

	/**
	 * @return the picture
	 */
	public Bitmap getPicture() {
		return picture;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(Bitmap picture) {
		this.picture = picture;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @return the commentID
	 */
	public String getCommentID() {
		return commentID;
	}
	
	

}
