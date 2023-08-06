package com.example.shu_contact;

import static android.net.Uri.parse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class Emergency extends AppCompatActivity {
    private ImageView deputy,district,ndc,policesuper,adpolicesuper,fireservice,stationmaster;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        //titile
        this.setTitle("Emergency ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        deputy = findViewById(R.id.deputyid);
        district = findViewById(R.id.districtid);
        policesuper= findViewById(R.id.policesuperid);
        adpolicesuper = findViewById(R.id.adpolicesuperid);
        ndc= findViewById(R.id.ndcid);
        fireservice=findViewById(R.id.deputyfireid);
        stationmaster=findViewById(R.id.stationmasterid);
        deputy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01715-123128"));
                startActivity(intent);


            }
        });
        district.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01318-251401"));
                startActivity(intent);


            }
        });
        ndc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:095161430"));
                startActivity(intent);


            }
        });
        policesuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01320104100"));
                startActivity(intent);


            }
        });
        adpolicesuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01320104103"));
                startActivity(intent);


            }
        });
        fireservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01711118881"));
                startActivity(intent);


            }
        });
        stationmaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:01733443189"));
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