package com.example.projectakkords;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Settings_0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"На главную");
        menu.add(0,1,1,"Список песен");
        menu.add(0,2,2,"Избранное");
        menu.add(0,3,3,"Плейлисты");
        menu.add(0,4,4,"Аккорды");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0){
            Intent intentMainActivity = new Intent(Settings_0.this, MainActivity.class);
            startActivity(intentMainActivity);
        }
        if(item.getItemId() == 1){
            Intent intentSongList_0 = new Intent(Settings_0.this, Song_List_0.class);
            startActivity(intentSongList_0);
        }
        if(item.getItemId() == 2){
            Intent intentFavorites_0 = new Intent(Settings_0.this, Favorites_0.class);
            startActivity(intentFavorites_0);
        }
        if(item.getItemId() == 3){
            Intent intentPlaylists_0 = new Intent(Settings_0.this, Playlists_0.class);
            startActivity(intentPlaylists_0);
        }

        if(item.getItemId() == 4){
            Intent intentAccords_0 = new Intent(Settings_0.this, Accords_0.class);
            startActivity(intentAccords_0);
        }

        return super.onOptionsItemSelected(item);
    }
}