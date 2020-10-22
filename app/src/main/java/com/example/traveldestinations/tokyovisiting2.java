package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class tokyovisiting2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyovisiting2);
        TextView tv2=(TextView)findViewById(R.id.buttontokv2);
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
