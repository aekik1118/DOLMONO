package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by aekik on 2017-06-26.
 */

public class jongmokMain extends Fragment{
    View v;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_main_layout, container, false);

        ImageView iv530 = (ImageView)v.findViewById(R.id.imageView530);

        iv530.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.stdname="충주일원";
                activity.stdadd="충북 충주시 호암동 626번지";
                activity.stdwatch="15000석";
                activity.stdcall="043-850-0411";
                activity.stdcar="-대";
                activity.stdjongmok="육상(마라톤)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025730971qQXH31.jpg";
                activity.onFragmentChanged(53);
            }
        });


        return v;
    }




}
