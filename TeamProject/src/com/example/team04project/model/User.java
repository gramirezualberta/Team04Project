package com.example.team04project.model;

import java.util.List;

import android.location.Location;


/**
 * @author Guillermo Ramirez
 * 
 */
public abstract class User{

	protected Location userLocation;
	protected LocationModelList locationList;
	
	public User(Location aLocation)
	{
		this.userLocation=aLocation;
		locationList = new LocationModelList();
		locationList.addLocationToList(aLocation);
	}

	/**
	 * @return the userLocation
	 */
	public Location getUserLocation() {
		return userLocation;
	}

	public List<Location> getLocationHistory()
	{
		return locationList.getList();
	}
	
	public void deleteLocationHistory()
	{
		locationList.clear();
	}

}
