package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class All_Hall_info extends AppCompatActivity {
    private Button hall_super_one_male,hall_super_two_male,administrative_male, hall_super_one_female,hall_super_two_female,administrative_female;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_hall_info);
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        hall_super_one_male = (Button) findViewById(R.id.hallSuperonemaleButtonId);
        hall_super_two_male = (Button)findViewById(R.id.hallSupetwomaleButtonId);
        administrative_male =(Button) findViewById(R.id.administrativeofficermaleButtonId);


        hall_super_one_female =(Button) findViewById(R.id.hallSuperonefemaleButtonId);
        hall_super_two_female = (Button)findViewById(R.id.hallSupetwofemaleButtonId);
        administrative_female =(Button) findViewById(R.id.administrativeOfficerfemaleButtonId);
        administrative_male =(Button)  findViewById(R.id.administrativeofficermaleButtonId);


        hall_super_one_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Hall_info.this,BAN_Halim_sir_profile.class);
                startActivity(intent);
            }
        });

        hall_super_two_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Hall_info.this,CSE_Shiam_sir.class);
                startActivity(intent);
            }
        });

        hall_super_one_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(All_Hall_info.this,CSE_Mala_maam_profile.class);
                startActivity(intent);
            }
        });

        hall_super_two_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Hall_info.this,ENG_Anushka_maam_profile.class);
                startActivity(intent);
            }
        });



        administrative_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(Allhallsinfo.this,Pohelidi.class);
                //startActivity(intent);

            }
        });
        administrative_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(Allhallsinfo.this,Mizanvaiprofile.class);
               // startActivity(intent);

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