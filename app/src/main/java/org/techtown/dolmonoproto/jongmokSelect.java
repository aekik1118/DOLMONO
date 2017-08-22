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

public class jongmokSelect extends Fragment {
    View v;

    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_select, container, false);

        activity = (MainActivity) getActivity();
        activity.setTitle("경기 종목");

        Button button18 = (Button)v.findViewById(R.id.button18);
        Button button17 = (Button)v.findViewById(R.id.button17);

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.onFragmentChanged(18);
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChanged(17);
            }
        });







        return v;
    }




}