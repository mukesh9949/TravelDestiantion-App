package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tokyohistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyohistory);
        Button btth1 = (Button)findViewById(R.id.buttonthist1);

        View.OnClickListener btth1Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itth1 = new Intent( tokyohistory.this, nationalMuseum.class);


                startActivity(itth1);
            }

        };
        btth1.setOnClickListener(btth1Listener);

        Button btth2 = (Button)findViewById(R.id.buttonthist2);

        View.OnClickListener btth2Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itth2 = new Intent( tokyohistory.this, meijishire.class);


                startActivity(itth2);
            }

        };
        btth2.setOnClickListener(btth2Listener);

    }
}
