package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

            Button b = (Button)findViewById(R.id.button1);

            View.OnClickListener bListener = new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent i = new Intent( places.this, desc.class);


                    startActivity(i);
                }

            };
        b.setOnClickListener(bListener);

        Button b2 = (Button)findViewById(R.id.button2);

        View.OnClickListener b2Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent( places.this, desc_newyork.class);


                startActivity(i1);
            }

        };
        b2.setOnClickListener(b2Listener);

        Button b3 = (Button)findViewById(R.id.button3);

        View.OnClickListener b3Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2 = new Intent( places.this, desc_paris.class);


                startActivity(i2);
            }

        };
        b3.setOnClickListener(b3Listener);

        Button b4 = (Button)findViewById(R.id.button4);

        View.OnClickListener b4Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i3 = new Intent( places.this, desc_capetown.class);


                startActivity(i3);
            }

        };
        b4.setOnClickListener(b4Listener);


        Button b5 = (Button)findViewById(R.id.button5);

        View.OnClickListener b5Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i4 = new Intent( places.this, desc_rome.class);


                startActivity(i4);
            }

        };
        b5.setOnClickListener(b5Listener);


        Button b6 = (Button)findViewById(R.id.button6);

        View.OnClickListener b6Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i5 = new Intent( places.this, desc_riodejanerio.class);


                startActivity(i5);
            }

        };
        b6.setOnClickListener(b6Listener);


        Button b7 = (Button)findViewById(R.id.button7);

        View.OnClickListener b7Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i6 = new Intent( places.this, desc_isthanbull.class);


                startActivity(i6);
            }

        };
        b7.setOnClickListener(b7Listener);


    }
    }

