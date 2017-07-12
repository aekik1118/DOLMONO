package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.os.AsyncTask;


/**
 * Created by aekik on 2017-07-07.
 */


public class jongmok extends Fragment{
    View v;
    MainActivity activity = (MainActivity) getActivity();
    public static String baseImageURL;



    ImageView iv;
    Bitmap bm;
    TextView tv;
    private ProgressDialog progressDialog;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_layout, container, false);

        iv = (ImageView) v.findViewById(R.id.imageView24);
        tv = (TextView)v.findViewById(R.id.textView20);

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

        }catch (InterruptedException e){

        }






        return v;
    }




}
