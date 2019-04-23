package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.brom.activitiesapp.R;

public class Mountain_Details_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountain_details);
        Intent i=getIntent();

        String name = i.getStringExtra("name");

        LinearLayout LL = findViewById(R.id.card_view);

        TextView Jennas= findViewById(R.id.text_header);

        Jennas.setText(name);
    }
}
