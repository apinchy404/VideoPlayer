package com.example.videoplayer;

        import androidx.appcompat.app.AppCompatActivity;

        import android.net.Uri;
        import android.os.Bundle;
        import android.widget.MediaController;
        import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=findViewById(R.id.videoView);
        controller=new MediaController(MainActivity.this);
        videoView.setMediaController(controller);


        //for play vdo online
        //videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4");

        videoView.setVideoURI(Uri.parse("android.resource://com.example.videoplayer/raw/video"));
        videoView.start();
    }
}