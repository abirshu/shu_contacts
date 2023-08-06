package com.example.shu_contact;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Any_Bugs extends AppCompatActivity {
    private WebView webView;
    String url = "https://drive.google.com/file/d/0B_rn9jkskDivX1dfZ3B3M2JVX2M/view?usp=drive_web";
    @SuppressLint("SetJavaScriptEnabled")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_any_bugs);
        //for removed action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        webView =(WebView) findViewById(R.id.webViewId);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdwc4AVlhcwGn3KKIHlpzEgYfnEP6pk959RtAD2sNO6xIJTfA/viewform?usp=sf_link");


    }
}