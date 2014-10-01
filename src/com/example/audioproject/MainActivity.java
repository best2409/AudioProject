package com.example.audioproject;

import java.util.*;

import android.app.*;
import android.os.*;
import android.widget.*;

// ����� ����Ʈ ��Ƽ��Ƽ
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Data
        List<MyAudioData> audioList = new ArrayList<MyAudioData>();
        MyAudioData data1 = new MyAudioData(R.drawable.ic_launcher, R.raw.holler, "Fantastic Baby", "BIGBANG");
        MyAudioData data2 = new MyAudioData(R.drawable.ic_launcher, R.raw.iknow, "BEST", "2NE1");
        
        
        audioList.add(data1);
        audioList.add(data2);

        // View
        ListView listView = (ListView) findViewById(R.id.listView);
        
        // Adapter
        MyAdapter myAdapter = new MyAdapter(this, audioList);

        
        // View�� Adapter ����
        listView.setAdapter(myAdapter);
        
    }
}
