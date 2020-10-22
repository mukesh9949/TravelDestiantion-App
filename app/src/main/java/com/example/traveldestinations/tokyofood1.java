package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class tokyofood1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyofood1);
        TextView tf1=(TextView)findViewById(R.id.buttontokyofood11);
        tf1.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
