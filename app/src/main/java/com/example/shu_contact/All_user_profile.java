package com.example.shu_contact;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class All_user_profile extends AppCompatActivity {
    private ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_user_profile);

        listView = findViewById(R.id.listView);

        FirebaseDatabase.getInstance().getReference().child("students")
                .addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        ArrayList<String> list = new ArrayList<>();
                        for(DataSnapshot ds : dataSnapshot.getChildren()) {
                            String name = ds.child("name").getValue(String.class);
                            String dept = ds.child("dept").getValue(String.class);
                            String email = ds.child("email").getValue(String.class);
                            String bloodGroup = ds.child("bloodGroup").getValue(String.class); // Retrieve Blood Group
                            String contact = ds.child("contact").getValue(String.class); // Retrieve Contact
                            list.add("Name: " + name + "\nDepartment: " + dept + "\nEmail: " + email + "\nBlood Group: " + bloodGroup + "\nContact: " + contact); // Include Blood Group and Contact in the list item
                        }
                        ArrayAdapter<String> adapter = new ArrayAdapter<>(All_user_profile.this, android.R.layout.simple_list_item_1, list);
                        listView.setAdapter(adapter);
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        // Handle error
                    }
                });
    }
}
