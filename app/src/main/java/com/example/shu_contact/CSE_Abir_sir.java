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

public class CSE_Abir_sir extends AppCompatActivity {
    private CardView cseAnwarSircall, cseAnwarSirMail;
    private android.content.Intent Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_abir_sir);
        //titile
        this.setTitle("Md Anwarul Islam Abir ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        cseAnwarSircall = findViewById(R.id.cseCharimanCallButtonId);
        cseAnwarSirMail = findViewById(R.id.cseChairmanMailButtonId);

        cseAnwarSirMail = findViewById(R.id.cseChairmanMailButtonId);
        cseAnwarSircall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:+8801521108504"));
                startActivity(intent);


            }
        });

        cseAnwarSirMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:anwar.abir@shu.edu.bd")));

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