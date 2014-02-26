package com.example.team04project;

import com.example.team04project.model.Author;
import com.example.team04project.model.Comments;
import com.example.team04project.model.Dates;
import com.example.team04project.model.User;
import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CreateComment extends Activity {
	public void postComment(View view){
		//Gets the date,user and other things from their classes and changes them to strings and makes a new comment
		Dates date = new Dates();
		//User user = new Author();
		//Get the other parameters too
		EditText text = (EditText) findViewById(R.id.comment);
		String commentText = text.getText().toString();
		String currDate = date.getDate();
		//String theUser=user.getUser();
		//Initialize the comments class
		///Comments newComment = new Comments (commentText,currDate,theUser );
		
		//How I believe to send the comments through an intent
		Gson gson = new Gson();
		Intent intent = new Intent(this, BrowseComment.class);//Temporary location for now might have to put it in a controller
		//String json= gson.toJson(newComment);
		//intent.putExtra("Class", json);
		startActivity(intent);
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_comment);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_comment, menu);
		return true;
	}

}
