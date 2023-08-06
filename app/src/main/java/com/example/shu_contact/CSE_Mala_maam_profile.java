package com.example.shu_contact;

import static android.net.Uri.parse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class CSE_Mala_maam_profile extends AppCompatActivity {
    private CardView cseMalaMamcall,cseMalaMamMail;

    private android.content.Intent Intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_mala_maam_profile);
        //titile
        this.setTitle("Mala Rani Barman ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cseMalaMamcall = findViewById(R.id.cseCharimanCallButtonId);
        cseMalaMamMail = findViewById(R.id.cseChairmanMailButtonId);

        cseMalaMamMail = findViewById(R.id.cseChairmanMailButtonId);
        cseMalaMamcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:+88 01303 062208"));
                startActivity(intent);


            }
        });

        cseMalaMamMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:mala@shu.edu.bd")));

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