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
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

public class HorrorStoryActivity extends Activity {
TextView HorrorStoryText;
    @Override
    protected void onCreate(Bundle savedInstances){
         String[] StoryTitles;
          //(String[]) getResources().getStringArray(R.array.Story_title_demon);
         String[] Full_story ;
         /*(String[]) getResources().getStringArray(R.array.Full_Story);
        HashMap<String,String> myMap = new HashMap<String,String>();
        for (int i = 0; i < StoryTitles.length; i++) {
            myMap.put(StoryTitles[i],Full_story[i]);
        }*/

        super.onCreate(savedInstances);
        setContentView(R.layout.activity_horrorstory_1);

        HorrorStoryText =(TextView) findViewById(R.id.HorrorStoryMainText);
        //HorrorStoryText.setMovementMethod();
        Intent intent = getIntent();
        ArrayList<String> storyandcategory =intent.getStringArrayListExtra("selected-item");
        String cataegory = storyandcategory.get(0);
        String StoryTitle =storyandcategory.get(1);
        switch (cataegory){
            case "0":
                StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_demon);
                Full_story = (String[]) getResources().getStringArray(R.array.Story_demon_full);
                break;
            case "1":
                StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_deadlover);
                Full_story = (String[]) getResources().getStringArray(R.array.Stroy_full_dealdlover);
                break;
            case "2":
                StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_soulShadow);
               Full_story = (String[]) getResources().getStringArray(R.array.Story_SoulShadow_full);
                break;
            case "3":
                StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_hauntedHouse);
               Full_story = (String[]) getResources().getStringArray(R.array.Story_HauntedHouse_full);
                break;
            case "4":
                StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_graveyard);
                 Full_story = (String[]) getResources().getStringArray(R.array.Story_graveyard_full);
                break;
            default:
                StoryTitles = (String[]) getResources().getStringArray(R.array.Story_title_deadlyToy);
               Full_story = (String[]) getResources().getStringArray(R.array.Story_deadtlyToy_full);
                break;
        }

        HashMap<String,String> myMap = new HashMap<String,String>();
        for (int i = 0; i < StoryTitles.length; i++) {
            myMap.put(StoryTitles[i],Full_story[i]);
        }

        String SelectedStory = myMap.get(StoryTitle);
        setTitle(SelectedStory);
        Toast.makeText(HorrorStoryActivity.this, "GridView Item: " +cataegory, Toast.LENGTH_LONG).show();
        HorrorStoryText.setText(SelectedStory);
        HorrorStoryText.setMovementMethod(new ScrollingMovementMethod());

    }

}
