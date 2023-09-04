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
        myWebView1.getSettings().setJavaScriptEnabled(true);
        myWebView1.clearCache(true);
        myWebView1.getSettings().setDomStorageEnabled(true);
        myWebView1.loadUrl("https://the-news-desk.com/displaytagVideo.html?p_key=HR2210JSY001&utm_medium=index&utm_source=HR2210JSY001");
//        myWebView1.setMinimumHeight(220);
//        WebSettings webSettings = myWebView1.getSettings();
//        webSettings.setJavaScriptEnabled(true);

        WebView myWebView2 = (WebView) findViewById(R.id.webview2);
        myWebView2.getSettings().setJavaScriptEnabled(true);
        myWebView2.clearCache(true);
        myWebView2.getSettings().setDomStorageEnabled(true);
        myWebView2.loadUrl("https://embed.footylight.com/fconnect-widget_v2/fl-av-player.html");
//        myWebView2.setMinimumHeight(144);
//        WebSettings webSettings2 = myWebView.getSettings();
//        webSettings2.setJavaScriptEnabled(true);

    }
}