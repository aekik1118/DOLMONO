package org.techtown.dolmonoproto;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by aekik on 2017-06-26.
 */

public class jongmok19 extends Fragment{
    View v;
    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_19, container, false);

        activity = (MainActivity) getActivity();

        activity.setTitle("10.19 (목)");



        ImageView iv528 = (ImageView)v.findViewById(R.id.imageView528);


        Button bt58 = (Button)v.findViewById(R.id.button58);

        bt58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code3=%EC%B6%A9%EC%A3%BC%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt511 = (Button)v.findViewById(R.id.button511);

        bt511.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code3=%EC%B6%A9%EC%A3%BC%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt57 = (Button)v.findViewById(R.id.button57);

        bt57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code3=%EC%B6%A9%EC%A3%BC%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });



        iv528.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="건국대학교 축구장";
                activity.stdadd="충북 충주시 단월동 322";
                activity.stdwatch="-석";
                activity.stdcall="043-840-3115";
                activity.stdcar="70대";
                activity.stdjongmok="축구(남대부)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203101820113HNWH2w.jpg";
                activity.sogeaLastIndex=8;
                activity.sogeaNum=9;
                activity.jongmokName="축구";
                activity.stdnum=7;

                activity.jongmok1="남고부, 여고부, 여대부, 남일부\n" +
                        "20(금), 22(일), 24(화), 26(목)\n" +
                        "\n" +
                        "남대부\n" +
                        "19(목), 21(토), 23(월), 24(화), 26(목)\n" +
                        "\n" +
                        "해외동포\n" +
                        "21(토), 22(일), 23(월), 24(화), 25(수)";


                activity.stdname2="수안보생활체육공원축구장";
                activity.stdadd2="충북 충주시 수안보면 수안보로 72";
                activity.stdwatch2="500석";
                activity.stdcall2="043-850-3904";
                activity.stdcar2="100대";
                activity.stdjongmok2="축구 (해외동포)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203105301844NQrZHs.jpg";

                activity.stdname3="예성여고축구장";
                activity.stdadd3="충북 충주시 호암대로 42";
                activity.stdwatch3="-석";
                activity.stdcall3="043-848-9865";
                activity.stdcar3="100대";
                activity.stdjongmok3="축구 (여고부)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203105909637umPF23.jpg";

                activity.stdname4="충주상고축구장";
                activity.stdadd4="충북 충주시 방아길 20";
                activity.stdwatch4="-석";
                activity.stdcall4="043-844-3323";
                activity.stdcar4="60대";
                activity.stdjongmok4="축구 (남고부)";
                activity.baseImageURL4="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025310936vf1yHE.jpg";

                activity.stdname5="충주종합운동장(교현)";
                activity.stdadd5="충북 충주시 예성로 266";
                activity.stdwatch5="17,000석";
                activity.stdcall5="043-850-3904";
                activity.stdcar5="150대";
                activity.stdjongmok5="축구 (남일부)";
                activity.baseImageURL5="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203053957538U0DB62.jpg";

                activity.stdname6="탄금대축구장A";
                activity.stdadd6="충북 충주시 남한강로 8";
                activity.stdwatch6="317석";
                activity.stdcall6="043-870-7832";
                activity.stdcar6="70대";
                activity.stdjongmok6="축구 (여대부)";
                activity.baseImageURL6="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203054713004tWbXcu.jpg";



                activity.onFragmentChanged(53);
            }
        });







        return v;
    }




}
