package com.example.rssfeed;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ListFragment extends Fragment {

	OnItemSelectedListener listener = null;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		
		View view = inflater.inflate(R.layout.fragment_rsslist_overview, container, false);
		Button button = (Button) view.findViewById(R.id.button1);
		
		button.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				updateDetail(v);
			}
		});
		
        return view;
    }
	
	public interface OnItemSelectedListener{
		public void onRssItemSelected( String link );
	}
	
	public void onAttach(Activity activity) {
        super.onAttach(activity);
        
        if( activity instanceof OnItemSelectedListener){
        	listener = (OnItemSelectedListener) activity;
        }else{
        	throw new ClassCastException( activity.toString() + " must implement OnItemSelectedListener");
        }
    }
	
	public void updateDetail(View v){
		String time = String.valueOf(System.currentTimeMillis());
		listener.onRssItemSelected(time);
	}
}
