package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class All_Contact extends AppCompatActivity {
    CardView department, office,hall, emergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_contact);
        this.setTitle("SHU Contacts ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        department = findViewById(R.id.departmentsCardViewId);
        hall = findViewById(R.id.hallCardViewId);
        office = findViewById(R.id.officeCardViewId);
        emergency = findViewById(R.id.emergencyCardViewId);

        department.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(All_Contact.this,All_Dept_Teachers.class);
                startActivity(intent);
            }
        });



        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(All_Contact.this,All_Hall_info.class);
                startActivity(intent);

            }
        });

        office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(All_Contact.this,Office_Info.class);
                startActivity(intent);

            }
        });

        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(All_Contact.this,Emergency.class);
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