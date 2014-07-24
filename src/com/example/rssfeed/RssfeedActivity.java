package com.example.rssfeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RssfeedActivity extends Activity implements ListFragment.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rssfeed);
    }

	@Override
	public void onRssItemSelected(String link) {
		
		DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
		
		if( fragment != null && 
				fragment.isInLayout() == true){
			fragment.setText(link);
		}else{
			Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
			intent.putExtra(DetailActivity.EXTRA_URL, link);
			startActivity(intent);
		}
	}
}
