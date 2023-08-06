package com.example.shu_contact;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Update_profile extends AppCompatActivity {
    EditText t1, t2, t3, t4, t5, t6; // Added t5 and t6 for Blood Group and Contact
    Button insertBtn, listBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        //titile
        this.setTitle("Update Profile");

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5); // Initialize t5 for Blood Group
        t6 = findViewById(R.id.t6); // Initialize t6 for Contact
        insertBtn = findViewById(R.id.insertBtn);
        listBtn = findViewById(R.id.listBtn);

        // Set onClickListener for listBtn to open DisplayActivity
        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Update_profile.this,All_user_profile.class);
                startActivity(intent);
            }
        });

        // Set onClickListener for insertBtn to process the data
        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process();
            }
        });
    }

    private void process() {
        String name = t1.getText().toString().trim();
        String reg = t2.getText().toString().trim();
        String dept = t3.getText().toString().trim();
        String email = t4.getText().toString().trim();
        String bloodGroup = t5.getText().toString().trim(); // Get the Blood Group value
        String contact = t6.getText().toString().trim(); // Get the Contact value

        if (name.isEmpty() || reg.isEmpty() || dept.isEmpty() || email.isEmpty() || bloodGroup.isEmpty() || contact.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please fill all fields", Toast.LENGTH_LONG).show();
            return;
        }

        dataholder obj = new dataholder(name, dept, email, bloodGroup, contact); // Pass bloodGroup and contact values
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference node = db.getReference("students");
        node.child(reg).setValue(obj);

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText(""); // Clear Blood Group field
        t6.setText(""); // Clear Contact field

        Toast.makeText(getApplicationContext(),"Info Inserted",Toast.LENGTH_LONG).show();
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
