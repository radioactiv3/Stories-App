package com.example.radioactive.horrorstories;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by radioactive on 4/13/2017.
 */

public class GridViewActivity extends AppCompatActivity {
    GridView HorrorStoryMainGrid;
    String[] CataegoryType = {"डायन प्रेत","मुर्दे का प्यार",
                                "आत्मा का साया","शापित हवेली",
                                    "शमशान घाट","डरना जरूरी है",};
    int[] CataegoryTypeImage= {R.drawable.demon,R.drawable.ghost_love,
                                    R.drawable.sculls,R.drawable.souls,
                                    R.drawable.coffin,R.drawable.voodoo};

    @Override
    protected void onCreate(Bundle savedInsatnceState){
        super.onCreate(savedInsatnceState);
        setContentView(R.layout.activity_home_grid);
        GridViewAdapter HorrorStoryGridAdapter = new GridViewAdapter
                                            (GridViewActivity.this,CataegoryType,CataegoryTypeImage);
        Log.i("reached inside activity","Lets go");
        HorrorStoryMainGrid = (GridView)findViewById(R.id.Story_Cataegory_grids);
        HorrorStoryMainGrid.setAdapter(HorrorStoryGridAdapter);
        HorrorStoryMainGrid.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent,View view,int i ,long Id)
            {
                Intent intent = new Intent(GridViewActivity.this, Home.class);
                intent.putExtra("selected-cataegory",CataegoryType[+i]);
                startActivity(intent);
                Log.i("now raise a toast honey",""+ CataegoryType[+i]);
                Toast.makeText(GridViewActivity.this, "GridView Item: " +i, Toast.LENGTH_LONG).show();

            }
        });

        };
}




