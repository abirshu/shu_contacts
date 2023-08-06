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

public class ECO_Nadim_sir_profile extends AppCompatActivity {
    private CardView cseCharimancall,cseChairmanMail;
    private android.content.Intent Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_nadim_sir_profile);
        this.setTitle("Md Nadim Uddin");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        cseCharimancall = findViewById(R.id.cseCharimanCallButtonId);
        cseChairmanMail = findViewById(R.id.cseChairmanMailButtonId);

        cseChairmanMail = findViewById(R.id.cseChairmanMailButtonId);
        cseCharimancall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:+88 01521325818"));
                startActivity(intent);


            }
        });

        cseChairmanMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:null@shu.edu.bd")));

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