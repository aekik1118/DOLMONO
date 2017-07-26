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
import android.widget.LinearLayout;
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
    public static String baseImageURL,baseImageURL2,baseImageURL3,baseImageURL4,baseImageURL5,baseImageURL6,baseImageURL7;
    Button bt14;
    Button bt15;
    int position;
    public  static int stdnum;

    ViewPager pager;

    ImageAdapter adapter;


    ImageView iv,iv2,iv3,iv4,iv5,iv6,iv7;
    Bitmap bm,bm2,bm3,bm4,bm5,bm6,bm7;
    TextView tv,tvName,tvCall,tvAdd,tvWatch,tvJongmok,tvCar;
    TextView tvName2,tvCall2,tvAdd2,tvWatch2,tvJongmok2,tvCar2;
    TextView tvName3,tvCall3,tvAdd3,tvWatch3,tvJongmok3,tvCar3;
    TextView tvName4,tvCall4,tvAdd4,tvWatch4,tvJongmok4,tvCar4;
    TextView tvName5,tvCall5,tvAdd5,tvWatch5,tvJongmok5,tvCar5;
    TextView tvName6,tvCall6,tvAdd6,tvWatch6,tvJongmok6,tvCar6;

    TextView tv8;



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

        iv2 = (ImageView) v.findViewById(R.id.imageView14);
        tvName2 = (TextView)v.findViewById(R.id.textViewJ112);
        tvWatch2 = (TextView)v.findViewById(R.id.textViewJ134);
        tvCall2 = (TextView)v.findViewById(R.id.textViewJ122);
        tvCar2 = (TextView)v.findViewById(R.id.textViewJ124);
        tvAdd2 = (TextView)v.findViewById(R.id.textViewJ132);
        tvJongmok2 = (TextView)v.findViewById(R.id.textViewJ114);

        iv3 = (ImageView) v.findViewById(R.id.imageView15);
        tvName3 = (TextView)v.findViewById(R.id.textViewJ212);
        tvWatch3 = (TextView)v.findViewById(R.id.textViewJ234);
        tvCall3 = (TextView)v.findViewById(R.id.textViewJ222);
        tvCar3 = (TextView)v.findViewById(R.id.textViewJ224);
        tvAdd3 = (TextView)v.findViewById(R.id.textViewJ232);
        tvJongmok3 = (TextView)v.findViewById(R.id.textViewJ214);

        iv4 = (ImageView) v.findViewById(R.id.imageView16);
        tvName4 = (TextView)v.findViewById(R.id.textViewJ312);
        tvWatch4 = (TextView)v.findViewById(R.id.textViewJ334);
        tvCall4 = (TextView)v.findViewById(R.id.textViewJ322);
        tvCar4 = (TextView)v.findViewById(R.id.textViewJ324);
        tvAdd4 = (TextView)v.findViewById(R.id.textViewJ332);
        tvJongmok4 = (TextView)v.findViewById(R.id.textViewJ314);

        iv5 = (ImageView) v.findViewById(R.id.imageView17);
        tvName5 = (TextView)v.findViewById(R.id.textViewJ412);
        tvWatch5 = (TextView)v.findViewById(R.id.textViewJ434);
        tvCall5 = (TextView)v.findViewById(R.id.textViewJ422);
        tvCar5 = (TextView)v.findViewById(R.id.textViewJ424);
        tvAdd5 = (TextView)v.findViewById(R.id.textViewJ432);
        tvJongmok5 = (TextView)v.findViewById(R.id.textViewJ414);

        iv6 = (ImageView) v.findViewById(R.id.imageView18);
        tvName6 = (TextView)v.findViewById(R.id.textViewJ512);
        tvWatch6 = (TextView)v.findViewById(R.id.textViewJ534);
        tvCall6 = (TextView)v.findViewById(R.id.textViewJ522);
        tvCar6 = (TextView)v.findViewById(R.id.textViewJ524);
        tvAdd6 = (TextView)v.findViewById(R.id.textViewJ532);
        tvJongmok6 = (TextView)v.findViewById(R.id.textViewJ514);

        iv7 = (ImageView) v.findViewById(R.id.imageView19);
        tv8 = (TextView) v.findViewById(R.id.textView8);


        stdnum = activity.stdnum;


        LinearLayout linearLayout11 = (LinearLayout)v.findViewById(R.id.j11);
        LinearLayout linearLayout12 = (LinearLayout)v.findViewById(R.id.j12);
        LinearLayout linearLayout13 = (LinearLayout)v.findViewById(R.id.j13);

        LinearLayout linearLayout21 = (LinearLayout)v.findViewById(R.id.j21);
        LinearLayout linearLayout22 = (LinearLayout)v.findViewById(R.id.j22);
        LinearLayout linearLayout23 = (LinearLayout)v.findViewById(R.id.j23);

        LinearLayout linearLayout31 = (LinearLayout)v.findViewById(R.id.j31);
        LinearLayout linearLayout32 = (LinearLayout)v.findViewById(R.id.j32);
        LinearLayout linearLayout33 = (LinearLayout)v.findViewById(R.id.j33);

        LinearLayout linearLayout41 = (LinearLayout)v.findViewById(R.id.j41);
        LinearLayout linearLayout42 = (LinearLayout)v.findViewById(R.id.j42);
        LinearLayout linearLayout43 = (LinearLayout)v.findViewById(R.id.j43);

        LinearLayout linearLayout51 = (LinearLayout)v.findViewById(R.id.j51);
        LinearLayout linearLayout52 = (LinearLayout)v.findViewById(R.id.j52);
        LinearLayout linearLayout53 = (LinearLayout)v.findViewById(R.id.j53);

        LinearLayout linearLayout61 = (LinearLayout)v.findViewById(R.id.j61);
        LinearLayout linearLayout62 = (LinearLayout)v.findViewById(R.id.j62);
        LinearLayout linearLayout63 = (LinearLayout)v.findViewById(R.id.j63);

        linearLayout11.setVisibility(View.GONE);
        linearLayout12.setVisibility(View.GONE);
        linearLayout13.setVisibility(View.GONE);

        linearLayout21.setVisibility(View.GONE);
        linearLayout22.setVisibility(View.GONE);
        linearLayout23.setVisibility(View.GONE);

        linearLayout31.setVisibility(View.GONE);
        linearLayout32.setVisibility(View.GONE);
        linearLayout33.setVisibility(View.GONE);

        linearLayout41.setVisibility(View.GONE);
        linearLayout42.setVisibility(View.GONE);
        linearLayout43.setVisibility(View.GONE);

        linearLayout51.setVisibility(View.GONE);
        linearLayout52.setVisibility(View.GONE);
        linearLayout53.setVisibility(View.GONE);

        linearLayout61.setVisibility(View.GONE);
        linearLayout62.setVisibility(View.GONE);
        linearLayout63.setVisibility(View.GONE);

        iv2.setVisibility(View.GONE);
        iv3.setVisibility(View.GONE);
        iv4.setVisibility(View.GONE);
        iv5.setVisibility(View.GONE);
        iv6.setVisibility(View.GONE);
        iv7.setVisibility(View.GONE);




        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        iv2.setScaleType(ImageView.ScaleType.FIT_XY);
        iv3.setScaleType(ImageView.ScaleType.FIT_XY);
        iv4.setScaleType(ImageView.ScaleType.FIT_XY);
        iv5.setScaleType(ImageView.ScaleType.FIT_XY);
        iv6.setScaleType(ImageView.ScaleType.FIT_XY);
        iv7.setScaleType(ImageView.ScaleType.FIT_XY);

        baseImageURL = activity.baseImageURL;
        baseImageURL2 = activity.baseImageURL2;
        baseImageURL3 = activity.baseImageURL3;
        baseImageURL4 = activity.baseImageURL4;
        baseImageURL5 = activity.baseImageURL5;
        baseImageURL6 = activity.baseImageURL6;
        baseImageURL7 = activity.baseImageURL7;



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

                    if(stdnum>1){

                        url = new URL(baseImageURL2);

                        conn = (HttpURLConnection)url.openConnection();
                        conn.setDoInput(true);
                        conn.connect();

                        is = conn.getInputStream();
                        bm2 = BitmapFactory.decodeStream(is);



                    }
                    if (stdnum > 2) {

                        url = new URL(baseImageURL3);

                        conn = (HttpURLConnection)url.openConnection();
                        conn.setDoInput(true);
                        conn.connect();

                        is = conn.getInputStream();
                        bm3 = BitmapFactory.decodeStream(is);




                    }
                    if (stdnum > 3) {
                        url = new URL(baseImageURL4);

                        conn = (HttpURLConnection)url.openConnection();
                        conn.setDoInput(true);
                        conn.connect();

                        is = conn.getInputStream();
                        bm4 = BitmapFactory.decodeStream(is);



                    }
                    if (stdnum > 5) {
                        url = new URL(baseImageURL5);

                        conn = (HttpURLConnection)url.openConnection();
                        conn.setDoInput(true);
                        conn.connect();

                        is = conn.getInputStream();
                        bm5 = BitmapFactory.decodeStream(is);

                        url = new URL(baseImageURL6);

                        conn = (HttpURLConnection)url.openConnection();
                        conn.setDoInput(true);
                        conn.connect();

                        is = conn.getInputStream();
                        bm6 = BitmapFactory.decodeStream(is);



                    }


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
            tv8.setText(activity.jongmok1);



            if(stdnum>1){

                iv2.setImageBitmap(bm2);

                tvName2.setText(activity.stdname2);
                tvAdd2.setText(activity.stdadd2);
                tvWatch2.setText(activity.stdwatch2);
                tvCar2.setText(activity.stdcar2);
                tvCall2.setText(activity.stdcall2);
                tvJongmok2.setText(activity.stdjongmok2);

                linearLayout11.setVisibility(View.VISIBLE);
                linearLayout12.setVisibility(View.VISIBLE);
                linearLayout13.setVisibility(View.VISIBLE);
                iv2.setVisibility(View.VISIBLE);

            }
            if (stdnum>2) {

                iv3.setImageBitmap(bm3);

                tvName3.setText(activity.stdname3);
                tvAdd3.setText(activity.stdadd3);
                tvWatch3.setText(activity.stdwatch3);
                tvCar3.setText(activity.stdcar3);
                tvCall3.setText(activity.stdcall3);
                tvJongmok3.setText(activity.stdjongmok3);

                linearLayout21.setVisibility(View.VISIBLE);
                linearLayout22.setVisibility(View.VISIBLE);
                linearLayout23.setVisibility(View.VISIBLE);
                iv3.setVisibility(View.VISIBLE);




            }
            if (stdnum > 3) {

                iv4.setImageBitmap(bm4);

                tvName4.setText(activity.stdname4);
                tvAdd4.setText(activity.stdadd4);
                tvWatch4.setText(activity.stdwatch4);
                tvCar4.setText(activity.stdcar4);
                tvCall4.setText(activity.stdcall4);
                tvJongmok4.setText(activity.stdjongmok4);

                linearLayout31.setVisibility(View.VISIBLE);
                linearLayout32.setVisibility(View.VISIBLE);
                linearLayout33.setVisibility(View.VISIBLE);
                iv4.setVisibility(View.VISIBLE);



            }
            if (stdnum > 5) {

                iv5.setImageBitmap(bm5);

                tvName5.setText(activity.stdname5);
                tvAdd5.setText(activity.stdadd5);
                tvWatch5.setText(activity.stdwatch5);
                tvCar5.setText(activity.stdcar5);
                tvCall5.setText(activity.stdcall5);
                tvJongmok5.setText(activity.stdjongmok5);

                linearLayout41.setVisibility(View.VISIBLE);
                linearLayout42.setVisibility(View.VISIBLE);
                linearLayout43.setVisibility(View.VISIBLE);
                iv5.setVisibility(View.VISIBLE);


                iv6.setImageBitmap(bm6);

                tvName6.setText(activity.stdname6);
                tvAdd6.setText(activity.stdadd6);
                tvWatch6.setText(activity.stdwatch6);
                tvCar6.setText(activity.stdcar6);
                tvCall6.setText(activity.stdcall6);
                tvJongmok6.setText(activity.stdjongmok6);

                linearLayout51.setVisibility(View.VISIBLE);
                linearLayout52.setVisibility(View.VISIBLE);
                linearLayout53.setVisibility(View.VISIBLE);
                iv6.setVisibility(View.VISIBLE);


            }
            if (stdnum > 6 ){

                iv7.setImageBitmap(bm6);

                linearLayout61.setVisibility(View.VISIBLE);
                linearLayout62.setVisibility(View.VISIBLE);
                linearLayout63.setVisibility(View.VISIBLE);
                iv7.setVisibility(View.VISIBLE);



            }






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






