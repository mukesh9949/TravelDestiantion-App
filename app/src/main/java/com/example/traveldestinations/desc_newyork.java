package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class desc_newyork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_newyork);
        TextView nh1=(TextView)findViewById(R.id.buttonnewyorkhist);
        nh1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView nv1=(TextView)findViewById(R.id.buttonnewyorkbest);
        nv1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView nf1=(TextView)findViewById(R.id.buttonnewyorkfood);
        nf1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
