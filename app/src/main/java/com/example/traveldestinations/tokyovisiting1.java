package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class tokyovisiting1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyovisiting1);
        TextView tv1=(TextView)findViewById(R.id.buttontokv1);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
