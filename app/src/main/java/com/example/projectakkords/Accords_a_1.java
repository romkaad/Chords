package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;


public class Accords_a_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_a1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/na0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/na1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/na2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/na3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/na4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/na5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/na6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/na7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/na8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/na9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/na10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/na11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/na12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/na13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/na14.jpg");
                break;
            case  (15):
                webView.loadUrl("file:///android_res/drawable/na15.jpg");
                break;
        }

    }
}

