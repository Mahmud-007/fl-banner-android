package com.example.fconnecttest;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView1 = (WebView) findViewById(R.id.webview1);
        myWebView1.loadUrl("https://the-news-desk.com/displaytagVideo.html?p_key=HR2210JSY001&utm_medium=index&utm_source=HR2210JSY001");
        myWebView1.setMinimumHeight(220);
        WebSettings webSettings = myWebView1.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebView myWebView = (WebView) findViewById(R.id.webview2);
        myWebView.loadUrl("https://embed.footylight.com/fconnect-widget_v2/fl-av-player.html");
//        myWebView.setMinimumHeight(220);
        WebSettings webSettings2 = myWebView.getSettings();
        webSettings2.setJavaScriptEnabled(true);

    }
}