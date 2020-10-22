package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class meijishire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meijishire);

        TextView thm2=(TextView)findViewById(R.id.buttontokv1);
        thm2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
