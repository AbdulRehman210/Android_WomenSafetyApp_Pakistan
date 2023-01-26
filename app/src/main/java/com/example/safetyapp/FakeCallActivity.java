package com.example.safetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FakeCallActivity extends AppCompatActivity {

    boolean playing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_call);


        ImageButton playButton = (ImageButton) findViewById(R.id.play_and_pause_call);


        final MediaPlayer mp = MediaPlayer.create(this,R.raw.iphone);


        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                if(!playing)
                {
                    mp.start();
                    playing = true;
                }

              playButton.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {

                      if(playing)
                      {
                          mp.pause();
                          playing = false;
                      }

                      else if(!playing){

                          mp.start();
                          playing = true;


                      }


                  }
              });



            }
        });



















    }
}