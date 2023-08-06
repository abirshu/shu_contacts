package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Academic extends AppCompatActivity {

    private Button csebutton, banbutton, engbutton,ecobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);


        this.setTitle("Academics ");

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        // Define ActionBar object
        ActionBar actionBar;
        actionBar = getSupportActionBar();

        // Define ColorDrawable object and parse color
        // using parseColor method
        // with color hash code as its parameter
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#5D6A79"));

        // Set BackgroundDrawable
        actionBar.setBackgroundDrawable(colorDrawable);


        csebutton= findViewById(R.id.cseButtonId);
        banbutton = findViewById(R.id.banButtonId);
        ecobutton = findViewById(R.id.ecoButtonId);
        engbutton = findViewById(R.id.engButtonId);

        csebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academic.this, CSE_Dept.class);
                startActivity(intent);
            }
        });

        banbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academic.this, Bangla_Dept.class);
                startActivity(intent);
            }
        });

        ecobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academic.this, ECO_Dept.class);
                startActivity(intent);
            }
        });
        engbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Academic.this, ENGLISH_Dept.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {

            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }
}