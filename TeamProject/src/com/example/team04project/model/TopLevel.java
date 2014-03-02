package com.example.team04project.model;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Bitmap;
import android.location.Location;

public class TopLevel extends Comments {

	private String tittle;
	private List<Reply> replies;

	public TopLevel(String textComment, Author aUser,
			Bitmap aPicture, String tittle) {
		super(textComment, aUser, aPicture);
		this.tittle = tittle;
		this.replies = new ArrayList<Reply>();
	}

	/**
	 * @return the tittle
	 */
	public String getTittle() {
		return tittle;
	}

	/**
	 * @param tittle
	 *            the tittle to set
	 */
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	/**
	 * @param aReply
	 * @return
	 * @see java.util.List#add(java.lang.Object)
	 */
	public boolean add(Reply aReply) {
		return replies.add(aReply);
	}

	/**
	 * 
	 * @see java.util.List#clear()
	 */
	public void clear() {
		replies.clear();
	}

	/**
	 * @param i
	 * @return
	 * @see java.util.List#remove(int)
	 */
	public Reply remove(int i) {
		return replies.remove(i);
	}

	/**
	 * @return the replies
	 */
	public List<Reply> getReplies() {
		return replies;
	}

}
