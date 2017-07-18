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
    public int index,num;


    private int[] galImages = new int[] {
            1,
            2,
            3,
            4,
            5,
            6

    };
    public static String baseImageURL;


    ImageAdapter(Context context,int index, int num) {
        this.context = context;
        this.index = index;
        this.num = num;
        options = new BitmapFactory.Options();


        if(index == 5)
        {
            galImages = new int[]{
                    1,2,3,4,5
            };
        }
        else if(index == 7)
        {
            galImages = new int[]{
                    1,2,3,4,5,6,7
            };

        }
        else if(index == 8)
        {
            galImages = new int[]{
                    1,2,3,4,5,6,7,8
            };

        }
        else if(index == 9)
        {
            galImages = new int[]{
                    1,2,3,4,5,6,7,8,9
            };
        }


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
        imageView.setPadding(padding, padding, padding, padding);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);


        if(num==15&&position==5)
        {
            baseImageURL = "http://2017sports.chungbuk.go.kr/DATA/sport/entries/"+num+"_"+(position+2)+".jpg";
        }
        else
        {
            baseImageURL = "http://2017sports.chungbuk.go.kr/DATA/sport/entries/"+num+"_"+(position+1)+".jpg";
        }

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