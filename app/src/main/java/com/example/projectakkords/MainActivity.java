package com.example.projectakkords;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        File favorites = new File(this.getFilesDir(), "favorites.json");
        if (!favorites.exists()) {
            try {
                favorites.createNewFile();

                TreeSet<String> tmpSet = new TreeSet<>();
                final Gson gson = new GsonBuilder().create();
                Type type = new TypeToken<TreeSet<String>>() {}.getType();

                try (FileOutputStream fos = this.openFileOutput("favorites.json", Context.MODE_PRIVATE)) {
                    fos.write(gson.toJson(tmpSet, type).getBytes(StandardCharsets.UTF_8));
                    Log.i ("CREATEJSON", gson.toJson(tmpSet));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"Список песен");
        menu.add(0,1,1,"Избранное");
        menu.add(0,2,2,"Плейлисты");
        menu.add(0,3,3,"Аккорды");
        menu.add(0,4,4,"Настройки");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0){
            Intent intentSongList_0 = new Intent(MainActivity.this, Song_List_0.class);
            startActivity(intentSongList_0);
        }
        if(item.getItemId() == 1){
            Intent intentFavorites_0 = new Intent(MainActivity.this, Favorites_0.class);
            startActivity(intentFavorites_0);
        }
        if(item.getItemId() == 2){
            Intent intentPlaylists_0 = new Intent(MainActivity.this, Playlists_0.class);
            startActivity(intentPlaylists_0);
        }

        if(item.getItemId() == 3){
            Intent intentAccords_0 = new Intent(MainActivity.this, Accords_0.class);
            startActivity(intentAccords_0);
        }
        if(item.getItemId() == 4){
            Intent intentSettings_0 = new Intent(MainActivity.this, Settings_0.class);
            startActivity(intentSettings_0);
        }

        return super.onOptionsItemSelected(item);
    }
}