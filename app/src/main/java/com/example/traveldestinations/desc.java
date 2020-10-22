package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class desc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);


        Button bth = (Button)findViewById(R.id.buttontokyohistory);

        View.OnClickListener bthListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ith = new Intent( desc.this, tokyohistory.class);


                startActivity(ith);
            }

        };
        bth.setOnClickListener(bthListener);


        Button btf = (Button)findViewById(R.id.buttonfood);

        View.OnClickListener btfListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itf = new Intent( desc.this, tokyofood.class);


                startActivity(itf);
            }

        };
        btf.setOnClickListener(btfListener);

        btf.setOnClickListener(btfListener);
        Button btv = (Button)findViewById(R.id.buttontokyovisiting);

        View.OnClickListener btvListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itv = new Intent( desc.this, tokyovisitingplaces.class);


                startActivity(itv);
            }

        };
        btv.setOnClickListener(btvListener);


    }
}
