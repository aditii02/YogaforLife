package com.vsa.yogaforlife;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DescriptionMedi extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    public static final String MEDI_NAME = "";
    String steps;
    String intended;
    String desc;
    String caution;
    String images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_medi);
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);

    }
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo(images); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
        }
    }

    protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return youTubeView;
    }

    @Override
    protected void onStart() {
        super.onStart();

        SQLiteOpenHelper sqLiteOpenHelper = new MyDatabase(DescriptionMedi.this);

        try {
            String cname = (String)getIntent().getExtras().get(MEDI_NAME);
            SQLiteDatabase db = sqLiteOpenHelper.getReadableDatabase();

            Toast.makeText(this,cname,Toast.LENGTH_SHORT).show();
            // code to read the data from the data base
            String s = "select DESCRIPTION, STEPS, CAUTION, INTENDED, CODE from MEDI where MEDI.NAME = \'" +cname+"\'";
            Cursor cursor = db.rawQuery(s,null);
            Toast.makeText(DescriptionMedi.this, s, Toast.LENGTH_SHORT).show();
            cursor.moveToFirst();
            steps = cursor.getString(1);
            desc = cursor.getString(0);
            caution = cursor.getString(2);
            intended = cursor.getString(3);
            images = cursor.getString(4);
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
    }
}
