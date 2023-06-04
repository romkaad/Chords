package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.*;

public class Favorites_0 extends AppCompatActivity {

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
    List<String> listOfFavorites;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites0);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView listView = findViewById(R.id.listView);

        File file = new File(this.getFilesDir(), "favorites.json");


        String contents = null;
        FileInputStream fis = null;
        try {
            fis = this.openFileInput("favorites.json");
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
        TreeSet<String> tmp = gson.fromJson(contents, type);

        listOfFavorites = new ArrayList<>(tmp);

        listView.setAdapter(
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listOfFavorites));
        listView.setTextFilterEnabled(true);

        listView.setOnItemClickListener((a, v, position, id) -> {
            int songNumber = 0;
            while (songNumber < titles.length && !titles[songNumber].equals(listOfFavorites.get((int) id))) {
                songNumber++;
            }

            Intent intent = new Intent();
            intent.setClass(Favorites_0.this, Song_List_1.class);
            intent.putExtra("title", songNumber);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"На главную");
        menu.add(0,1,1,"Список песен");
        menu.add(0,2,2,"Плейлисты");
        menu.add(0,3,3,"Аккорды");
        menu.add(0,4,4,"Настройки");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0){
            Intent intentMainActivity = new Intent(Favorites_0.this, MainActivity.class);
            startActivity(intentMainActivity);
        }
        if(item.getItemId() == 1){
            Intent intentSongList_0 = new Intent(Favorites_0.this, Song_List_0.class);
            startActivity(intentSongList_0);
        }
        if(item.getItemId() == 2){
            Intent intentPlaylists_0 = new Intent(Favorites_0.this, Playlists_0.class);
            startActivity(intentPlaylists_0);
        }

        if(item.getItemId() == 4){
            Intent intentAccords_0 = new Intent(Favorites_0.this, Accords_0.class);
            startActivity(intentAccords_0);
        }
        if(item.getItemId() == 3){
            Intent intentSettings_0 = new Intent(Favorites_0.this, Settings_0.class);
            startActivity(intentSettings_0);
        }

        return super.onOptionsItemSelected(item);
    }

}