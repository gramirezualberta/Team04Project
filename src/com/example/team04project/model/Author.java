package com.example.team04project.model;

import java.util.List;
import java.util.UUID;

import android.location.Location;

/**
 * @author Guillermo Ramirez
 * 
 */
public class Author extends User {

	private String userName;
	private final String ID;

	public Author(Location aLocation, String userName) {
		super(aLocation);

		this.userName = userName;
		this.ID = generateID();
	}

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
