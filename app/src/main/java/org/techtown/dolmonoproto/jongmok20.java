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

public class jongmok20 extends Fragment{
    View v;
    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_20, container, false);

        activity = (MainActivity) getActivity();

        activity.setTitle("10.20 (금)");


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
                activity.jongmok1="20(금), 21(토), 22(일), 23(월), 24(화), 25(수)";
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
                activity.jongmok1="그레고로만형\n" +
                        "20(금)(계체), 21(토), 22(일), 23(월)\n" +
                        "\n" +
                        "자유형\n" +
                        "23(월)(계체), 24(화), 25(수), 26(목)\n" +
                        "\n" +
                        "여고부\n" +
                        "21(토)(계체), 22(일), 23(월)\n" +
                        "\n" +
                        "여일부\n" +
                        "22(일)(계체), 23(월), 24(화)";
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
                activity.jongmok1="20(금), 21(토), 22(일), 23(월), 24(화), 25(수), 26(목)";
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
                activity.jongmok1="고등부\n" +
                        "21(토), 23(월), 25(수), 26(목)\n" +
                        "\n" +
                        "대학, 일반\n" +
                        "20(금), 22(일), 24(화), 26(목)";

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
                activity.jongmok1="펜싱, 수영, 복합\n" +
                        "20(금),21(토),22(일),23(월)\n" +
                        "\n" +
                        "승마\n" +
                        "25(수)";
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
                activity.jongmok1="남고, 여고, 남일, 여일, 해외동포\n" +
                        "20(금)(연습), 21(토), 22(일), 23(월), 24(화), 25(수)\n" +
                        "\n" +
                        "대학부\n" +
                        "21(토)(연습), 22(일), 23(월), 24(화), 25(수)";

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
                activity.jongmok1="20(금)(연습), 21(토), 22(일), 23(월), 24(화), 25(수)";
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
                activity.jongmok1="트랙\n" +
                        "20(금), 21(토), 22(일), 23(월)\n" +
                        "\n" +
                        "도로\n" +
                        "24(화), 25(수), 26(목)";
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
                activity.jongmok1="21(토), 22(일), 23(월)";
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
                activity.stdjongmok="씨름";
                activity.baseImageURL="http://2017sports.chungbuk.go.kr/DATA/stadium/20170203112203927NGzriq.jpg";
                activity.sogeaLastIndex=8;
                activity.sogeaNum=21;
                activity.jongmokName="씨름";
                activity.stdnum=1;
                activity.jongmok1="고등부\n" +
                        "20(금)(계체), 21(토), 22(일)\n" +
                        "\n" +
                        "대학부\n" +
                        "21(토)(계체), 22(일), 23(월)\n" +
                        "\n" +
                        "일반부\n" +
                        "22(일)(계체), 23(월), 24(화)";
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
                activity.jongmok1="20(금), 21(토), 22(일), 23(월), 24(화), 25(수)";
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
                activity.jongmok1="기계체조\n" +
                        "23(월), 24(화), 25(수)\n" +
                        "\n" +
                        "리듬체조\n" +
                        "22(일)\n" +
                        "\n" +
                        "에어로빅\n" +
                        "20(금), 21(토)";

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










        return v;
    }




}
