package com.example.team04project;

import java.util.ArrayList;

import android.location.Location;



public class Reader extends User
{
	
	private ArrayList<Comments> favouriteList;

	public Reader(Location userLocation) {
		super(userLocation);
	}
	
	public void addFavouriteList (Comments aComment)
	{
		favouriteList.add(aComment);
	}
	
	public ArrayList<Comments> getFavouriteList()
	{
		return favouriteList;
	}

}
