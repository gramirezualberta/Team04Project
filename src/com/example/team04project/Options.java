package com.example.team04project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.example.team04project.model.User;
import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Options extends Activity {
	public String saveFile="username.json";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
		String username = null;
		Gson gson = new Gson();
		//This reads a file from internal storage to see if a user name already exists
		try{
			BufferedReader br = new BufferedReader (new FileReader(saveFile));
			User u = gson.fromJson(br, User.class);
			//username = u.getUser();
		}catch(IOException e){
			e.printStackTrace();
		}
		//TEST ABOVE NOT SURE IF IT'LL WORK
		
		TextView usernameView = new TextView(this);
		Button btnUser = new Button(this);
		LinearLayout ll = (LinearLayout)findViewById(R.id.optionId);
		usernameView.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
		btnUser.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT));
		if(username==null){
			usernameView.setText("You have not made a username");
			btnUser.setText("Create Username");
			//TO DO create a check to make sure that the username is not taken by another user
		}
		else{
			usernameView.setText("Your username is:\n"+username);
			btnUser.setText("Change Username");
			//TO DO create a check to make sure that the username is not taken by another user
		}
		ll.addView(usernameView);
		ll.addView(btnUser);
		//TO DO create on click for the button and save the user name
		//Saving the username class to a txt file in internal storage
		//String json = gson.toJson(u);//See what this error is
		try {
			FileWriter writer = new FileWriter(saveFile);
			//writer.write(json);
			writer.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options, menu);
		return true;
	}

}
