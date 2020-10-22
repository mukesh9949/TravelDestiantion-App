package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class desc_paris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_paris);



        TextView pv1=(TextView)findViewById(R.id.buttonparisbest);
        pv1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView pf1=(TextView)findViewById(R.id.buttonparisfood);
        pf1.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
