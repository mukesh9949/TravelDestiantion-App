package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private static  final long DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    finish();


                    Intent mainIntent = new Intent(MainActivity.this,places.class);
                    startActivity(mainIntent);


                }
            };
            Timer opening  = new Timer();
            opening.schedule(task,DELAY);


    }
}
