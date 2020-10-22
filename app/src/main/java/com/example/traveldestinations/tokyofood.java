package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tokyofood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyofood);

        Button bttf1 = (Button)findViewById(R.id.buttontokyofood11);
        View.OnClickListener bttf1Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ittf1 = new Intent( tokyofood.this, tokyofood1.class);


                startActivity(ittf1);
            }

        };
        bttf1.setOnClickListener(bttf1Listener);

        Button bttf2 = (Button)findViewById(R.id.buttontokyofood2);

        View.OnClickListener bttf2Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ittf2 = new Intent( tokyofood.this, tokyofood2.class);


                startActivity(ittf2);
            }

        };
        bttf2.setOnClickListener(bttf2Listener);

    }
}
