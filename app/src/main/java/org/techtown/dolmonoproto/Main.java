package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

/**
 * Created by aekik on 2017-06-26.
 */

public class Main extends Fragment{
    View v;
    MainActivity activity;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.main_layout, container, false);
        activity = (MainActivity) getActivity();

        activity.setTitle("함께하는 충북 전국체전");

        Button button2 = (Button)v.findViewById(R.id.button2);
        Button button4 = (Button)v.findViewById(R.id.button4);
        Button button5 = (Button)v.findViewById(R.id.button5);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(2);
            }
        });




        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(4);
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(5);
            }
        });

        Calendar dDay = Calendar.getInstance();
        dDay.set(2017,9,20);
        Calendar today = Calendar.getInstance();

        long day1 = (long)(dDay.getTimeInMillis()/(1000*60*60*24));
        long day2 = (long)(today.getTimeInMillis()/(1000*60*60*24));

        long ddday = day1 - day2;

        TextView textView2 = (TextView)v.findViewById(R.id.textView2);

        if(ddday < 0){
            textView2.setText(String.format("D+%d",(int)(-ddday)));
        }else if(ddday == 0){
            textView2.setText(String.format("D-DAY"));
        }else{
            textView2.setText(String.format("D-%d",(int)(ddday)));
        }


        return v;
    }



    
}
