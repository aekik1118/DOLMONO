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

public class jongmok26 extends Fragment{
    View v;
    MainActivity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.jongmok_26, container, false);

        activity = (MainActivity) getActivity();

        activity.setTitle("10.26 (목)");


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
                activity.jongmok1="21(토), 22(일), 23(월), 24(화), 25(수), 26(목)";
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
                activity.jongmok1="미정";
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
                activity.jongmok1="경영, 수구\n" +
                        "21(토), 22(일), 23(월), 24(화), 25(수), 26(목)\n" +
                        "다이빙\n" +
                        "21(토), 22(일), 23(월)\n" +
                        "싱크로\n" +
                        "24(화)";

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

                activity.jongmok1="21(토), 22(일), 23(월), 24(화), 25(수), 26(목)";


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
                activity.jongmok1="남고부, 일반부\n" +
                        "21(토), 22(일), 23(월), 24(화), 25(수), 26(목)\n" +
                        "\n" +
                        "여고부\n" +
                        "미정";
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
                activity.jongmok1="미정";
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
                activity.jongmok1="미정";
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
                activity.jongmok1="전종별\n" +
                        "22(일)(연습), 23(월), 24(화), 25(수), 26(목)\n" +
                        "\n" +
                        "해외동포\n" +
                        "미정";
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
                activity.jongmok1="21(토), 22(일), 23(월), 24(화), 25(수), 26(목)";




                activity.onFragmentChanged(53);


            }
        });












        return v;
    }




}
