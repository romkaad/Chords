package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Accords_d_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_d1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/nd0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/nd1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/nd2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/nd3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/nd4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/nd5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/nd6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/nd7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/nd8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/nd9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/nd10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/nd11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/nd12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/nd13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/nd14.jpg");
                break;
            case  (15):
                webView.loadUrl("file:///android_res/drawable/nd15.jpg");
                break;
            case (16):
                webView.loadUrl("file:///android_res/drawable/nd16.jpg");
                break;
            case (17):
                webView.loadUrl("file:///android_res/drawable/nd17.jpg");
                break;
            case  (18):
                webView.loadUrl("file:///android_res/drawable/nd18.jpg");
                break;
            case (19):
                webView.loadUrl("file:///android_res/drawable/nd19.jpg");
                break;
            case (20):
                webView.loadUrl("file:///android_res/drawable/nd20.jpg");
                break;

            case  (21):
                webView.loadUrl("file:///android_res/drawable/nd21.jpg");
                break;
            case (22):
                webView.loadUrl("file:///android_res/drawable/nd22.jpg");
                break;
            case (23):
                webView.loadUrl("file:///android_res/drawable/nd23.jpg");
                break;
            case  (24):
                webView.loadUrl("file:///android_res/drawable/nd24.jpg");
                break;
            case (25):
                webView.loadUrl("file:///android_res/drawable/nd25.jpg");
                break;
            case (26):
                webView.loadUrl("file:///android_res/drawable/nd26.jpg");
                break;
            case  (27):
                webView.loadUrl("file:///android_res/drawable/nd27.jpg");
                break;
            case (28):
                webView.loadUrl("file:///android_res/drawable/nd28.jpg");
                break;
            case  (29):
                webView.loadUrl("file:///android_res/drawable/nd29.jpg");
                break;
        }
    }
}