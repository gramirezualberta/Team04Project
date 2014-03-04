package com.example.team04project.model;

import java.util.UUID;

import android.location.Location;

/**
 * 
 * This class take all the necesary data to create a author. It also create a ID for the user
 * so that multiples author can have same username, yet still be unique in the system.
 * if username it is not define by the user, he/she username will be Anonymous.
 * @author Guillermo Ramirez
 * 
 */
public class Author extends User{

	private String userName;
	private final String ID;

	public Author(Location aLocation, String userName) {
		super(aLocation);

		if(userName == null)
		{
			userName="Anonymus";
		}
		this.userName = userName;
		this.ID = generateID();
	}
	
	/**
	 * 
	 * @return A unique ID for each user.
	 */

	private String generateID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}

}
