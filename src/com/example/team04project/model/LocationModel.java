package com.example.team04project.model;

import java.util.ArrayList;

import android.location.Location;

public class LocationModel {

	private Location aLocation;
	private ArrayList<Location> locationHistory;// store all location where user
												// has post a comment;

	public LocationModel(Location aLocation) {
		this.aLocation = aLocation;

	}

	/**
	 * @return the aLocation
	 */
	public Location getaLocation() {
		return aLocation;
	}

	/**
	 * @param aLocation
	 *            the aLocation to set
	 */
	public void setaLocation(Location aLocation) {
		this.aLocation = aLocation;
		addLocationToHistory(aLocation);
	}

	/**
	 * Check if the location is already in the historylist, if does, do not add the 
	 * new location, but if it is a new location add to the historyList
	 * 
	 *  #Note: this is a test, and maybe go to user.java instead of here#
	 *  
	 * @param aLocation
	 */
	private void addLocationToHistory(Location aLocation) {
		for (int i = 0; i < locationHistory.size(); i++) {

			double oldLatitude = locationHistory.get(i).getLatitude();
			double oldLongitude = locationHistory.get(i).getLongitude();
			double newLatitude = aLocation.getLatitude();
			double newLongitude = aLocation.getLongitude();

			if (newLatitude != oldLatitude && newLongitude != oldLongitude) {
				locationHistory.add(aLocation);
			}
		}
	}
}
