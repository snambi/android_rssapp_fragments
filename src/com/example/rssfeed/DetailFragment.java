package com.example.rssfeed;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {

	public View onCreateView(LayoutInflater inflater, 
								ViewGroup container,
								Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_rssitem_detail, container, false);
		return view;
	}
	
	public void setText( String text ){
		TextView v =  (TextView) getView().findViewById(R.id.textView1);
		v.setText(text);
	}
}
