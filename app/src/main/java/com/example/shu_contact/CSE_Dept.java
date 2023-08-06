package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class CSE_Dept extends AppCompatActivity {
    private Button csebutton,banbutton,engbutton,ecobutton;

    LinearLayout hiddenView, button, hiddenViewtwo, hiddenViewthree, hiddenViewfour ,
            arrow, arrowtwo ,arrowthree, arrowfour;
    LinearLayout cse1101,cse1102,cse1103,phy1104,math1105,cse1201,cse1202,che1203,math1204,
            cse2101,cse2102,cse2103,cse2104,cse2105,cse2201,cse2202,cse2203,cse2204,cse2205;
    CardView cardView, cardViewtwo, cardViewthree , cardViewfour;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_dept);

        this.setTitle("CSE Department");

        //adding back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
       //semester 1 finder
        cse1101= findViewById(R.id.cse_1101);
        cse1102= findViewById(R.id.cse_1102);
        cse1103= findViewById(R.id.cse_1103);
        phy1104= findViewById(R.id.phy_1104);
        math1105= findViewById(R.id.math_1105);


        //semester-1 pdf books
        cse1101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_1101.class);
                startActivity(intent);
            }
        });
        cse1102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_1102.class);
                startActivity(intent);
            }
        });
        cse1103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_1103.class);
                startActivity(intent);
            }
        });
        phy1104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, PHY_1104.class);
                startActivity(intent);
            }
        });
        math1105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, MATH_1105.class);
                startActivity(intent);
            }
        });
        //semester 2 finder
        cse1201 = findViewById(R.id.cse_1201);
        cse1202 = findViewById(R.id.cse_1202);
        che1203= findViewById(R.id.che_1203);
        math1204= findViewById(R.id.math_1204);
        //semester -2 pdf
        cse1201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_1201.class);
                startActivity(intent);
            }
        });
        cse1202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_1202.class);
                startActivity(intent);
            }
        });
        che1203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CHE_1203.class);
                startActivity(intent);
            }
        });
        math1204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, MATH_1204.class);
                startActivity(intent);
            }
        });

        //semester 3 finder
        cse2101 = findViewById(R.id.cse_2101);
        cse2102 = findViewById(R.id.cse_2102);
        cse2103= findViewById(R.id.cse_2103);
        cse2104= findViewById(R.id.cse_2104);
        cse2105= findViewById(R.id.cse_2105);

        //semester -3 pdf
        cse2101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2101.class);
                startActivity(intent);
            }
        });
        cse2102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2102.class);
                startActivity(intent);
            }
        });
        cse2103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2103.class);
                startActivity(intent);
            }
        });
        cse2105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2105.class);
                startActivity(intent);
            }
        });
        //semester 4 finder
        cse2201 = findViewById(R.id.cse_2201);
        cse2202 = findViewById(R.id.cse_2202);
        cse2203= findViewById(R.id.cse_2203);
        cse2204= findViewById(R.id.cse_2204);
        cse2205= findViewById(R.id.cse_2205);

        //semester -3 pdf
        cse2201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2201.class);
                startActivity(intent);
            }
        });
        cse2202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2202.class);
                startActivity(intent);
            }
        });
        cse2203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2203.class);
                startActivity(intent);
            }
        });
        cse2205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CSE_Dept.this, CSE_2205.class);
                startActivity(intent);
            }
        });






        //semester 1
        cardView = findViewById(R.id.base_cardview);
        arrow = findViewById(R.id.arrow_button);
        hiddenView = findViewById(R.id.hidden_view);
        //semester 1
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



        //semester 2
        cardViewtwo = findViewById(R.id.base_cardview_two);
        arrowtwo = findViewById(R.id.arrow_button_two);
        hiddenViewtwo = findViewById(R.id.hidden_view_two);

        //semester 2
        arrowtwo.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenViewtwo.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardViewtwo, new AutoTransition());
                hiddenViewtwo.setVisibility(View.GONE);
                //arrow.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardViewtwo, new AutoTransition());
                hiddenViewtwo.setVisibility(View.VISIBLE);
                //arrow.setImageResource(R.drawable.down_35);
            }
        });
        //semester 3
        cardViewthree = findViewById(R.id.base_cardview_three);
        arrowthree = findViewById(R.id.arrow_button_three);
        hiddenViewthree = findViewById(R.id.hidden_view_three);

        //semester 3
        arrowthree.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenViewthree.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardViewthree, new AutoTransition());
                hiddenViewthree.setVisibility(View.GONE);
                //arrow.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardViewthree, new AutoTransition());
                hiddenViewthree.setVisibility(View.VISIBLE);
                //arrow.setImageResource(R.drawable.down_35);
            }
        });

        //semester 4
        cardViewfour = findViewById(R.id.base_cardview_four);
        arrowfour = findViewById(R.id.arrow_button_four);
        hiddenViewfour = findViewById(R.id.hidden_view_four);

        //semester 4
        arrowfour.setOnClickListener(view -> {
            // If the CardView is already expanded, set its visibility
            // to gone and change the expand less icon to expand more.
            if (hiddenViewfour.getVisibility() == View.VISIBLE) {
                // The transition of the hiddenView is carried out by the TransitionManager class.
                // Here we use an object of the AutoTransition Class to create a default transition
                TransitionManager.beginDelayedTransition(cardViewfour, new AutoTransition());
                hiddenViewfour.setVisibility(View.GONE);
                //arrow.setImageResource(R.drawable.down_50);

            }

            // If the CardView is not expanded, set its visibility to
            // visible and change the expand more icon to expand less.
            else {
                TransitionManager.beginDelayedTransition(cardViewfour, new AutoTransition());
                hiddenViewfour.setVisibility(View.VISIBLE);
                //arrow.setImageResource(R.drawable.down_35);
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