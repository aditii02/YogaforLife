package com.vsa.yogaforlife;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ShareActionProvider;
import android.support.design.widget.TabLayout;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Home extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    boolean doubleBackToExitPressedOnce = false;

    Button button;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    private ShareActionProvider shareActionProvider;
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // adding toolbar

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // adding the drawer to the toolbar

        DrawerLayout layout = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,
                layout,
                toolbar,
                R.string.nav_open_drawer,R.string.nav_close_drawer);
        layout.addDrawerListener(toggle);
        toggle.syncState();

        // adding navigation view listener

        NavigationView navigationView = (NavigationView)findViewById(R.id.nav);
        navigationView.setNavigationItemSelectedListener(this);

        // code for pager to use Fragemt Manager

        SectionsPagerAdapter sectinsPagerAdapter =new SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(sectinsPagerAdapter);

        // attach viewpager to tab layout

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        //button = (Button)findViewById(R.id.logout);

        mAuth = FirebaseAuth.getInstance();
        // an auth  state listener
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null){
                    startActivity(new Intent(Home.this, MainActivity.class));
                }
            }
        };
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Intent intent = null;
        int id = item.getItemId();
        boolean isFragment = false;
        switch (id){
            case R.id.fav:
                isFragment = true;
                break;
            case R.id.recommended:
                isFragment = true;
                break;
            case R.id.diet:
                isFragment = true;
                break;
            case R.id.workout:
                isFragment = true;
                break;
            case R.id.help:
                intent = new Intent(this, Help.class);
                break;
            case R.id.feedback:
                intent = new Intent(this, Feedback.class);
        }
        if (intent != null){
            startActivity(intent);
        }else {
            intent = new Intent(this, NavigationFragmentItemSelected.class);
            intent.putExtra(NavigationFragmentItemSelected.ID, id);
            startActivity(intent);
        }
        DrawerLayout drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (doubleBackToExitPressedOnce){
            //super.onBackPressed();
            finishAffinity();
            System.exit(0);

        }
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            doubleBackToExitPressedOnce = false;
            drawer.closeDrawer(GravityCompat.START);
            doubleBackToExitPressedOnce = false;
        }
        else{
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this,"Please click Back again to exit", Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                doubleBackToExitPressedOnce= false;
            }
        }, 2000);}
    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }
    // adding logout action to menu bar

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem menuItem = menu.findItem(R.id.share);
        shareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(menuItem);
        setShareActionIntent("Best yoga app for daily fitness");
        return super.onCreateOptionsMenu(menu);
    }

    private void setShareActionIntent(String s) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, s);
        shareActionProvider.setShareIntent(intent);
    }
    // react when the logout button is clicked

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();

        }
        return super.onOptionsItemSelected(item);
    }
    // adding fragment pager adapter
    private class SectionsPagerAdapter extends FragmentPagerAdapter{
        //constructer
        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new Yoga();
                case 1: return new Meditation();
                case 2: return new Nearyou();
            }
            return null;

        }

        @Override
        public int getCount() {
            return 3;
        }
         @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0: return getResources().getText(R.string.yoga);
                case 1: return getResources().getText(R.string.medi);
                case 2:return getResources().getText(R.string.near);
            }
            return null;
        }
    }
    // code to add title to the tabs in android


}
