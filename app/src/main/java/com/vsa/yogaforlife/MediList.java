package com.vsa.yogaforlife;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.HashMap;
import java.util.Map;

public class MediList extends AppCompatActivity {
    public static final String CATEGORY_TYPE = "";
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    private ShareActionProvider shareActionProvider;
    private int id;
    Map<Integer, String> map = new HashMap<>();
    Intent intent;
    public String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medi_list);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);mAuth = FirebaseAuth.getInstance();
        mAuth = FirebaseAuth.getInstance();

        map.put(0,"BUDD");
        map.put(1,"HIND");
        map.put(2,"CHIN");
        map.put(3,"CHRI");
        map.put(4,"GUID");

        try {
            intent = getIntent();
            id = (int)intent.getExtras().get(CATEGORY_TYPE);
        }catch (Exception e){
            Toast.makeText(this, "Unable to get intent ", Toast.LENGTH_SHORT).show();
        }

        name = map.get(id);

        MediList.SectionsPagerAdapter sectinsPagerAdapter =new MediList.SectionsPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager = (ViewPager)findViewById(R.id.pager);
        viewPager.setAdapter(sectinsPagerAdapter);

        // attach viewpager to tab layout

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        // an auth  state listener

        // an auth  state listener
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null){
                    startActivity(new Intent(MediList.this, MainActivity.class));
                }
            }
        };
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
    private class SectionsPagerAdapter extends FragmentPagerAdapter {
        //constructer
        public SectionsPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0: return new DetailMediFragment();
            }
            return null;

        }

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return name;
        }
    }

    public String getId() {
        try {
            id = (int)intent.getExtras().get(CATEGORY_TYPE);
        }catch (Exception s){
            Toast.makeText(this, "Unable to pass intent", Toast.LENGTH_SHORT).show();
        }

        String s = map.get(id);
        //Toast.makeText(this, s+"   HHHH",Toast.LENGTH_LONG).show();
        return s;

    }
}
