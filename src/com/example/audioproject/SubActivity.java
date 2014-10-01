package com.example.audioproject;

import android.app.*;
import android.content.*;
import android.media.*;
import android.os.*;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

// 오디오 재생/정지 액티비티
public class SubActivity extends Activity {
	private int imageId, songId;
	private String songName, artistName;
	
	private MediaPlayer mp;
	private SeekBar seekBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
		
		Intent intent = getIntent();
		
		imageId = intent.getIntExtra("imageId", 0);
		songName = intent.getStringExtra("songName");
		songId = intent.getIntExtra("songId", 0);
		artistName = intent.getStringExtra("artistName");
		
		ImageView imageView = (ImageView) findViewById(R.id.imageView);
		TextView textView1 =  (TextView) findViewById(R.id.textView1);
		TextView textView2 =  (TextView) findViewById(R.id.textView2);
		seekBar = (SeekBar) findViewById(R.id.seekBar);
		
		Button startBtn = (Button) findViewById(R.id.startBtn);
		Button stopBtn = (Button) findViewById(R.id.stopBtn);
		Button listBtn = (Button) findViewById(R.id.listBtn);
		
		imageView.setImageResource(imageId);
		textView1.setText(songName);
		textView2.setText(artistName);
		
		startBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startAudio();
			}	
			
		});
		
		stopBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				stopAudio();
			}
			
		});
		
		listBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				finish();
			}
			
		});
		
	}
	
	public void startAudio() {
		// MediaPlayer mp;
		
		mp = MediaPlayer.create(getApplicationContext(), songId);
		
		//seekBar.setMax(mp.getDuration());
		
		mp.start();		
	}
	
	public void stopAudio() {
		mp.stop();
		mp.release();
	}
	
}

