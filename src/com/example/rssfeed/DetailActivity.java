package com.example.rssfeed;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class DetailActivity extends Activity{
	
	public static final String EXTRA_URL = "url";

	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		if( getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
			finish();
			return;
		}
		
		setContentView(R.layout.activity_detail);
		Bundle extras = getIntent().getExtras();
		if( extras != null ){
			String url = extras.getString(EXTRA_URL);
			DetailFragment f = (DetailFragment) getFragmentManager().findFragmentById( R.id.deatilFragment2);
			f.setText(url);
		}
	}
}
