package org.techtown.dolmonoproto;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageAdapter extends PagerAdapter {

    Context context;
    Bitmap galImage,bm;
    BitmapFactory.Options options;
    private int[] galImages = new int[] {
            1,
            2,
            3,
            4,
            5,
            6

    };
    public static String baseImageURL;


    ImageAdapter(Context context) {
        this.context = context;
        options = new BitmapFactory.Options();











    }

    @Override
    public int getCount() {
        return galImages.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ImageView) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        int padding = 0;
        int c = 14;
        imageView.setPadding(padding, padding, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        baseImageURL = "http://2017sports.chungbuk.go.kr/DATA/sport/entries/"+c+"_"+(position+1)+".jpg";



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

        }catch (InterruptedException e){

        }


        options.inSampleSize = 4;
        galImage = BitmapFactory.decodeResource(context.getResources(), galImages[position], options);

        imageView.setImageBitmap(bm);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }
}