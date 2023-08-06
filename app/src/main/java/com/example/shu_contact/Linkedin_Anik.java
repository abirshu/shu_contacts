package com.example.shu_contact;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Linkedin_Anik extends AppCompatActivity {
    private WebView webView;
    String url = "https://drive.google.com/file/d/0B_rn9jkskDivX1dfZ3B3M2JVX2M/view?usp=drive_web";
    @SuppressLint({"SetJavaScriptEnabled", "MissingInflatedId"})

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedin_anik);

        //for removed action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        webView = (WebView) findViewById(R.id.webViewId);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //load website on app
        // webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.linkedin.com/in/md-sobuj-mia-23b689263");


    }
}