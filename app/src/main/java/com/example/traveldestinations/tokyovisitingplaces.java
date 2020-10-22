package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tokyovisitingplaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyovisitingplaces);

        Button btt1 = (Button)findViewById(R.id.buttonttokyovisit1);

        View.OnClickListener btt1Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itt1 = new Intent( tokyovisitingplaces.this, tokyovisiting1.class);


                startActivity(itt1);
            }

        };
        btt1.setOnClickListener(btt1Listener);

        Button btt2 = (Button)findViewById(R.id.buttonttokyovisit2);

        View.OnClickListener btt2Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itt2 = new Intent( tokyovisitingplaces.this, tokyovisiting2.class);


                startActivity(itt2);
            }

        };
        btt2.setOnClickListener(btt2Listener);

    }
}
