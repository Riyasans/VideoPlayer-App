package com.riya.videoplayerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView , videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoview);
        videoView2 = findViewById(R.id.videourl);
// from localstorage
        videoView.setVideoPath("android.resource://" +
                getPackageName()+"/"+ R.raw.video);

        MediaController  mc = new MediaController(this);
        mc.setAnchorView(videoView);
        videoView.setMediaController(mc);

        //display video from url
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=Ywl5yrqKq04");
        videoView2.setVideoURI(uri);

        MediaController mc2 = new MediaController(this);
        mc2.setAnchorView(videoView2);
        videoView2.setMediaController(mc2);

        videoView2.start();




    }
}