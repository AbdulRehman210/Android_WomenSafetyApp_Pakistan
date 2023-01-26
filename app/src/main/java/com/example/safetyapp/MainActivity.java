package com.example.safetyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        ImageButton fakeCallButton  = (ImageButton)findViewById(R.id.fake_call);

        fakeCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fakeCallIntent = new Intent(getApplicationContext(),FakeCallActivity.class);
                startActivity(fakeCallIntent);

            }
        });




        ImageButton shareLocationButton = (ImageButton) findViewById(R.id.share_location);

        shareLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                Intent shareLocationIntent = new Intent(getApplicationContext(),MapsActivity.class);
                startActivity(shareLocationIntent);

            }
        });




        ImageButton helpCallButton = (ImageButton) findViewById(R.id.help_call);

        helpCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent helpCallIntent = new Intent(getApplicationContext(),HelpCallActivity.class);

                if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    startActivity(helpCallIntent);
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE},1);

                }
                else
                {
                    startActivity(helpCallIntent);
                }


            }
        });






        ImageButton helpPlaceButton = (ImageButton) findViewById(R.id.help_places);

        helpPlaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("https://www.google.com/maps/");
                mapIntent.setData(data);
                startActivity(Intent.createChooser(mapIntent,"Launch Maps"));


            }
        });












    }


}