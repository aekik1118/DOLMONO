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
    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_main_layout, container, false);

        activity = (MainActivity) getActivity();

        activity.setTitle("경기 종목");



        ImageView iv530 = (ImageView)v.findViewById(R.id.imageView530);
        ImageView iv528 = (ImageView)v.findViewById(R.id.imageView528);
        ImageView iv529 = (ImageView)v.findViewById(R.id.imageView529);
        ImageView iv524 = (ImageView)v.findViewById(R.id.imageView524);

        ImageView iv630 = (ImageView)v.findViewById(R.id.imageView630);
        ImageView iv628 = (ImageView)v.findViewById(R.id.imageView628);
        ImageView iv629 = (ImageView)v.findViewById(R.id.imageView629);
        ImageView iv624 = (ImageView)v.findViewById(R.id.imageView624);

        ImageView iv730 = (ImageView)v.findViewById(R.id.imageView730);
        ImageView iv728 = (ImageView)v.findViewById(R.id.imageView728);
        ImageView iv729 = (ImageView)v.findViewById(R.id.imageView729);
        ImageView iv724 = (ImageView)v.findViewById(R.id.imageView724);

        ImageView iv830 = (ImageView)v.findViewById(R.id.imageView830);
        ImageView iv828 = (ImageView)v.findViewById(R.id.imageView828);
        ImageView iv829 = (ImageView)v.findViewById(R.id.imageView829);

        ImageView iv130 = (ImageView)v.findViewById(R.id.imageView130);
        ImageView iv128 = (ImageView)v.findViewById(R.id.imageView128);
        ImageView iv129 = (ImageView)v.findViewById(R.id.imageView129);
        ImageView iv124 = (ImageView)v.findViewById(R.id.imageView124);

        ImageView iv230 = (ImageView)v.findViewById(R.id.imageView230);
        ImageView iv228 = (ImageView)v.findViewById(R.id.imageView228);
        ImageView iv229 = (ImageView)v.findViewById(R.id.imageView229);
        ImageView iv224 = (ImageView)v.findViewById(R.id.imageView224);

        ImageView iv330 = (ImageView)v.findViewById(R.id.imageView330);
        ImageView iv328 = (ImageView)v.findViewById(R.id.imageView328);
        ImageView iv329 = (ImageView)v.findViewById(R.id.imageView329);
        ImageView iv324 = (ImageView)v.findViewById(R.id.imageView324);

        ImageView iv430 = (ImageView)v.findViewById(R.id.imageView430);
        ImageView iv428 = (ImageView)v.findViewById(R.id.imageView428);
        ImageView iv429 = (ImageView)v.findViewById(R.id.imageView429);

        ImageView iv930 = (ImageView)v.findViewById(R.id.imageView930);
        ImageView iv928 = (ImageView)v.findViewById(R.id.imageView928);
        ImageView iv929 = (ImageView)v.findViewById(R.id.imageView929);
        ImageView iv924 = (ImageView)v.findViewById(R.id.imageView924);

        ImageView iv1030 = (ImageView)v.findViewById(R.id.imageView1030);
        ImageView iv1028 = (ImageView)v.findViewById(R.id.imageView1028);
        ImageView iv1029 = (ImageView)v.findViewById(R.id.imageView1029);

        ImageView iv1130 = (ImageView)v.findViewById(R.id.imageView1130);
        ImageView iv1128 = (ImageView)v.findViewById(R.id.imageView1128);

        ImageView iv1230 = (ImageView)v.findViewById(R.id.imageView1230);
        ImageView iv1228 = (ImageView)v.findViewById(R.id.imageView1228);

        ImageView iv1330 = (ImageView)v.findViewById(R.id.imageView1330);
        ImageView iv1328 = (ImageView)v.findViewById(R.id.imageView1328);

        ImageView iv1430 = (ImageView)v.findViewById(R.id.imageView1430);

        ImageView iv1530 = (ImageView)v.findViewById(R.id.imageView1530);

        ImageView iv1630 = (ImageView)v.findViewById(R.id.imageView1630);

        ImageView iv1730 = (ImageView)v.findViewById(R.id.imageView1730);

        ImageView iv1830 = (ImageView)v.findViewById(R.id.imageView1830);

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
                activity.stdname="충주일원";
                activity.stdadd="충북 충주시 호암동 626번지";
                activity.stdwatch="15000석";
                activity.stdcall="043-850-0411";
                activity.stdcar="-대";
                activity.stdjongmok="육상(마라톤)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025730971qQXH31.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=15;
                activity.jongmokName="육상";
                activity.stdnum=3;


                activity.stdname2="충주일원";
                activity.stdadd2="충북 충주시 호암동 626번지";
                activity.stdwatch2="-석";
                activity.stdcall2="043-850-0411";
                activity.stdcar2="-대";
                activity.stdjongmok2="육상 (경보)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025809173YJWUli.jpg";

                activity.stdname3="충주종합운동장(호암)";
                activity.stdadd3="충북 충주시 호암동 626번지";
                activity.stdwatch3="15,000석";
                activity.stdcall3="043-850-0432";
                activity.stdcar3="1,388대";
                activity.stdjongmok3="육상 (트랙,필드)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203054211981TCPez4.jpg";




                activity.onFragmentChanged(53);
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

        iv529.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="건국대학교체육관";
                activity.stdadd="충북 충주시 충원대로 268";
                activity.stdwatch="1520석";
                activity.stdcall="043-840-3121";
                activity.stdcar="250대";
                activity.stdjongmok="복싱(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203102143634k2hfxd.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=32;
                activity.jongmokName="복싱";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv524.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="탄금 테니스장(충주)";
                activity.stdadd="충북 충주시 낙수당2길 8";
                activity.stdwatch="100석";
                activity.stdcall="043-870-7832";
                activity.stdcar="1,000대";
                activity.stdjongmok="테니스(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203054918897Vfn3Qo.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=5;
                activity.jongmokName="테니스";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv630.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="호암 제 2체육관 (충주)";
                activity.stdadd="충북 충주시 중원대로 3306";
                activity.stdwatch="500석";
                activity.stdcall="043-870-7832";
                activity.stdcar="300대";
                activity.stdjongmok="레슬링(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170222052942441PTkNpn.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=37;
                activity.jongmokName="레슬링";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv628.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="호암체육관 (충주)";
                activity.stdadd="충북 충주시 중원대로 3306";
                activity.stdwatch="970석";
                activity.stdcall="043-870-7832";
                activity.stdcar="300대";
                activity.stdjongmok="배드민턴(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203055309898ymo4mP.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=34;
                activity.jongmokName="배드민턴";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv629.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="충주체육관";
                activity.stdadd="충북 충주시 예성로 266";
                activity.stdwatch="3,200석";
                activity.stdcall="043-850-3904";
                activity.stdcar="120대";
                activity.stdjongmok="태권도(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/2017020305431463397SkPR.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=46;
                activity.jongmokName="태권도";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv624.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="탄금호 국제 조정경기장";
                activity.stdadd="충북 충주시 중앙탑면 중앙탑길 150";
                activity.stdwatch="1,100석";
                activity.stdcall="043-850-2993";
                activity.stdcar="-대";
                activity.stdjongmok="조정(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203055009402vbgNZS.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=12;
                activity.jongmokName="조정";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv730.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="충주 요트경기장";
                activity.stdadd="충북 충주시 동량면 지등로 1604";
                activity.stdwatch="-석";
                activity.stdcall="043-4223-9969";
                activity.stdcar="-대";
                activity.stdjongmok="세일링(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025642350QRAZde.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=27;
                activity.jongmokName="세일링";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv728.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="충주 문화회관";
                activity.stdadd="충북 충주시 중앙로 128";
                activity.stdwatch="923석";
                activity.stdcall="043-850-3911";
                activity.stdcar="120대";
                activity.stdjongmok="보디빌딩(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025227922ZQKpSo.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=33;
                activity.jongmokName="보디빌딩";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv729.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="교통대학교 체육관(충주)";
                activity.stdadd="충북 충주시 대소원면 대학로 50";
                activity.stdwatch="710석";
                activity.stdcall="043-841-5051";
                activity.stdcar="150대";
                activity.stdjongmok="바둑(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170222052735960HH6ZmD.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=36;
                activity.jongmokName="바둑";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv724.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="수안보 인공 암벽장";
                activity.stdadd="충북 충주시 수안보면 수안보로 129";
                activity.stdwatch="-석";
                activity.stdcall="043-850-3904";
                activity.stdcar="-대";
                activity.stdjongmok="산악(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203105400827Fte3Tw.jpg";
                activity.sogeaLastIndex=5;
                activity.sogeaNum=28;
                activity.jongmokName="산악";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv830.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="중앙경찰학교 체육관";
                activity.stdadd="충북 충주시 수안보면 수회리로 138";
                activity.stdwatch="600석";
                activity.stdcall="043-870-2272";
                activity.stdcar="50대";
                activity.stdjongmok="택견(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/201702031118081039RpUbP.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=6;
                activity.jongmokName="택견";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv828.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="탄금호 수상스키장";
                activity.stdadd="충북 충주시 중앙탑면 창동리 208";
                activity.stdwatch="-석";
                activity.stdcall="043-8844-4402";
                activity.stdcar="-대";
                activity.stdjongmok="수상스키(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203055136020ZA8Soo.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=25;
                activity.jongmokName="수상스키";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv829.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="탄금호 국제 조정경기장 일원";
                activity.stdadd="충북 충주시 중앙탑면 중앙탑길 150";
                activity.stdwatch="1,100석";
                activity.stdcall="043-850-2993";
                activity.stdcar="-대";
                activity.stdjongmok="철인3종(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/201702030550570518laKA1.jpg";
                activity.sogeaLastIndex=8;
                activity.sogeaNum=11;
                activity.jongmokName="철인3종";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 실내수영장";
                activity.stdadd="충북 청주시 서원구 흥덕로 61";
                activity.stdwatch="1,024석";
                activity.stdcall="043-270-8512";
                activity.stdcar="500대";
                activity.stdjongmok="수영(경영, 수구)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115128059tFZPl0.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=24;
                activity.jongmokName="수영";
                activity.stdnum=2;

                activity.stdname2="충북학생수영장";
                activity.stdadd2="충북 청주시 청원구 공항로59번길 33";
                activity.stdwatch2="530석";
                activity.stdcall2="043-254-7251";
                activity.stdcar2="200대";
                activity.stdjongmok2="수영 (싱크로,다이빙)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025050736LVOYhD.jpg";



                activity.onFragmentChanged(53);
            }
        });

        iv128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 야구장";
                activity.stdadd="충북 청주시 서원구 사직대로 229";
                activity.stdwatch="10,500석";
                activity.stdcall="043-201-2381";
                activity.stdcar="500대";
                activity.stdjongmok="야구 소프트볼(일반부)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115224886RLwU8T.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=20;
                activity.jongmokName="야구";
                activity.stdnum=3;


                activity.stdname2="세광고야구장";
                activity.stdadd2="충북 청주시 서원구 2순환로 1572";
                activity.stdwatch2="250석";
                activity.stdcall2="043-230-1904";
                activity.stdcar2="300대";
                activity.stdjongmok2="야구소프트볼(야구) (고등부)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203104927417ocTQJA.jpg";

                activity.stdname3="보은스포츠파크 야구장";
                activity.stdadd3="충북 보은군 보은읍 이평리 16-2";
                activity.stdwatch3="350석";
                activity.stdcall3="043-540-3378";
                activity.stdcar3="-대";
                activity.stdjongmok3="야구소프트볼(야구) (여자부)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170531060125138AtYcQ1.jpg";




                activity.onFragmentChanged(53);
            }
        });

        iv129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 정구장";
                activity.stdadd="충북 청주시 흥덕구 대신로 157";
                activity.stdwatch="930석";
                activity.stdcall="043-201-2381";
                activity.stdcar="100대";
                activity.stdjongmok="정구(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115636128uBvc2I.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=13;
                activity.jongmokName="정구";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주대 석우 문화체육관";
                activity.stdadd="충북 청주시 청원구 대성로 298";
                activity.stdwatch="3,500석";
                activity.stdcall="043-229-8086";
                activity.stdcar="400대";
                activity.stdjongmok="핸드볼(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203112353279gKc2wL.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=1;
                activity.jongmokName="핸드볼";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="공군사관학교 성무종합경기장";
                activity.stdadd="충북 청주시 남일면 단재로 635";
                activity.stdwatch="3,000석";
                activity.stdcall="043-290-6217";
                activity.stdcar="150대";
                activity.stdjongmok="럭비(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203102304359NxSNFN.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=38;
                activity.jongmokName="럭비";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 유도회관";
                activity.stdadd="충북 청주시 상당구 1순환로 1514번길 70";
                activity.stdwatch="380석";
                activity.stdcall="043-201-2381";
                activity.stdcar="200대";
                activity.stdjongmok="유도(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115320030P6HH9S.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=16;
                activity.jongmokName="유도";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="김수녕 양궁장";
                activity.stdadd="충북 청주시 상당구 1순환로 1514번길 89";
                activity.stdwatch="128석";
                activity.stdcall="043-270-8512";
                activity.stdcar="150대";
                activity.stdjongmok="양궁(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103203630XWIoGB.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=19;
                activity.jongmokName="양궁";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 종합사격장";
                activity.stdadd="충북 청주시 청원구 내수읍 도원세교로 369";
                activity.stdwatch="300석";
                activity.stdcall="043-270-7370";
                activity.stdcar="150대";
                activity.stdjongmok="사격(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115837274iAElYb.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=30;
                activity.jongmokName="사격";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="금강볼링장";
                activity.stdadd="충북 청주시 흥덕구 사운로 223";
                activity.stdwatch="-석";
                activity.stdcall="043-275-2222";
                activity.stdcar="70대";
                activity.stdjongmok="볼링(남일부)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103041624DXCMBj.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=31;
                activity.jongmokName="볼링";
                activity.stdnum=6;

                activity.stdname2="라이프볼링장";
                activity.stdadd2="충북 청주시 흥덕구 월명로 196";
                activity.stdwatch2="-석";
                activity.stdcall2="043-271-7117";
                activity.stdcar2="100대";
                activity.stdjongmok2="볼링 (여일부)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103554577yUYHnR.jpg";

                activity.stdname3="로얄볼링장";
                activity.stdadd3="충북 청주시 청원구 1순환로 352";
                activity.stdwatch3="-석";
                activity.stdcall3="043-258-2001";
                activity.stdcar3="40대";
                activity.stdjongmok3="볼링 (여고부)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103751350KVC69B.jpg";

                activity.stdname4="반도프라임볼링타운";
                activity.stdadd4="충북 청주시 청원구 오창읍 과학산업2로 430";
                activity.stdwatch4="-석";
                activity.stdcall4="043-216-0929";
                activity.stdcar4="100대";
                activity.stdjongmok4="볼링 (해외동포)";
                activity.baseImageURL4="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203104003863O3nqHQ.jpg";

                activity.stdname5="오창볼링장";
                activity.stdadd5="충북 청주시 청원구 오창읍 중심상업로 66-17";
                activity.stdwatch5="-석";
                activity.stdcall5="043-214-0753";
                activity.stdcar5="40대";
                activity.stdjongmok5="볼링 (대학부)";
                activity.baseImageURL5="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203110019190PBt6F9.jpg";

                activity.stdname6="정석볼링장";
                activity.stdadd6="충북 청주시 흥덕구 강서로 110";
                activity.stdwatch6="-석";
                activity.stdcall6="043-263-6000";
                activity.stdcar6="-대";
                activity.stdjongmok6="볼링 (남고부)";
                activity.baseImageURL6="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203110621556yFce0q.jpg";


                activity.onFragmentChanged(53);
            }
        });

        iv328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="충북 학생 롤러경기장";
                activity.stdadd="충북 청주시 흥덕구 수의로 221";
                activity.stdwatch="468석";
                activity.stdcall="043-234-5054";
                activity.stdcar="-대";
                activity.stdjongmok="롤러(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203024940483hVskGn.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=14;
                activity.jongmokName="롤러";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv329.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="충북 학생수영장";
                activity.stdadd="충북 청주시 청원구 공항로 59번길 33";
                activity.stdwatch="530석";
                activity.stdcall="043-254-7251";
                activity.stdcar="200대";
                activity.stdjongmok="핀수영(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025040363onFRvP.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=3;
                activity.jongmokName="핀수영";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv324.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 종합경기장";
                activity.stdadd="충북 청주시 서원구 사직대로 229";
                activity.stdwatch="16,280석";
                activity.stdcall="043-201-2381";
                activity.stdcar="500대";
                activity.stdjongmok="근대5종(복합(육상+사격))";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115753152lvGOhz.jpg";
                activity.sogeaLastIndex=9;
                activity.sogeaNum=42;
                activity.jongmokName="근대5종";
                activity.stdnum=4;



                activity.stdname2="청주실내수영장";
                activity.stdadd2="충북 청주시 서원구 흥덕로 61";
                activity.stdwatch2="1,024석";
                activity.stdcall2="043-270-8512";
                activity.stdcar2="500대";
                activity.stdjongmok2="근대5종 (수영)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203114900032CfIu7k.jpg";

                activity.stdname3="충북스포츠센터";
                activity.stdadd3="충북 청주시 서원구 흥덕로 37";
                activity.stdwatch3="322석";
                activity.stdcall3="043-201-2381";
                activity.stdcar3="200대";
                activity.stdjongmok3="근대5종 (펜싱)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203024745828COfkTJ.jpg";

                activity.stdname4="국군체육부대 승마장";
                activity.stdadd4="경북 문경시 호계면 상무로 101";
                activity.stdwatch4="600석";
                activity.stdcall4="054-559-6035";
                activity.stdcar4="-대";
                activity.stdjongmok4="근대5종 (승마)";
                activity.baseImageURL4="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103915922GAEP7P.jpg";










                activity.onFragmentChanged(53);
            }
        });

        iv430.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주체육관";
                activity.stdadd="충북 청주시 서원구 사직대로 229";
                activity.stdwatch="4,180석";
                activity.stdcall="043-201-2381";
                activity.stdcar="500대";
                activity.stdjongmok="농구(일반부)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203120452521jrpxkI.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=41;
                activity.jongmokName="농구";
                activity.stdnum=2;

                activity.stdname2="신흥고체육관";
                activity.stdadd2="충북 청주시 청원구 율봉로 229";
                activity.stdwatch2="800석";
                activity.stdcall2="043-211-8801";
                activity.stdcar2="-대";
                activity.stdjongmok2="농구 (고등부)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203105548497hnPxmj.jpg";


                activity.onFragmentChanged(53);
            }
        });

        iv428.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 장애인 스포츠센터";
                activity.stdadd="충북 청주시 청원구 사천로 18번길 81";
                activity.stdwatch="250석";
                activity.stdcall="043-201-2381";
                activity.stdcar="-대";
                activity.stdjongmok="검도(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203115418704TcnTJX.jpg";
                activity.sogeaLastIndex=5;
                activity.sogeaNum=45;
                activity.jongmokName="검도";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv429.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청주 스쿼시경기장";
                activity.stdadd="충북 청주시 상당구 월오동 179-3";
                activity.stdwatch="255석";
                activity.stdcall="043-201-2153";
                activity.stdcar="255대";
                activity.stdjongmok="스쿼시(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/201705181032487199CwA0h.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=23;
                activity.jongmokName="스쿼시";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv930.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="세명대 체육관(제천)";
                activity.stdadd="충북 제천시 세명로 65";
                activity.stdwatch="1,800석";
                activity.stdcall="043-649-1562";
                activity.stdcar="200대";
                activity.stdjongmok="배구(남대, 남일)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/201702031050152486IubhE.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=35;
                activity.jongmokName="배구";
                activity.stdnum=3;

                activity.stdname2="대원대학교민송체육관";
                activity.stdadd2="충북 제천시 대학로 316";
                activity.stdwatch2="150석";
                activity.stdcall2="043-649-3161";
                activity.stdcar2="200대";
                activity.stdjongmok2="배구 (남고부)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103426836OAtFI4.jpg";

                activity.stdname3="제천중학교체육관";
                activity.stdadd3="충북 제천시 의병대로 29";
                activity.stdwatch3="150석";
                activity.stdcall3="043-646-5642";
                activity.stdcar3="100대";
                activity.stdjongmok3="배구 (여고·여일)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203111059631hcyrvx.jpg";


                activity.onFragmentChanged(53);
            }
        });

        iv928.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="제천 산악자전거 경기장";
                activity.stdadd="충북 제천시 송학면 명암로 1031";
                activity.stdwatch="150석";
                activity.stdcall="043-641-5573";
                activity.stdcar="50대";
                activity.stdjongmok="자전거(MTB전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203110748655QrLDyH.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=29;
                activity.jongmokName="자전거(MTB)";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv929.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="제천 어울림 체육관 ";
                activity.stdadd="충북 제천시 관전로 70";
                activity.stdwatch="150석";
                activity.stdcall="043-641-5601";
                activity.stdcar="100대";
                activity.stdjongmok="체조(리듬체조,에어로빅)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203110905143sAu9RI.jpg";
                activity.sogeaLastIndex=5;
                activity.sogeaNum=10;
                activity.jongmokName="체조";
                activity.stdnum=2;

                activity.stdname2="제천체육관";
                activity.stdadd2="충북 제천시 숭의로 85";
                activity.stdwatch2="3,300석";
                activity.stdcall2="043-641-5573";
                activity.stdcar2="200대";
                activity.stdjongmok2="체조 (기계체조)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203111223411jexozT.jpg";



                activity.onFragmentChanged(53);
            }
        });

        iv924.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="청풍명월 국제하키장(제천)";
                activity.stdadd="충북 제천시 청풍면 물태리 103";
                activity.stdwatch="800석";
                activity.stdcall="043-641-4809";
                activity.stdcar="500대";
                activity.stdjongmok="하키(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203120605907gD1t4D.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=2;
                activity.jongmokName="하키";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1030.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="충북체고 체육관(진천)";
                activity.stdadd="충북 진천군 문백면 도하3길 120";
                activity.stdwatch="1,000석";
                activity.stdcall="043-531-8023";
                activity.stdcar="200대";
                activity.stdjongmok="펜싱(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203024845053tDBR8V.jpg";
                activity.sogeaLastIndex=8;
                activity.sogeaNum=4;
                activity.jongmokName="펜싱";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1028.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="초평 카누경기장 (진천)";
                activity.stdadd="충북 진천군 초평면 평화로 403-130";
                activity.stdwatch="-석";
                activity.stdcall="043-539-3612";
                activity.stdcar="100대";
                activity.stdjongmok="카누";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203024640320OBYWYD.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=8;
                activity.jongmokName="카누";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1029.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="아트밸리CC (진천)";
                activity.stdadd="충북 진천군 진천읍 송강로 783-51";
                activity.stdwatch="-석";
                activity.stdcall="043-531-3012";
                activity.stdcar="-대";
                activity.stdjongmok="골프(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/201702031056574752bkUAT.jpg";
                activity.sogeaLastIndex=5;
                activity.sogeaNum=44;
                activity.jongmokName="골프";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="음성 종합운동장";
                activity.stdadd="충북 음성군 음성읍 설성로 47";
                activity.stdwatch="7,000석";
                activity.stdcall="043-871-2460";
                activity.stdcar="300대";
                activity.stdjongmok="자전거(트랙경기)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203114649005PMdb9B.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=29;
                activity.jongmokName="자전거(트랙)";
                activity.stdnum=3;

                activity.stdname2="음성군 일원";
                activity.stdadd2="음성군";
                activity.stdwatch2="-석";
                activity.stdcall2="043-871-2460";
                activity.stdcar2="-대";
                activity.stdjongmok2="자전거 (개인도로, 단체 전종별)";
                activity.baseImageURL2="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203114522902UYaOQR.jpg";

                activity.stdname3="충주-음성간 도로";
                activity.stdadd3="충주-음성";
                activity.stdwatch3="-석";
                activity.stdcall3="043-871-2460";
                activity.stdcar3="-대";
                activity.stdjongmok3="자전거 (도로독주 전종별)";
                activity.baseImageURL3="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203025140706MOvkAH.jpg";

                activity.onFragmentChanged(53);
            }
        });

        iv1128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="음성 실내체육관";
                activity.stdadd="충북 음성군 음성읍 설성로 47";
                activity.stdwatch="1,587석";
                activity.stdcall="043-871-2460";
                activity.stdcar="300대";
                activity.stdjongmok="댄스스포츠(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203110523762y8TtMk.jpg";
                activity.sogeaLastIndex=5;
                activity.sogeaNum=39;
                activity.jongmokName="댄스스포츠";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="보은 국민체육센터";
                activity.stdadd="충북 보은군 보은읍 군청길 38-1";
                activity.stdwatch="1,000석";
                activity.stdcall="043-540-3463";
                activity.stdcar="200대";
                activity.stdjongmok="세팍타크로(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203104141027AW0g7g.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=26;
                activity.jongmokName="세팍타크로";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="보은 스포츠파크 야구장";
                activity.stdadd="충북 충북 보은군 보은읍 이평리 16-2";
                activity.stdwatch="350석";
                activity.stdcall="043-540-3378";
                activity.stdcar="-대";
                activity.stdjongmok="야구 소프트볼(야구)(여자부)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170531060125138AtYcQ1.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=20;
                activity.jongmokName="소프트볼";
                activity.stdnum=1;





                activity.onFragmentChanged(53);


            }
        });

        iv1330.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="사호정(괴산)";
                activity.stdadd="충북 괴산군 괴산읍 동진천길 213";
                activity.stdwatch="-석";
                activity.stdcall="043-830-3810";
                activity.stdcar="500대";
                activity.stdjongmok="궁도(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/201702031044028687lwXHL.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=43;
                activity.jongmokName="궁도";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="괴산 문화체육센터";
                activity.stdadd="충북 괴산군 괴산읍 임꺽정로 99-9";
                activity.stdwatch="1,457석";
                activity.stdcall="043-830-3830";
                activity.stdcar="300대";
                activity.stdjongmok="당구(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203102448520IwDVIE.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=40;
                activity.jongmokName="당구";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1430.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="증평 종합 스포츠센터";
                activity.stdadd="충북 증평군 증평읍 인삼로 23";
                activity.stdwatch="1,370석";
                activity.stdcall="043-835-3663";
                activity.stdcar="100대";
                activity.stdjongmok="당구(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203112203927NGzriq.jpg";
                activity.sogeaLastIndex=8;
                activity.sogeaNum=21;
                activity.jongmokName="씨름";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1530.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="단양 국민체육센터";
                activity.stdadd="충북 단양군 단양읍 군청로 84-8";
                activity.stdwatch="1,200석";
                activity.stdcall="043-420-3105";
                activity.stdcar="600대";
                activity.stdjongmok="탁구(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203103316908kuVtYM.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=7;
                activity.jongmokName="탁구";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1630.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="옥천 체육센터";
                activity.stdadd="충북 옥천군 옥천읍 관성로 53";
                activity.stdwatch="1,750석";
                activity.stdcall="043-730-4865";
                activity.stdcar="150대";
                activity.stdjongmok="우슈(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203110118757CQIZc8.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=17;
                activity.jongmokName="우슈";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1730.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="영동체육관";
                activity.stdadd="충북 영동군 영동읍 영동황간로 122";
                activity.stdwatch="1,410석";
                activity.stdcall="043-740-5992";
                activity.stdcar="200대";
                activity.stdjongmok="역도(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203105755364IMFM9P.jpg";
                activity.sogeaLastIndex=6;
                activity.sogeaNum=18;
                activity.jongmokName="역도";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });

        iv1830.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.stdname="상주 국제승마장(실외)";
                activity.stdadd="경북 상주시 사벌면 경천로 683-47";
                activity.stdwatch="1,270석";
                activity.stdcall="054-535-5365";
                activity.stdcar="126대";
                activity.stdjongmok="승마(전종별)";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203104451337pY9mwL.jpg";
                activity.sogeaLastIndex=7;
                activity.sogeaNum=22;
                activity.jongmokName="승마";
                activity.stdnum=1;
                activity.onFragmentChanged(53);
            }
        });





        return v;
    }




}
