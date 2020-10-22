package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class desc_rome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_rome);

        TextView roh11=(TextView)findViewById(R.id.buttonromehist);
        roh11.setMovementMethod(LinkMovementMethod.getInstance());

        TextView rov1=(TextView)findViewById(R.id.buttonromebest);
        rov1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView rof1=(TextView)findViewById(R.id.buttonromefood);
        rof1.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
