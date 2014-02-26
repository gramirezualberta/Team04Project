package com.example.team04project.model;

import java.util.UUID;

import android.location.Location;


public class TopLevel extends Comments {

	private String tittle;
	private String topLevelID;

	public TopLevel(Location aLocation, String textComment, User aUser,
			String tittle) {
		super(aLocation, textComment, aUser);
		
		this.tittle=tittle;
		this.topLevelID=generateID();

	}
	
	private static String generateID()
	{
		return UUID.randomUUID().toString();
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TopLevel [tittle=" + tittle + ", topLevelID=" + topLevelID
				+ ", aUser=" + aUser + ", aLocation=" + aLocation
				+ ", textComment=" + textComment + ", aPicture=" + aPicture
				+ "]";
	}
	
	

}
