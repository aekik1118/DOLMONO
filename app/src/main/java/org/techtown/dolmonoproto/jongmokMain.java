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

        Button bt11 = (Button)v.findViewById(R.id.button11);

        bt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code2=%EC%B2%AD%EC%A3%BC%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt8 = (Button)v.findViewById(R.id.button8);

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code2=%EC%B2%AD%EC%A3%BC%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt7 = (Button)v.findViewById(R.id.button7);

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code2=%EC%B2%AD%EC%A3%BC%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt23 = (Button)v.findViewById(R.id.button23);

        bt23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code4=%EC%A0%9C%EC%B2%9C%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt24 = (Button)v.findViewById(R.id.button24);

        bt24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code4=%EC%A0%9C%EC%B2%9C%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt25 = (Button)v.findViewById(R.id.button25);

        bt25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code4=%EC%A0%9C%EC%B2%9C%EC%8B%9C&kwd="));
                startActivity(intent);
            }
        });

        Button bt1023 = (Button)v.findViewById(R.id.button1023);

        bt1023.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code9=%EC%A7%84%EC%B2%9C%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1024 = (Button)v.findViewById(R.id.button1024);

        bt1024.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code9=%EC%A7%84%EC%B2%9C%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1025 = (Button)v.findViewById(R.id.button1025);

        bt1025.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code9=%EC%A7%84%EC%B2%9C%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1123 = (Button)v.findViewById(R.id.button1123);

        bt1123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code11=%EC%9D%8C%EC%84%B1%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1124 = (Button)v.findViewById(R.id.button1124);

        bt1124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code11=%EC%9D%8C%EC%84%B1%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1125 = (Button)v.findViewById(R.id.button1125);

        bt1125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code11=%EC%9D%8C%EC%84%B1%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1223 = (Button)v.findViewById(R.id.button1223);

        bt1223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code5=%EB%B3%B4%EC%9D%80%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1224 = (Button)v.findViewById(R.id.button1224);

        bt1224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code5=%EB%B3%B4%EC%9D%80%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1225 = (Button)v.findViewById(R.id.button1225);

        bt1225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code5=%EB%B3%B4%EC%9D%80%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1323 = (Button)v.findViewById(R.id.button1323);

        bt1323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code10=%EA%B4%B4%EC%82%B0%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });


        Button bt1324 = (Button)v.findViewById(R.id.button1324);

        bt1324.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code10=%EA%B4%B4%EC%82%B0%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1325 = (Button)v.findViewById(R.id.button1325);

        bt1325.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code10=%EA%B4%B4%EC%82%B0%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1423 = (Button)v.findViewById(R.id.button1423);

        bt1423.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code8=%EC%A6%9D%ED%8F%89%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1424 = (Button)v.findViewById(R.id.button1424);

        bt1424.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code8=%EC%A6%9D%ED%8F%89%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1425 = (Button)v.findViewById(R.id.button1425);

        bt1425.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code8=%EC%A6%9D%ED%8F%89%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1523 = (Button)v.findViewById(R.id.button1523);

        bt1523.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code12=%EB%8B%A8%EC%96%91%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1524 = (Button)v.findViewById(R.id.button1524);

        bt1524.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code12=%EB%8B%A8%EC%96%91%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1525 = (Button)v.findViewById(R.id.button1525);

        bt1525.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code12=%EB%8B%A8%EC%96%91%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1623 = (Button)v.findViewById(R.id.button1623);

        bt1623.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code6=%EC%98%A5%EC%B2%9C%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1624 = (Button)v.findViewById(R.id.button1624);

        bt1624.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code6=%EC%98%A5%EC%B2%9C%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1625 = (Button)v.findViewById(R.id.button1625);

        bt1625.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code6=%EC%98%A5%EC%B2%9C%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1723 = (Button)v.findViewById(R.id.button1723);

        bt1723.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=226&mod=&scode=00000002&code7=%EC%98%81%EB%8F%99%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1724 = (Button)v.findViewById(R.id.button1724);

        bt1724.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=225&mod=&scode=00000002&code7=%EC%98%81%EB%8F%99%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });

        Button bt1725 = (Button)v.findViewById(R.id.button1725);

        bt1725.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://tour.chungbuk.go.kr/home/sub.php?menukey=222&mod=&scode=00000002&code7=%EC%98%81%EB%8F%99%EA%B5%B0&kwd="));
                startActivity(intent);
            }
        });









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
