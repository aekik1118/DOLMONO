package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by aekik on 2017-06-26.
 */

public class gaeyo extends Fragment{
    View v;

    MainActivity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.gaeyo_layout, container, false);

        activity = (MainActivity) getActivity();
        activity.setTitle("대회 개요");

        return v;
    }




}
