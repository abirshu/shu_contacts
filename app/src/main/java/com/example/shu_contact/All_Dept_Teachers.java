package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class All_Dept_Teachers extends AppCompatActivity {
    private Button csebutton,banbutton,engbutton,ecobutton;

    LinearLayout hiddenView, button, hiddenViewtwo, hiddenViewthree, hiddenViewfour , arrow, arrowtwo ,arrowthree, arrowfour,
    cse_mala_maam,cse_shiam_sir,cse_abir_sir,cse_sarad_sir,
    ban_angur_sir,ban_halim_sir,ban_sanjida_maam,ban_najmul_sir,
    eng_hafsa_maam, eng_safi_sir, eng_gson_sir,eng_anushka_maam,
    eco_shovon_sir, eco_nadim_sir, eco_tuhin_sir;
    CardView cardView, cardViewtwo, cardViewthree , cardViewfour;
    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_dept_teachers);
        //titile
        this.setTitle("All Dept. Teachers ");
        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        cardView = findViewById(R.id.base_cardview);
        arrow = findViewById(R.id.arrow_button);
        hiddenView = findViewById(R.id.hidden_view);

        cardViewtwo = findViewById(R.id.base_cardview_two);
        arrowtwo = findViewById(R.id.arrow_button_two);
        hiddenViewtwo = findViewById(R.id.hidden_view_two);

        cardViewthree = findViewById(R.id.base_cardview_three);
        arrowthree = findViewById(R.id.arrow_button_three);
        hiddenViewthree = findViewById(R.id.hidden_view_three);

        cardViewfour = findViewById(R.id.base_cardview_four);
        arrowfour = findViewById(R.id.arrow_button_four);
        hiddenViewfour = findViewById(R.id.hidden_view_four);



        //cse dept
        arrow.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenView.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenView.setVisibility(View.GONE);
                //arrow.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                hiddenView.setVisibility(View.VISIBLE);
                //arrow.setImageResource(R.drawable.down_35);
            }
        });

       //bangla dept
        arrowtwo.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenViewtwo.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardViewtwo, new AutoTransition());
                hiddenViewtwo.setVisibility(View.GONE);
                //arrowtwo.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardViewtwo, new AutoTransition());
                hiddenViewtwo.setVisibility(View.VISIBLE);
               // arrowtwo.setImageResource(R.drawable.down_35);
            }
        });

        //english dept
        arrowthree.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenViewthree.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardViewthree, new AutoTransition());
                hiddenViewthree.setVisibility(View.GONE);
                //arrowthree.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardViewthree, new AutoTransition());
                hiddenViewthree.setVisibility(View.VISIBLE);
                //arrowthree.setImageResource(R.drawable.down_35);
            }
        });

        //econimics dept
        arrowfour.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenViewfour.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardViewfour, new AutoTransition());
                hiddenViewfour.setVisibility(View.GONE);
               // arrowfour.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardViewfour, new AutoTransition());
                hiddenViewfour.setVisibility(View.VISIBLE);
                //arrowfour.setImageResource(R.drawable.down_35);
            }
        });








        //cse teachers profile
        cse_mala_maam = findViewById(R.id.mala_maam_profile);
        cse_shiam_sir= findViewById(R.id.shiam_sir_profile);
        cse_abir_sir= findViewById(R.id.abir_sir_profile);
        cse_sarad_sir= findViewById(R.id.sarad_sir_profile);

        cse_mala_maam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, CSE_Mala_maam_profile.class);
                startActivity(intent);
            }
        });
        cse_shiam_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, CSE_Shiam_sir.class);
                startActivity(intent);
            }
        });
        cse_abir_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, CSE_Abir_sir.class);
                startActivity(intent);
            }
        });
        cse_sarad_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, CSE_Sarad_sir.class);
                startActivity(intent);
            }
        });

        //ban teacher profile
        ban_angur_sir= findViewById(R.id.angur_sir_profile);
        ban_halim_sir = findViewById(R.id.halim_sir_profile);
        ban_sanjida_maam = findViewById(R.id.sanjida_maam_profile);
        ban_najmul_sir = findViewById(R.id.najmul_sir_profile);

        ban_angur_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,BAN_Angur_sir_profile.class);
                startActivity(intent);
            }
        });
        ban_halim_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,BAN_Halim_sir_profile.class);
                startActivity(intent);
            }
        });
        ban_najmul_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,BAN_Najmul_sir_profile.class);
                startActivity(intent);
            }
        });
        ban_sanjida_maam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,BAN_Sanjida_maam_profile.class);
                startActivity(intent);
            }
        });

        //eng teacher profile
        eng_hafsa_maam= findViewById(R.id.hafsa_maam_profile);
        eng_safi_sir = findViewById(R.id.safi_sir_profile);
        eng_gson_sir = findViewById(R.id.gson_sir_profile);
         eng_anushka_maam= findViewById(R.id.anushka_maam_profile);

        eng_hafsa_maam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,ENG_Hafsa_maam_profile.class);
                startActivity(intent);
            }
        });
        eng_safi_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,ENG_Safi_sir_profile.class);
                startActivity(intent);
            }
        });
        eng_gson_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,ENG_Gson_sir_profile.class);
                startActivity(intent);
            }
        });
        eng_anushka_maam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(All_Dept_Teachers.this,ENG_Anushka_maam_profile.class);
                startActivity(intent);
            }
        });

        //eco teacher profile

        eco_shovon_sir= findViewById(R.id.shovon_sir_profile);
        eco_tuhin_sir = findViewById(R.id.tuhin_sir_profile);
        eco_nadim_sir = findViewById(R.id.nadim_sir_profile);
        eco_shovon_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, ECO_Shovon_sir_profile.class);
                startActivity(intent);
            }
        });
        eco_tuhin_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, ECO_Tuhin_sir_profile.class);
                startActivity(intent);
            }
        });
        eco_nadim_sir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(All_Dept_Teachers.this, ECO_Nadim_sir_profile.class);
                startActivity(intent);
            }
        });









    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==android.R.id.home)
        {

            this.finish();

        }
        return super.onOptionsItemSelected(item);
    }

}