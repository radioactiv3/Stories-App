package com.example.radioactive.horrorstories;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class Home extends Activity {

    ListView StoryList;
    String[] Stories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String SelectedCataegory = intent.getStringExtra("selected-cataegory");
         StoryList = (ListView) findViewById(R.id.HorrorstoryList);
        switch (SelectedCataegory){
            case "डायन प्रेत":
                Stories = (String[]) getResources().getStringArray(R.array.Story_title);
                break;
            case "डुर्दे का प्यार":
                Stories = (String[]) getResources().getStringArray(R.array.Story_title_deadlover);
                break;
            case "आत्मा का साया":
                Stories= (String[])getResources().getStringArray(R.array.Story_title_soulShadow);
                break;
            case "शापित हवेली":
                Stories= (String[])getResources().getStringArray(R.array.Story_title_hauntedHouse);
                break;
            case "शमशान घाट":
                Stories= (String[])getResources().getStringArray(R.array.Story_title_graveyard);
                break;
            default:
                 Stories = (String[]) getResources().getStringArray(R.array.Story_title_demon);

        }

        //String[] Stories = (String[]) getResources().getStringArray(R.array.Story_title);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_shortstories,
                R.id.horrorStoryHomeText, Stories);
        StoryList.setAdapter(adapter);

        StoryList.setOnItemClickListener(new ListClickHandler());
    }

    public class ListClickHandler implements AdapterView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> adapter, View view, int position, long arg3) {
            // TODO Auto-generated method stub
            TextView listText = (TextView) view.findViewById(R.id.horrorStoryHomeText);
            String text = listText.getText().toString();
            Intent intent = new Intent(Home.this, HorrorStoryActivity.class);
            intent.putExtra("selected-item", text);
            startActivity(intent);

        }
    }
}
