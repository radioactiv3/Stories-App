package com.example.radioactive.horrorstories;

/**
 * Created by radioactive on 4/11/2017.
 */
import android.app.Activity;
import android.content.Intent;
import java.lang.Object;
import android.os.Bundle;


import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.HashMap;

public class HorrorStoryActivity extends Activity {
TextView HorrorStoryText;
    @Override
    protected void onCreate(Bundle savedInstances){
        final String[] StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_demon);
        final String[] Full_story = (String[]) getResources().getStringArray(R.array.Full_Story);
        HashMap<String,String> myMap = new HashMap<String,String>();
        for (int i = 0; i < StoryTitles.length; i++) {
            myMap.put(StoryTitles[i],Full_story[i]);
        }

        super.onCreate(savedInstances);
        setContentView(R.layout.activity_horrorstory_1);

        HorrorStoryText =(TextView) findViewById(R.id.HorrorStoryMainText);
        //HorrorStoryText.setMovementMethod();
        Intent intent = getIntent();
        String SelectedStory = myMap.get(intent.getStringExtra("selected-item"));
        setTitle(SelectedStory);
        HorrorStoryText.setText(SelectedStory);
        HorrorStoryText.setMovementMethod(new ScrollingMovementMethod());

    }

}
