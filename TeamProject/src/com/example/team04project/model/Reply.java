package com.example.team04project.model;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;


public class Reply extends Comments 
{

	public Reply(String textComment, Author aUser,
			Bitmap aPicture) {
		super(textComment, aUser, aPicture);
	}
	
	private Reply(Parcel source) {
		Log.e("Parcealbe",
				"ParcelData(Parcel source): time to put back parcel data");
		textComment = source.readString();
		aUser = (Author) source.readValue(getClass().getClassLoader());
		aPicture = (Bitmap) source.readValue(getClass().getClassLoader());
	}

	@Override
	public int describeContents() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		Log.e("parceable", "" + flags);
		dest.writeString(textComment);
		dest.writeValue(aUser);
		dest.writeValue(aPicture);      
		
	}
	public static final Parcelable.Creator<Reply> CREATOR = new Creator<Reply>() {

		@Override
		public Reply[] newArray(int size) {
			// TODO Auto-generated method stub
			return new Reply [size];
		}

		@Override
		public Reply createFromParcel(Parcel source) {
			return new Reply(source);
		}
	};
	
}
