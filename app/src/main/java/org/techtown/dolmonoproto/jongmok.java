package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by aekik on 2017-07-07.
 */


public class jongmok extends Fragment{
    View v;
    MainActivity activity;
    public static String baseImageURL;
    Button bt14;
    Button bt15;
    int position;

    ViewPager pager;

    ImageAdapter adapter;


    ImageView iv;
    Bitmap bm;
    TextView tv,tvName,tvCall,tvAdd,tvWatch,tvJongmok,tvCar;
    private ProgressDialog progressDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_layout, container, false);

        activity = (MainActivity) getActivity();

        activity.setTitle(activity.jongmokName);

        pager=(ViewPager)v.findViewById(R.id.vp);
        adapter = new ImageAdapter(activity,activity.sogeaLastIndex,activity.sogeaNum);

        pager.setAdapter(adapter);

        bt14 = (Button)v.findViewById(R.id.button14);
        bt15 = (Button)v.findViewById(R.id.button15);

        iv = (ImageView) v.findViewById(R.id.imageView24);
        tv = (TextView)v.findViewById(R.id.textView20);
        tvName = (TextView)v.findViewById(R.id.textView20);
        tvWatch = (TextView)v.findViewById(R.id.textView15);
        tvCall = (TextView)v.findViewById(R.id.textView23);
        tvCar = (TextView)v.findViewById(R.id.textView17);
        tvAdd = (TextView)v.findViewById(R.id.textView21);
        tvJongmok = (TextView)v.findViewById(R.id.textView14);

        iv.setScaleType(ImageView.ScaleType.FIT_XY);

        baseImageURL = activity.baseImageURL;

        Thread mThread = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    URL url = new URL(baseImageURL);

                    HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                    conn.setDoInput(true);
                    conn.connect();

                    InputStream is = conn.getInputStream();
                    bm = BitmapFactory.decodeStream(is);

                }catch(IOException ex)
                {

                }

            }

        };

        mThread.start();

        try{
            mThread.join();


            iv.setImageBitmap(bm);

            tvName.setText(activity.stdname);
            tvAdd.setText(activity.stdadd);
            tvWatch.setText(activity.stdwatch);
            tvCar.setText(activity.stdcar);
            tvCall.setText(activity.stdcall);
            tvJongmok.setText(activity.stdjongmok);

        }catch (InterruptedException e){

        }



        bt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position=pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                pager.setCurrentItem(position+1,true);


            }
        });


        bt15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position=pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴


                pager.setCurrentItem(position-1,true);

            }
        });





        return v;
    }



}






