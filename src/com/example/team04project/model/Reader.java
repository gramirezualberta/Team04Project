package com.example.team04project.model;

import java.util.ArrayList;

import android.location.Location;



public class Reader extends User
{
	
	private FavouritesModelList favouritesList;

	public Reader(Location aLocation, FavouritesModelList favouritesList) {
		super(aLocation);
		this.favouritesList = favouritesList;
		
	}
	


}
