package com.example.team04project;

import com.example.team04project.model.Comments;
import com.example.team04project.model.Reader;
import com.example.team04project.model.User;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ActionBar actionBar;
	
	private User newUser;
	private GPSLocation location;
	private Comments comment;
	private ListView commentsList;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/* inizialition of user and location; this is for test porpose
		 * Feature to develop: read if the user is first time in the app
		 * or is a come back user.
		 */
		location=new GPSLocation(MainActivity.this);
		newUser=new Reader(location.getLocation());
		
		actionBar = getActionBar();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
