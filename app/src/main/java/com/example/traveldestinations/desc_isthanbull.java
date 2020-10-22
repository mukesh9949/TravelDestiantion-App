package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class desc_isthanbull extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_isthanbull);
        TextView ih1=(TextView)findViewById(R.id.buttonisthanhist);
        ih1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView iv1=(TextView)findViewById(R.id.buttonisthanbest);
        iv1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView if1=(TextView)findViewById(R.id.buttonisthanfood);
        if1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
