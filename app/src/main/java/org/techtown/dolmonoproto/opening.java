package org.techtown.dolmonoproto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by aekik on 2017-07-21.
 */
public class opening extends Activity {

    Handler handler = new Handler();
    Runnable r = new Runnable() {
        @Override
        public void run() {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);

        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.openning_layout);

        handler.postDelayed(r,1000);


    }


}