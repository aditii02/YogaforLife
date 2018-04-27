package com.vsa.yogaforlife;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class NavigationFragmentItemSelected extends AppCompatActivity {
    public static final String ID = "";
    Fragment fragment = null;
    int id = -11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_fragment_item_selected);
        Intent intent = getIntent();
        id = (int)intent.getExtras().get(ID);
        fragment = getFragmentSelected(id);
        Toast.makeText(this, String.valueOf(id), Toast.LENGTH_SHORT).show();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.selectedView, fragment);
        ft.commit();
    }

    private Fragment getFragmentSelected(int id) {
        switch (id){
            case R.id.fav:
                return new Favourate();


            case R.id.recommended:
                return new Recommended();

            case R.id.diet:
                return new DietChart();

            case R.id.workout:
                return new Workout();


        }
        return new Favourate();
    }
}
