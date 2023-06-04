package com.example.projectakkords;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Song_List_0 extends AppCompatActivity {

        public String[] titles = {
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
        setContentView(R.layout.activity_song_list0);
            @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ListView listView = findViewById(R.id.listView);
            listView.setAdapter(
                    new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, titles));
            listView.setTextFilterEnabled(true);

            listView.setOnItemClickListener((a, v, position, id) -> {
                Intent intent = new Intent();
                intent.setClass(Song_List_0.this, Song_List_1.class);

                intent.putExtra("title", position);
                startActivity(intent);
            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"На главную");
        menu.add(0,1,1,"Избранное");
        menu.add(0,2,2,"Плейлисты");
        menu.add(0,3,3,"Аккорды");
        menu.add(0,4,4,"Настройки");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0){
            Intent intentMainActivity = new Intent(Song_List_0.this, MainActivity.class);
            startActivity(intentMainActivity);
        }
        if(item.getItemId() == 1){
            Intent intentFavorites_0 = new Intent(Song_List_0.this, Favorites_0.class);
            startActivity(intentFavorites_0);
        }
        if(item.getItemId() == 2){
            Intent intentPlaylists_0 = new Intent(Song_List_0.this, Playlists_0.class);
            startActivity(intentPlaylists_0);
        }

        if(item.getItemId() == 4){
            Intent intentAccords_0 = new Intent(Song_List_0.this, Accords_0.class);
            startActivity(intentAccords_0);
        }
        if(item.getItemId() == 3){
            Intent intentSettings_0 = new Intent(Song_List_0.this, Settings_0.class);
            startActivity(intentSettings_0);
        }

        return super.onOptionsItemSelected(item);
    }
}