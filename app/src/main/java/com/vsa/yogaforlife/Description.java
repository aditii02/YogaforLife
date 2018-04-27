package com.vsa.yogaforlife;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class Description extends AppCompatActivity {
    public static final String YOGA_NAME= "";
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    private ShareActionProvider shareActionProvider;
    String steps;
    String desc;
    String caution;
    int images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        mAuth = FirebaseAuth.getInstance();
        // an auth  state listener
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                if (firebaseAuth.getCurrentUser() == null){
                    startActivity(new Intent(Description.this, MainActivity.class));
                }
            }
        };

    }

    @Override
    protected void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);


        SQLiteOpenHelper sqLiteOpenHelper = new MyDatabase(Description.this);

        try {
            String cname = (String)getIntent().getExtras().get(YOGA_NAME);
            SQLiteDatabase db = sqLiteOpenHelper.getReadableDatabase();

            Toast.makeText(this,cname,Toast.LENGTH_LONG).show();
            // code to read the data from the data base
            String s = "select DESCRIPTION, STEPS, CAUTION,IMAGE_RESOURCE_ID from YOGA where YOGA.NAME = \'" +cname+"\'";
            Cursor cursor = db.rawQuery(s,null);
            Toast.makeText(Description.this, s, Toast.LENGTH_LONG).show();
            cursor.moveToFirst();
            steps = cursor.getString(1);
            desc = cursor.getString(0);
            caution = cursor.getString(2);
            images = cursor.getInt(3);
            db.close();
        }catch (Exception e){
            Toast toast = Toast.makeText(this, "Data unavailable", Toast.LENGTH_SHORT);
        }
        TextView heading = (TextView)findViewById(R.id.yogabody);
        heading.setText(desc);
        TextView cau = (TextView)findViewById(R.id.caution);
        cau.setText(caution);
        TextView step = (TextView)findViewById(R.id.steps);
        step.setText(steps);
        ImageView imageView = (ImageView)findViewById(R.id.info_image);
        imageView.setImageResource(images);
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

}
