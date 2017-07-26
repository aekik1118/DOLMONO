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

public class dolmonoInfo extends Fragment{
    View v;

    MainActivity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.dolmono_info_layout, container, false);

        activity = (MainActivity) getActivity();
        activity.setTitle("개발자 정보");

        return v;
    }




}