package com.example.audioproject;

import java.util.*;

import android.content.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

public class MyAdapter extends BaseAdapter {
	Context context;
	List<MyAudioData> list;
	
	public MyAdapter(Context context, List<MyAudioData> list) {
		this.context = context;
		this.list = list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public MyAudioData getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		
		if(convertView == null) {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE); 
			convertView = inflater.inflate(R.layout.customer, parent, false);
		}
	 	
	 	
		ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
		TextView textView1 = (TextView) convertView.findViewById(R.id.songText);
		TextView textView2 = (TextView) convertView.findViewById(R.id.artistText);
		
		imageView.setImageResource(getItem(position).getImageId());
		textView1.setText(getItem(position).getSongName());
		textView2.setText(getItem(position).getArtistName());
		
		convertView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(context, SubActivity.class);
				intent.putExtra("songId", getItem(position).getSongId());
				intent.putExtra("imageId", getItem(position).getImageId());
				intent.putExtra("songName", getItem(position).getSongName());
				intent.putExtra("artistName", getItem(position).getArtistName());
				context.startActivity(intent);
			}
			
		});
		
		
		return convertView;
	}

}
