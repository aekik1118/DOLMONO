package org.techtown.dolmonoproto;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

/**
 * Created by aekik on 2017-07-19.
 */

public class cheerupShow extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cheerup_show);

        TextView tv = (TextView)findViewById(R.id.textView3);
        Intent intent = getIntent();

        String text = intent.getStringExtra("text");

        if("green".equals(intent.getStringExtra("color")))
        {
            tv.setTextColor(Color.GREEN);
        }
        else if("red".equals(intent.getStringExtra("color")))
        {
            tv.setTextColor(Color.RED);
        }


        tv.setText(text);

        tv.setSelected(true);
    }



}


