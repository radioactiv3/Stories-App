package com.example.radioactive.horrorstories;

/**
 * Created by radioactive on 4/11/2017.
 */
import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;


import android.widget.TextView;

import java.util.HashMap;

public class HorrorStoryActivity extends Activity {
TextView HorrorStoryText;
    @Override
    protected void onCreate(Bundle savedInstances){
        String[] StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title);
        String[] Full_story = (String[]) getResources().getStringArray(R.array.Full_Story);
        HashMap<String,String> myMap = new HashMap<String,String>();
        for (int i = 0; i < StoryTitles.length; i++) {
            myMap.put(StoryTitles[i],Full_story[i]);
        }

        super.onCreate(savedInstances);
        setContentView(R.layout.activity_horrorstory_1);
        HorrorStoryText =(TextView)findViewById(R.id.HorrorStoryMainText);
        Intent intent = getIntent();
        String SelectedStory = myMap.get(intent.getStringExtra("selected-item"));
        HorrorStoryText.setText(SelectedStory);

    }

}
