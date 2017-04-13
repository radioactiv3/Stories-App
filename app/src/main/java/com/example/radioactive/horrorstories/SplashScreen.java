package com.example.radioactive.horrorstories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.util.Log;
/**
 * Created by radioactive on 4/13/2017.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle SavedInstanceState){
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.w("Created activity","on top");
        final ImageView SplahLogo = (ImageView) findViewById(R.id.logo);
        final Animation Anim1 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation Anim2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.antirotate);
        final Animation Anim3 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);
        Log.w("Created activity","begining animation");
        SplahLogo.startAnimation(Anim2);
        Anim2.setAnimationListener(new Animation.AnimationListener(){
            @Override
            public void onAnimationStart(Animation animation) {
            }
            public void onAnimationEnd(Animation animation) {
                SplahLogo.startAnimation(Anim1);
            }
        public void onAnimationRepeat(Animation animation) {
        }
        }
        );
        Anim1.setAnimationListener(new Animation.AnimationListener(){
            @Override
            public void onAnimationStart(Animation animation)
            {

            }
            public void onAnimationEnd(Animation animation){
                SplahLogo.startAnimation(Anim3);
                finish();
                Intent mainActivity = new Intent(getBaseContext(),Home.class);
                startActivity(mainActivity);
            }
            @Override
            public void onAnimationRepeat(Animation animation)
            {

            }

        });
        Log.w("Created activity","Done with animation");
    }
}
