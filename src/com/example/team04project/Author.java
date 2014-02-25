package com.example.team04project;

import java.util.ArrayList;

import android.location.Location;

public class Author extends User {

	private Comments aNewComment;
	private ArrayList<TopLevel> topLevelList;

	public Author(Location userLocation, String userName, Comments aNewComment) {
		super(userLocation, userName);

		this.aNewComment = aNewComment;
		createTopLevel((TopLevel)aNewComment);
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

	public void createTopLevel(TopLevel aNewComment) {
		addTopLevelCommentToList(aNewComment);
	}

	private void addTopLevelCommentToList(TopLevel aNewTopLevel) {
		topLevelList.add(aNewTopLevel);
	}

}
