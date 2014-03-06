package com.example.team04project.model;

import java.util.ArrayList;
import java.util.List;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

public class Reader extends User {

	// private FavouritesModelList favouritesList;
	List<TopLevel> favouritesList;

	public Reader(Location userLocation, ArrayList<TopLevel> favouritesList) {
		super(userLocation);
		this.favouritesList=favouritesList; 

	}
	
	@SuppressWarnings("unchecked")
	private Reader (Parcel source)
	{
		this.userLocation = (Location) source.readValue(getClass().getClassLoader());
		this.favouritesList= (List<TopLevel>) source.readValue(getClass().getClassLoader());
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeValue(userLocation);
		dest.writeValue(favouritesList);

	}
	
	public static final Parcelable.Creator<Reader> CREATOR=new Creator<Reader>() {
		
		@Override
		public Reader[] newArray(int size) {
			// TODO Auto-generated method stub
			return new Reader [size];
		}
		
		@Override
		public Reader createFromParcel(Parcel source) {
			// TODO Auto-generated method stub
			return new Reader(source);
		}
	};

}
