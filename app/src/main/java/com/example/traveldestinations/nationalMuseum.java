package com.example.traveldestinations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class nationalMuseum extends AppCompatActivity {
    public static final String IdValue = "Value", LabelValue = "Tagname";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national_museum);
        TextView thm1=(TextView)findViewById(R.id.textViewtthm1);
        thm1.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
