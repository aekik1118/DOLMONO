package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by aekik on 2017-08-22.
 */


public class jongmokDaySelect extends Fragment {
    View v;

    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_day_select, container, false);

        activity = (MainActivity) getActivity();
        activity.setTitle("경기 종목");

        Button button21 = (Button)v.findViewById(R.id.button21);
        Button button27 = (Button)v.findViewById(R.id.button27);
        Button button26 = (Button)v.findViewById(R.id.button26);
        Button button22 = (Button)v.findViewById(R.id.button22);
        Button button118 = (Button)v.findViewById(R.id.button118);
        Button button19 = (Button)v.findViewById(R.id.button19);
        Button button20 = (Button)v.findViewById(R.id.button20);
        Button button17 = (Button)v.findViewById(R.id.button17);



        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(1019);
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1020);
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1021);
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1022);
            }
        });

        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1023);
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1024);
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1025);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(1026);
            }
        });






        return v;
    }




}