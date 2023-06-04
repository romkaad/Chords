package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Accords_g_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_g1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/ng0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/ng1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/ng2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/ng3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/ng4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/ng5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/ng6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/ng7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/ng8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/ng9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/ng10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/ng11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/ng12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/ng13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/ng14.jpg");
                break;
            case  (15):
                webView.loadUrl("file:///android_res/drawable/ng15.jpg");
                break;
            case (16):
                webView.loadUrl("file:///android_res/drawable/ng16.jpg");
                break;
            case (17):
                webView.loadUrl("file:///android_res/drawable/ng17.jpg");
                break;
            case  (18):
                webView.loadUrl("file:///android_res/drawable/ng18.jpg");
                break;
            case (19):
                webView.loadUrl("file:///android_res/drawable/ng19.jpg");
                break;
            case (20):
                webView.loadUrl("file:///android_res/drawable/ng20.jpg");
                break;

            case  (21):
                webView.loadUrl("file:///android_res/drawable/ng21.jpg");
                break;
            case (22):
                webView.loadUrl("file:///android_res/drawable/ng22.jpg");
                break;
            case (23):
                webView.loadUrl("file:///android_res/drawable/ng23.jpg");
                break;
            case  (24):
                webView.loadUrl("file:///android_res/drawable/ng24.jpg");
                break;
            case (25):
                webView.loadUrl("file:///android_res/drawable/ng25.jpg");
                break;
            case (26):
                webView.loadUrl("file:///android_res/drawable/ng26.jpg");
                break;
            case  (27):
                webView.loadUrl("file:///android_res/drawable/ng27.jpg");
                break;
            case (28):
                webView.loadUrl("file:///android_res/drawable/ng28.jpg");
                break;
            case  (29):
                webView.loadUrl("file:///android_res/drawable/ng29.jpg");
                break;
        }
    }
}