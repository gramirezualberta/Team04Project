package com.example.team04project.model;

import android.location.Location;

public class Reply extends Comments {

	private String topLevelID; 

	public Reply(Location aLocation, String textComment, User aUser, String topLevelID) {
		super(aLocation, textComment, aUser);
		
		this.topLevelID=topLevelID;
	}

	@Override
	public String getComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String editComment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

}
