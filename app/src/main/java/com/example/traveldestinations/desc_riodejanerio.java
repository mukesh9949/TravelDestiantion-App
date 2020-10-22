package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class desc_riodejanerio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_riodejanerio);

        TextView rioh1=(TextView)findViewById(R.id.buttonriohist);
        rioh1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView riov1=(TextView)findViewById(R.id.buttonriobest);
        riov1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView riof1=(TextView)findViewById(R.id.buttonriofood);
        riof1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
