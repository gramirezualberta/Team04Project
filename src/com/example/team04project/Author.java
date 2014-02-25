package com.example.team04project;

import java.util.ArrayList;

import android.location.Location;

/**
 * @author Guillermo Ramirez
 * 
 */
public class Author extends User {

	private Comments aNewComment;
	// save all the top level comment create by the user
	private ArrayList<TopLevel> topLevelList;

	public Author(Location userLocation, String userName, Comments aNewComment) {
		super(userLocation, userName);

		this.aNewComment = aNewComment;
		createTopLevel((TopLevel) aNewComment);
	}

	/**
	 * @return the aNewComment
	 */
	public Comments getaNewComment() {
		return aNewComment;
	}

	/**
	 * @return the topLevelList and return null is the ArrayList is empty
	 */
	public ArrayList<TopLevel> getTopLevelList() {
		if (topLevelList.isEmpty()) {
			topLevelList = null;
		}
		return topLevelList;
	}

	/**
	 * After the user succefuly create a new TopLevel comment, this fuction will add the new top
	 * level comment to the topLevelList.
	 * @param aNewComment
	 */
	public void createTopLevel(TopLevel aNewComment) {
		addTopLevelCommentToList(aNewComment);
	}

	/**
	 * Add a new topLevel Comment to topLevelList
	 * @param aNewTopLevel
	 */
	private void addTopLevelCommentToList(TopLevel aNewTopLevel) {
		topLevelList.add(aNewTopLevel);
	}

}
