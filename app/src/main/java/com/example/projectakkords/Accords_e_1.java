package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Accords_e_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_e1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/ne0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/ne1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/ne2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/ne3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/ne4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/ne5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/ne6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/ne7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/ne8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/ne9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/ne10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/ne11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/ne12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/ne13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/ne14.jpg");
                break;
        }
    }
}