package com.example.team04project;

import java.util.ArrayList;

import com.example.team04project.model.Comments;



public class FavouritesModelList
{
	private ArrayList <Comments> favouritesList;
	
	public FavouritesModelList()
	{
		favouritesList= new ArrayList<Comments>();
	}
	
	public void addFavourites (Comments aComment)
	{
		favouritesList.add(aComment);
	}
	
	public ArrayList<Comments>getList()
	{
		return favouritesList;
	}
	

}
