package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class About extends AppCompatActivity {
    private TextView github, facebook,insta,linkedin,github_anik, linkedin_anik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        //titile
        this.setTitle("About ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        github = findViewById(R.id.findMeGithub);
        github_anik = findViewById(R.id.findMeGithub_anik);
        //facebook = findViewById(R.id.findMeFacebook);
        insta = findViewById(R.id.findMeInsta);
        linkedin = findViewById(R.id.findMeLinkedin);
        linkedin_anik = findViewById(R.id.findMeLinkedin_anik);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this,Abir_Github.class);
                startActivity(intent);
            }
        });
        github_anik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this,Github_Anik.class);
                startActivity(intent);
            }
        });


        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this,Abir_Instagram.class);
                startActivity(intent);
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this,Abir_Linkedin.class);
                startActivity(intent);
            }
        });
        linkedin_anik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(About.this,Linkedin_Anik.class);
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