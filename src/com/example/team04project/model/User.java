package com.example.team04project.model;

import android.location.Location;


/**
 * @author Guillermo Ramirez
 * 
 */
public abstract class User {

	protected Location userLocation;
	protected LocationModelList userLocationList;
	
	public User(Location aLocation)
	{
		this.userLocation=aLocation;
		this.userLocationList.addLocationToList(aLocation);
	}

}
