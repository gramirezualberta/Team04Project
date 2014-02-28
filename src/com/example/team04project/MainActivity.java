package com.example.team04project;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.example.team04project.model.SpinnerNavItem;

public class MainActivity extends Activity {

	private ActionBar actionBar;
	// Title navigation Spinner data
	private ArrayList<SpinnerNavItem> navSpinner;
	// Navigation adapter
	private TitleNavigationAdapter adapter;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);

		navSpinner = new ArrayList<SpinnerNavItem>();
		navSpinner.add(new SpinnerNavItem("Local"));
		navSpinner.add(new SpinnerNavItem("My Places"));
		navSpinner.add(new SpinnerNavItem("Checkins"));
		navSpinner.add(new SpinnerNavItem("Latitude"));

		// title drop down adapter
		adapter = new TitleNavigationAdapter(getApplicationContext(),
				navSpinner);

		// assigning the spinner navigation
		actionBar.setListNavigationCallbacks(adapter, this);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
