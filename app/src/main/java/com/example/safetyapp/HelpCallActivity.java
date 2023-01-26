package com.example.safetyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class HelpCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_call);

        ImageButton contactsButton = (ImageButton) findViewById(R.id.phone_contact);

        contactsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent contacts = new Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI);
                startActivity(contacts);

            }
        });

       ImageButton policeButton = (ImageButton) findViewById(R.id.police);

        policeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ContextCompat.checkSelfPermission(HelpCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(getApplicationContext(),"Allow Call Permission",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+923013324596"));
                    startActivity(callIntent);
                }



            }
        });


        ImageButton roadPoliceButton = (ImageButton) findViewById(R.id.road_police);

        roadPoliceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ContextCompat.checkSelfPermission(HelpCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(getApplicationContext(),"Allow Call Permission",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+923013324596"));
                    startActivity(callIntent);
                }


            }
        });






        ImageButton rangersButton = (ImageButton) findViewById(R.id.rangers);

        rangersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ContextCompat.checkSelfPermission(HelpCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(getApplicationContext(),"Allow Call Permission",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+923013324596"));
                    startActivity(callIntent);
                }



            }
        });




        ImageButton rescueButton = (ImageButton) findViewById(R.id.rescue);

        rescueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ContextCompat.checkSelfPermission(HelpCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(getApplicationContext(),"Allow Call Permission",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+923013324596"));
                    startActivity(callIntent);
                }



            }
        });







        ImageButton edhiButton = (ImageButton) findViewById(R.id.edhi);

        edhiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ContextCompat.checkSelfPermission(HelpCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(getApplicationContext(),"Allow Call Permission",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+923013324596"));
                    startActivity(callIntent);
                }



            }
        });







        ImageButton chhipaButton = (ImageButton) findViewById(R.id.chhipa);

        chhipaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (ContextCompat.checkSelfPermission(HelpCallActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(getApplicationContext(),"Allow Call Permission",Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent callIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:+923013324596"));
                    startActivity(callIntent);
                }



            }
        });























    }
}