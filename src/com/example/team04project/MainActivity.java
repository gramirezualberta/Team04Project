package com.example.team04project;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.team04project.model.Author;

public class MainActivity extends Activity {
	
	GPSLocation userLocation;
	Author author;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		userLocation = new GPSLocation(MainActivity.this);
		author = new Author(userLocation.getLocation(), "guillermo");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_action, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.creat_comment :
			creatNewComment();
			return true;
		case R.id.setting :
			openSetting();
			return true;
			default:
				return super.onOptionsItemSelected(item);
		}
		
	}
		public void creatNewComment()
		{
			Intent intent =new Intent(MainActivity.this , CreateCommentActivity.class);
			startActivity(intent);
			
		}
		public void openSetting()
		{
			Intent intent =new Intent(MainActivity.this , SettingsActivity.class);
			startActivity(intent);
			
			
		}

}
