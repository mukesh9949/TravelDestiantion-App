package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class desc_capetown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_capetown);
        TextView ch1=(TextView)findViewById(R.id.buttoncapetownhist);
        ch1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cv1=(TextView)findViewById(R.id.buttoncapetownbest);
        cv1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView cf1=(TextView)findViewById(R.id.buttoncapetownfood);
        cf1.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
