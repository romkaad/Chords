package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.TreeSet;

public class Song_List_1 extends AppCompatActivity {

    private Button button;

    String[] titles = {
            "Бумбокс - Вахтерам",
            "Баста - Сансара",
            "Сектор Газа - Лирика, аккорды",
            "5nizza - Я солдат",
            "ДДТ - Что такое осень",
            "Сплин - Выхода нет",
            "Жуки - Батарейка",
            "Король и Шут - Кукла колдуна",
    };

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_song_list1);

            Intent intent = getIntent();
            String resName = "n" + intent.getIntExtra("title", 0);
            Context context = getBaseContext();

            WebView webView = findViewById(R.id.webView);
            button = findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    File file = new File(context.getFilesDir(), "favorites.json");

                    String contents = null;
                    FileInputStream fis = null;
                    try {
                        fis = context.openFileInput("favorites.json");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    InputStreamReader inputStreamReader =
                            new InputStreamReader(fis, StandardCharsets.UTF_8);
                    StringBuilder stringBuilder = new StringBuilder();
                    try (BufferedReader reader = new BufferedReader(inputStreamReader)) {
                        String line = reader.readLine();
                        while (line != null) {
                            stringBuilder.append(line).append('\n');
                            line = reader.readLine();
                        }
                    } catch (IOException e) {
                        // Error occurred when opening raw file for reading.
                    } finally {
                        contents = stringBuilder.toString();
                    }

                    final Gson gson = new GsonBuilder().create();
                    Type type = new TypeToken<TreeSet<String>>() {}.getType();
                    TreeSet<String> favorites = gson.fromJson(contents, type);

                    favorites.add(titles[intent.getIntExtra("title", 0)]);

                    contents = gson.toJson (favorites);

                    try (FileOutputStream fos = context.openFileOutput("favorites.json", Context.MODE_PRIVATE)) {
                        fos.write(contents.getBytes(StandardCharsets.UTF_8));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });

            @SuppressLint("DiscouragedApi") String text = readRawTextFile(context, getResources().getIdentifier(resName,
                    "raw", "com.example.projectakkords"));

            webView.loadDataWithBaseURL(null, text, "text/html", "en_US", null);
        }

        public String readRawTextFile(Context context, int resId)
        {
            InputStream inputStream = context.getResources().openRawResource(resId);

            InputStreamReader inputReader = new InputStreamReader(inputStream);
            BufferedReader buffReader = new BufferedReader(inputReader);
            String line;
            StringBuilder builder = new StringBuilder();

            try {
                while (( line = buffReader.readLine()) != null) {

                    builder.append(line).append("<br />");

                }
            } catch (IOException e) {
                return null;
            }
            return builder.toString();
        }
}