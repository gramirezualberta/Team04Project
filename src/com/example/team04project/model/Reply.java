package com.example.team04project.model;

import android.graphics.Bitmap;
import android.location.Location;

public class Reply extends Comments 
{

	public Reply(Location aLocation, String textComment, Author aUser,
			Bitmap aPicture) {
		super(aLocation, textComment, aUser, aPicture);
		// TODO Auto-generated constructor stub
	}
	public Reply(Location aLocation, String textComment, Author aUser) {
		super(aLocation, textComment, aUser);
		// TODO Auto-generated constructor stub
	}
	

}
