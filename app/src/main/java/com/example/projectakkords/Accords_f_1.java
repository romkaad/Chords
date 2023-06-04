package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Accords_f_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords_f1);
        Intent intent = getIntent();
        String resName = "na" + intent.getIntExtra("title", 0);
        Log.i("name", resName);
        Context context = getBaseContext();
        WebView webView = (WebView) findViewById (R.id.webView);

        switch (intent.getIntExtra("title", 0)) {
            case  (0):
                webView.loadUrl("file:///android_res/drawable/nf0.jpg");
                break;
            case (1):
                webView.loadUrl("file:///android_res/drawable/nf1.jpg");
                break;
            case (2):
                webView.loadUrl("file:///android_res/drawable/nf2.jpg");
                break;
            case  (3):
                webView.loadUrl("file:///android_res/drawable/nf3.jpg");
                break;
            case (4):
                webView.loadUrl("file:///android_res/drawable/nf4.jpg");
                break;
            case (5):
                webView.loadUrl("file:///android_res/drawable/nf5.jpg");
                break;
            case  (6):
                webView.loadUrl("file:///android_res/drawable/nf6.jpg");
                break;
            case (7):
                webView.loadUrl("file:///android_res/drawable/nf7.jpg");
                break;
            case (8):
                webView.loadUrl("file:///android_res/drawable/nf8.jpg");
                break;

            case  (9):
                webView.loadUrl("file:///android_res/drawable/nf9.jpg");
                break;
            case (10):
                webView.loadUrl("file:///android_res/drawable/nf10.jpg");
                break;
            case (11):
                webView.loadUrl("file:///android_res/drawable/nf11.jpg");
                break;
            case  (12):
                webView.loadUrl("file:///android_res/drawable/nf12.jpg");
                break;
            case (13):
                webView.loadUrl("file:///android_res/drawable/nf13.jpg");
                break;
            case (14):
                webView.loadUrl("file:///android_res/drawable/nf14.jpg");
                break;
            case  (15):
                webView.loadUrl("file:///android_res/drawable/nf15.jpg");
                break;
            case (16):
                webView.loadUrl("file:///android_res/drawable/nf16.jpg");
                break;
            case (17):
                webView.loadUrl("file:///android_res/drawable/nf17.jpg");
                break;
            case  (18):
                webView.loadUrl("file:///android_res/drawable/nf18.jpg");
                break;
            case (19):
                webView.loadUrl("file:///android_res/drawable/nf19.jpg");
                break;
            case (20):
                webView.loadUrl("file:///android_res/drawable/nf20.jpg");
                break;

            case  (21):
                webView.loadUrl("file:///android_res/drawable/nf21.jpg");
                break;
            case (22):
                webView.loadUrl("file:///android_res/drawable/nf22.jpg");
                break;
            case (23):
                webView.loadUrl("file:///android_res/drawable/nf23.jpg");
                break;
            case  (24):
                webView.loadUrl("file:///android_res/drawable/nf24.jpg");
                break;
            case (25):
                webView.loadUrl("file:///android_res/drawable/nf25.jpg");
                break;
            case (26):
                webView.loadUrl("file:///android_res/drawable/nf26.jpg");
                break;
            case  (27):
                webView.loadUrl("file:///android_res/drawable/nf27.jpg");
                break;
            case (28):
                webView.loadUrl("file:///android_res/drawable/nf28.jpg");
                break;
            case  (29):
                webView.loadUrl("file:///android_res/drawable/nf29.jpg");
                break;
            case (30):
                webView.loadUrl("file:///android_res/drawable/nf30.jpg");
                break;
            case  (31):
                webView.loadUrl("file:///android_res/drawable/nf31.jpg");
                break;
        }
    }
}