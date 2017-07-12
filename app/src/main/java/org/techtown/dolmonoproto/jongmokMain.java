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
        ImageView iv528 = (ImageView)v.findViewById(R.id.imageView528);
        ImageView iv529 = (ImageView)v.findViewById(R.id.imageView529);
        ImageView iv524 = (ImageView)v.findViewById(R.id.imageView524);

        ImageView iv630 = (ImageView)v.findViewById(R.id.imageView630);
        ImageView iv628 = (ImageView)v.findViewById(R.id.imageView628);
        ImageView iv629 = (ImageView)v.findViewById(R.id.imageView629);
        ImageView iv624 = (ImageView)v.findViewById(R.id.imageView624);

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
                activity.sogeaLastIndex=7;
                activity.sogeaNum=15;
                activity.onFragmentChanged(53);
            }
        });

        iv528.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.stdname="건국대학교 축구장";
                activity.stdadd="충북 충주시 단월동 322";
                activity.stdwatch="-석";
                activity.stdcall="043-840-3115";
                activity.stdcar="70대";
                activity.stdjongmok="축구(남대부)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203101820113HNWH2w.jpg";
                activity.onFragmentChanged(53);
            }
        });

        iv529.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.stdname="건국대학교체육관";
                activity.stdadd="충북 충주시 충원대로 268";
                activity.stdwatch="1520석";
                activity.stdcall="043-840-3121";
                activity.stdcar="250대";
                activity.stdjongmok="복싱(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203102143634k2hfxd.jpg";
                activity.onFragmentChanged(53);
            }
        });

        iv524.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity activity = (MainActivity) getActivity();
                activity.stdname="탄금테니스장(충주)";
                activity.stdadd="충북 충주시 낙수당2길 8";
                activity.stdwatch="100석";
                activity.stdcall="043-870-7832";
                activity.stdcar="1000대";
                activity.stdjongmok="테니스(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203054918897Vfn3Qo.jpg";
                activity.onFragmentChanged(53);
            }
        });




        return v;
    }




}
