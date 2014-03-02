package com.example.team04project;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.team04project.model.Author;
import com.example.team04project.model.Reader;
import com.example.team04project.model.TopLevel;

public class MainActivity extends Activity {

	GPSLocation userLocation;
	Author author;
	Reader reader;
	TopLevel comment;
	Internet internet;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		internet = new Internet(this);
		userLocation = new GPSLocation(MainActivity.this);
		author = new Author(userLocation.getLocation(), "guillermo");
		comment = new TopLevel("hola", author, null , "tittle");

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main_action, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.creat_comment:
			creatNewComment();
			return true;
		case R.id.setting:
			openSetting();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}

	}

	public void testB(View view)
	{
		double lat= comment.getaLocation().getLatitude();
		double lon = comment.getaLocation().getLongitude();
		boolean isOn = internet.isConnectedToInternet();
		String msn = "Title : " + comment.getTittle() +
				"\n text : "+ comment.getTextComment() +
				"\n user : "+ comment.getaUser()+
				"\n location : lat - " + lat
				+ "\n lon - "+lon
				+"\n connected? " + isOn;
		Toast.makeText(this,msn, Toast.LENGTH_SHORT).show();
	}

	public void testl(View view)
	{
		Toast.makeText(this, "LONGGGG", Toast.LENGTH_LONG).show();
	}
	public void creatNewComment() {
		Intent intent = new Intent(MainActivity.this,
				CreateCommentActivity.class);
		startActivity(intent);

	}

	public void openSetting() {
		Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
		startActivity(intent);

	}

}
