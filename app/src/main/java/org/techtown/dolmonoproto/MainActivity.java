package org.techtown.dolmonoproto;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {

    android.app.FragmentManager manager = getFragmentManager();
    private BackPressCloseHandler backPressCloseHandler;
    public static String baseImageURL;
    public static String stdname;
    public static String stdcall;
    public static String stdwatch;
    public static String stdcar;
    public static String stdjongmok;
    public static String stdadd;
    public static int sogeaNum;
    public static int sogeaLastIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        backPressCloseHandler = new BackPressCloseHandler(this);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        manager.beginTransaction().replace(R.id.content_main,new Main()).commit();


    }

    @Override
    public void onBackPressed() {
        int backStackEntryCount = manager.getBackStackEntryCount();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if(backStackEntryCount == 0)
            {
                backPressCloseHandler.onBackPressed();
            }
            else
            {
                super.onBackPressed();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();



        if (id == R.id.nav_geayo_main_layout) {
            manager.popBackStackImmediate();
            manager.beginTransaction().replace(R.id.content_main,new geayoMain()).addToBackStack(null).commit();
            // Handle the camera action
        } else if (id == R.id.nav_cheerup_main_layout) {
            manager.popBackStackImmediate();
            manager.beginTransaction().replace(R.id.content_main,new cheerupMain()).addToBackStack(null).commit();

        } else if (id == R.id.nav_jongmok_main_layout) {
            manager.popBackStackImmediate();
            manager.beginTransaction().replace(R.id.content_main,new jongmokMain()).addToBackStack(null).commit();

        } else if (id == R.id.nav_main_layout) {
            manager.popBackStackImmediate();
            manager.beginTransaction().replace(R.id.content_main,new Main()).commit();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




    public void onFragmentChanged(int index){
        if(index == 2){
            manager.beginTransaction().replace(R.id.content_main,new geayoMain()).addToBackStack(null).commit();
        }else if(index == 4){
            manager.beginTransaction().replace(R.id.content_main,new cheerupMain()).addToBackStack(null).commit();
        }else if(index == 5){
            manager.beginTransaction().replace(R.id.content_main,new jongmokMain()).addToBackStack(null).commit();
        }else if(index == 9){
            manager.beginTransaction().replace(R.id.content_main,new gaeyo()).addToBackStack(null).commit();
        }else if(index == 3){
            manager.beginTransaction().replace(R.id.content_main,new way()).addToBackStack(null).commit();
        }else if(index == 10){
            manager.beginTransaction().replace(R.id.content_main,new symbol()).addToBackStack(null).commit();
        }else if(index == 0){
            manager.beginTransaction().replace(R.id.content_main,new introduce()).addToBackStack(null).commit();
        }else if(index == 53){
            manager.beginTransaction().replace(R.id.content_main,new jongmok()).addToBackStack(null).commit();
        }

    }

}
