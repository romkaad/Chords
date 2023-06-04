package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Accords_h_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_h1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/nh0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/nh1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/nh2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/nh3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/nh4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/nh5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/nh6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/nh7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/nh8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/nh9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/nh10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/nh11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/nh12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/nh13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/nh14.jpg");
                break;
            case  (15):
                webView.loadUrl("file:///android_res/drawable/nh15.jpg");
                break;
            case (16):
                webView.loadUrl("file:///android_res/drawable/nh16.jpg");
                break;
            case (17):
                webView.loadUrl("file:///android_res/drawable/nh17.jpg");
                break;
            case  (18):
                webView.loadUrl("file:///android_res/drawable/nh18.jpg");
                break;
            case (19):
                webView.loadUrl("file:///android_res/drawable/nh19.jpg");
                break;
            case (20):
                webView.loadUrl("file:///android_res/drawable/nh20.jpg");
                break;

            case  (21):
                webView.loadUrl("file:///android_res/drawable/nh21.jpg");
                break;
            case (22):
                webView.loadUrl("file:///android_res/drawable/nh22.jpg");
                break;
            case (23):
                webView.loadUrl("file:///android_res/drawable/nh23.jpg");
                break;
            case  (24):
                webView.loadUrl("file:///android_res/drawable/nh24.jpg");
                break;
            case (25):
                webView.loadUrl("file:///android_res/drawable/nh25.jpg");
                break;
            case (26):
                webView.loadUrl("file:///android_res/drawable/nh26.jpg");
                break;
            case  (27):
                webView.loadUrl("file:///android_res/drawable/nh27.jpg");
                break;
            case (28):
                webView.loadUrl("file:///android_res/drawable/nh28.jpg");
                break;
            case  (29):
                webView.loadUrl("file:///android_res/drawable/nh29.jpg");
                break;
        }
    }
}