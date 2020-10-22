package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class tokyofood2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyofood2);
        TextView tf2=(TextView)findViewById(R.id.buttontokyofood22);
        tf2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
