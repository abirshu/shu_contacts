package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;



public class Second_activity extends AppCompatActivity {
    FirebaseAuth mAuth;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    ImageView imageMenu;


    private CardView academics,contact,calendar,videos,transport,website,cgpa,help,admin,club;


    ActionBarDrawerToggle toggol;
    int progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Set title
        //this.setTitle("Home ");
        //hide action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        mAuth = FirebaseAuth.getInstance();

        // Navagation Drawar------------------------------
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        toggle = new ActionBarDrawerToggle(Second_activity.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Drawar click event
        // Drawer item Click event ------
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.mHome:
                        Toast.makeText(Second_activity.this, "Home", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        //Intent intent = new Intent(Second_activity.this,Second_activity.class);
                        //startActivity(intent);
                        break;
                    case R.id.mProfile:
                        Toast.makeText(Second_activity.this, "User Profile", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        Intent intent = new Intent(Second_activity.this,Update_profile.class);
                        startActivity(intent);
                        break;
                    case R.id.mAll_user_profile:
                        Toast.makeText(Second_activity.this, "All Users", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                         intent = new Intent(Second_activity.this,All_user_profile.class);
                        startActivity(intent);
                        break;

                    case R.id.mContact:
                        Toast.makeText(Second_activity.this, "Office", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                      intent = new Intent(Second_activity.this,Office_Info.class);
                        startActivity(intent);
                        break;

                    case R.id.mCalendar:
                        Toast.makeText(Second_activity.this, "Calendar", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                       // intent = new Intent(Second_activity.this,Calendar.class);
                       // startActivity(intent);
                        break;
                    case R.id.mBus:
                        Toast.makeText(Second_activity.this, "Transport", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        intent = new Intent(Second_activity.this,Transport.class);
                        startActivity(intent);
                        break;

                    case R.id.facebook:
                        Toast.makeText(Second_activity.this, "Facebook", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        intent = new Intent(Second_activity.this,Facebook.class);
                       startActivity(intent);
                        break;
                    case R.id.About:
                        Toast.makeText(Second_activity.this, "About", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        intent = new Intent(Second_activity.this,About.class);
                        startActivity(intent);
                        break;
                    case R.id.Policy:
                        Toast.makeText(Second_activity.this, "Privacy Policy", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                       intent = new Intent(Second_activity.this,Privacy_Policy.class);
                        startActivity(intent);
                        break;
                    case R.id.Bug:
                        Toast.makeText(Second_activity.this, "Bug", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        intent = new Intent(Second_activity.this,Any_Bugs.class);
                        startActivity(intent);
                        break;
                    case R.id.Share:

                        //For Share
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "Download Sheikh Hasina University app.  https://t.me/shu_app");
                        sendIntent.setType("text/plain");
                        Intent shareIntent = Intent.createChooser(sendIntent, null);
                        startActivity(shareIntent);
                        break;

                    case R.id.signoutMenuId:
                        Toast.makeText(Second_activity.this, "Sign Out", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        // intent = new Intent(Second_activity.this,Reportanybug.class);
                        //startActivity(intent);

                        mAuth.signOut();
                        finish();
                        Intent intentt = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intentt);
                        return true;

                }

                return false;
            }
        });

        // App Bar Click Event
        imageMenu = findViewById(R.id.imageMenu);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        academics = findViewById(R.id.academicsCardViewId);
        website = findViewById(R.id.websiteCardViewId);
        contact = findViewById(R.id.contactCardViewId);
        calendar = findViewById(R.id.calendarCardViewId);
        videos = findViewById(R.id.videosCardViewId);
        transport = findViewById(R.id.transportCardViewId);
        cgpa = findViewById(R.id.cgpaCardViewId);
        club = findViewById(R.id.clubCardViewId);
        help = findViewById(R.id.helpCardViewId);
        admin = findViewById(R.id.adminCardViewId);

        academics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this,Academic.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, All_Contact.class);
                startActivity(intent);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, All_Contact.class);
                startActivity(intent);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, Calendar.class);
                startActivity(intent);
            }
        });
        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, Transport.class);
                startActivity(intent);
            }
        });
        cgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, CGPA_Calculator.class);
                startActivity(intent);
            }
        });
        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, Videos.class);
                startActivity(intent);
            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, Website.class);
                startActivity(intent);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, Help.class);
                startActivity(intent);
            }
        });
        club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, Club.class);
                startActivity(intent);
            }
        });
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_activity.this, SHU_History.class);
                startActivity(intent);
            }
        });



    }

    // Create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_layout, menu);
        return true;
    }

    // Handle menu item selection
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.signoutMenuId) {
            mAuth.signOut();
            finish();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(Second_activity.this);

        alertDialogBuilder.setIcon(R.drawable.shu);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

}
