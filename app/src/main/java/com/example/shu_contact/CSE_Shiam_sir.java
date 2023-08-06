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

public class CSE_Shiam_sir extends AppCompatActivity {
    private CardView cseShiamSircall, cseShiamSirMail;
    private android.content.Intent Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_shiam_sir);
        //titile
        this.setTitle("Abdullah Al Shiam ");

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);




        cseShiamSircall = findViewById(R.id.cseCharimanCallButtonId);
        cseShiamSirMail = findViewById(R.id.cseChairmanMailButtonId);

        cseShiamSirMail = findViewById(R.id.cseChairmanMailButtonId);
        cseShiamSircall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.content.Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(parse("tel:+8801728386978"));
                startActivity(intent);


            }
        });

        cseShiamSirMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:shiam.cse@shu.edu.bd")));

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