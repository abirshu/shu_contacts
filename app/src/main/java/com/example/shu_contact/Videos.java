package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleObserver;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Videos extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);
        //titile
        this.setTitle("Videos ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        View youTubePlayerViewone = findViewById(R.id.youtube_player_viewone);
        getLifecycle().addObserver((LifecycleObserver) youTubePlayerViewone);

        View youTubePlayerViewtwo = findViewById(R.id.youtube_player_viewtwo);
        getLifecycle().addObserver((LifecycleObserver) youTubePlayerViewtwo);

        View youTubePlayerViewthree = findViewById(R.id.youtube_player_viewthree);
        getLifecycle().addObserver((LifecycleObserver) youTubePlayerViewthree);

        View youTubePlayerViewfour = findViewById(R.id.youtube_player_viewfour);
        getLifecycle().addObserver((LifecycleObserver) youTubePlayerViewfour);

        View youTubePlayerViewfive = findViewById(R.id.youtube_player_viewfive);
        getLifecycle().addObserver((LifecycleObserver) youTubePlayerViewfive);






    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {

            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }
}