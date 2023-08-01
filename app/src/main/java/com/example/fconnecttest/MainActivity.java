package com.example.fconnecttest;

import static com.example.fconnecttest.R.id.bannerad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://sdk.footylight.com/eyecon");
        myWebView.setMinimumHeight(220);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebView bannerView = (WebView) findViewById(R.id.bannerad);
        bannerView.loadUrl("https://sdk.footylight.com/bannerad");
        bannerView.setMinimumHeight(220);

        WebSettings bannerWebSettings = bannerView.getSettings();
        bannerWebSettings.setJavaScriptEnabled(true);

        Button btn = (Button) findViewById(R.id.popupbtn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openPopUpWidget();
            }
        });
    }

    private void openPopUpWidget() {
        Intent popupwidget = new Intent(MainActivity.this, PopUpWidget.class);
        startActivity(popupwidget);
    }

}