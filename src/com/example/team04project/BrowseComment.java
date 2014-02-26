package com.example.team04project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.example.team04project.model.Comments;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class BrowseComment extends Activity {
	String saveFile = "comments.json";//NEED TO SAVE THIS ONLINE
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_browse_comment);
		//ALL THIS CODE MAY BE MOVED TO A CONTROLLER
		Intent intent = getIntent();
		Gson gson = new Gson();
		ArrayList<Comments> comment = new ArrayList<Comments>();
		//TO DO read the objects using Json
		String json = intent.getExtras().getString("Class");
		Comments newComment = gson.fromJson(json, Comments.class);
		comment.add(newComment);
		//TO DO Save the objects using Json
		//ALL THIS CODE MAY BE MOVED TO A CONTROLLER
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.browse_comment, menu);
		return true;
	}

}
