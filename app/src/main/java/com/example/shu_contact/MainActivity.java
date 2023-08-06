package com.example.shu_contact;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shu_contact.Second_activity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText signInEmailEditText,signInPasswordEditText;
    private TextView signUpTextView;
    private Button signInButton;
    private CheckBox rememberCheckBox; // Added CheckBox
    private FirebaseAuth mAuth;
    private SharedPreferences sharedPref; // Added SharedPreferences
    private static final String PREF_NAME = "login_pref"; // SharedPreference name
    private static final String KEY_EMAIL = "email"; // Key to store email
    private static final String KEY_PASSWORD = "password"; // Key to store password
    private static final String KEY_REMEMBER = "remember"; // Key to store remember status

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signInEmailEditText = findViewById(R.id.signInEmailEditTextId);
        signInPasswordEditText = findViewById(R.id.signInPasswordEditTextId);
        signInButton = findViewById(R.id.signInButtonId);
        signUpTextView = findViewById(R.id.signUpTextViewId);
        rememberCheckBox = findViewById(R.id.rememberme_id); // Initialize CheckBox

        // Initialize SharedPreferences
        sharedPref = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

        // Retrieve saved login details if remember is checked
        if (sharedPref.getBoolean(KEY_REMEMBER, false)) {
            signInEmailEditText.setText(sharedPref.getString(KEY_EMAIL, ""));
            signInPasswordEditText.setText(sharedPref.getString(KEY_PASSWORD, ""));
            rememberCheckBox.setChecked(true);
        }

        //heading
        this.setTitle("Sign In");
        //hide action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mAuth = FirebaseAuth.getInstance();

        signUpTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Sign_Up.class);
                startActivity(intent);
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userLogin();
            }
        });

        // Save login details when remember checkbox is checked
        rememberCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences.Editor editor = sharedPref.edit();
                editor.putBoolean(KEY_REMEMBER, isChecked);
                editor.apply();
            }
        });
    }

    private void userLogin() {
        String email = signInEmailEditText.getText().toString().trim();
        String password = signInPasswordEditText.getText().toString().trim();

        // Check email validity
        if (email.isEmpty()) {
            signInEmailEditText.setError("Enter an email address");
            signInEmailEditText.requestFocus();
            return;
        }
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            signInEmailEditText.setError("Enter a valid email address");
            signInEmailEditText.requestFocus();
            return;
        }

        // Check password validity
        if (password.isEmpty()) {
            signInPasswordEditText.setError("Enter a password");
            signInPasswordEditText.requestFocus();
            return;
        }
        if (password.length() < 6) {
            signInPasswordEditText.setError("Minimum length of a password should be 6");
            signInPasswordEditText.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    // Save login details if remember checkbox is checked
                    if (rememberCheckBox.isChecked()) {
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.putString(KEY_EMAIL, email);
                        editor.putString(KEY_PASSWORD, password);
                        editor.apply();
                    } else {
                        // Clear saved login details if remember checkbox is unchecked
                        SharedPreferences.Editor editor = sharedPref.edit();
                        editor.remove(KEY_EMAIL);
                        editor.remove(KEY_PASSWORD);
                        editor.apply();
                    }

                    finish();
                    Intent intent = new Intent(getApplicationContext(), Second_activity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), "Log In Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Log In Unsuccessful", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
