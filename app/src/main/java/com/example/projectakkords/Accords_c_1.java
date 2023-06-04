package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Accords_c_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_c1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/nc0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/nc1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/nc2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/nc3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/nc4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/nc5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/nc6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/nc7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/nc8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/nc9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/nc10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/nc11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/nc12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/nc13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/nc14.jpg");
                break;
            case  (15):
                webView.loadUrl("file:///android_res/drawable/nc15.jpg");
                break;
            case (16):
                webView.loadUrl("file:///android_res/drawable/nc16.jpg");
                break;
            case (17):
                webView.loadUrl("file:///android_res/drawable/nc17.jpg");
                break;
            case  (18):
                webView.loadUrl("file:///android_res/drawable/nc18.jpg");
                break;
            case (19):
                webView.loadUrl("file:///android_res/drawable/nc19.jpg");
                break;
            case (20):
                webView.loadUrl("file:///android_res/drawable/nc20.jpg");
                break;

            case  (21):
                webView.loadUrl("file:///android_res/drawable/nc21.jpg");
                break;
            case (22):
                webView.loadUrl("file:///android_res/drawable/nc22.jpg");
                break;
            case (23):
                webView.loadUrl("file:///android_res/drawable/nc23.jpg");
                break;
            case  (24):
                webView.loadUrl("file:///android_res/drawable/nc24.jpg");
                break;
            case (25):
                webView.loadUrl("file:///android_res/drawable/nc25.jpg");
                break;
            case (26):
                webView.loadUrl("file:///android_res/drawable/nc26.jpg");
                break;
            case  (27):
                webView.loadUrl("file:///android_res/drawable/nc27.jpg");
                break;
        }

    }
}