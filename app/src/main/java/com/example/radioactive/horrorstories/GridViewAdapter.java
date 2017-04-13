package com.example.radioactive.horrorstories;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;

/**
 * Created by radioactive on 4/13/2017.
 */

public class GridViewAdapter extends BaseAdapter {
    private Context mcontext;
    private final String[] gridViewString;
    private final int[] gridViewImageId;

    public GridViewAdapter(Context context,String[]gridViewString,
                           int []gridViewImageId) {
        mcontext = context;
        this.gridViewString = gridViewString;
        this.gridViewImageId = gridViewImageId;
        Log.w("reached inside adapter","Lets go");
    }

    @Override
    public int getCount() {
        return gridViewString.length;
    }
    @Override
    public Object getItem(int i) {
            return null;
        }
    @Override
    public long getItemId(int i)
    {
        return 0;

    }
    @Override
    public View getView(int i, View convertView, ViewGroup parent)
    {  Log.w("reached inside view","Lets go");
        View gridViewHorrorStory;
        LayoutInflater inflater = (LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            gridViewHorrorStory =new View(mcontext);
            gridViewHorrorStory= inflater.inflate(R.layout.activity_home_cataegory_grid,null);
            TextView textHorrorStroy = (TextView)gridViewHorrorStory.findViewById
                                                        (R.id.Horror_Story_Cataegory_Text);

            ImageView ImageHorrorStory = (ImageView)gridViewHorrorStory.findViewById
                                                        (R.id.Horror_Story_Cataegory_Image);


            textHorrorStroy.setText(gridViewString[i]);
            ImageHorrorStory.setImageResource(gridViewImageId[i]);
                    }
        else
        {
            gridViewHorrorStory = (View)convertView;
        }
        return gridViewHorrorStory;
    }


    }

