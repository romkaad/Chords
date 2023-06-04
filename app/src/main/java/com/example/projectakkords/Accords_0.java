package com.example.projectakkords;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Accords_0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accords0);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view.getId() == R.id.button1) {
                    Intent intentAccords_a_0 = new Intent(Accords_0.this, Accords_a_0.class);
                    startActivity(intentAccords_a_0);
                }
                if (view.getId() == R.id.button2) {
                    Intent intentAccords_c_0 = new Intent(Accords_0.this, Accords_c_0.class);
                    startActivity(intentAccords_c_0);
                }
                if (view.getId() == R.id.button3) {
                    Intent intentAccords_d_0 = new Intent(Accords_0.this, Accords_d_0.class);
                    startActivity(intentAccords_d_0);
                }
                if (view.getId() == R.id.button4) {
                    Intent intentAccords_e_0 = new Intent(Accords_0.this, Accords_e_0.class);
                    startActivity(intentAccords_e_0);
                }
                if (view.getId() == R.id.button5) {
                    Intent intentAccords_f_0 = new Intent(Accords_0.this, Accords_f_0.class);
                    startActivity(intentAccords_f_0);
                }
                if (view.getId() == R.id.button6) {
                    Intent intentAccords_g_0 = new Intent(Accords_0.this, Accords_g_0.class);
                    startActivity(intentAccords_g_0);
                }
                if (view.getId() == R.id.button7) {
                    Intent intentAccords_h_0 = new Intent(Accords_0.this, Accords_h_0.class);
                    startActivity(intentAccords_h_0);
                }
            }
        };
        button1.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);
        button7.setOnClickListener(onClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"На главную");
        menu.add(0,1,1,"Список песен");
        menu.add(0,2,2,"Избранное");
        menu.add(0,3,3,"Плейлисты");
        menu.add(0,4,4,"Настройки");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == 0){
            Intent intentMainActivity = new Intent(Accords_0.this, MainActivity.class);
            startActivity(intentMainActivity);
        }
        if(item.getItemId() == 1){
            Intent intentSongList_0 = new Intent(Accords_0.this, Song_List_0.class);
            startActivity(intentSongList_0);
        }
        if(item.getItemId() == 2){
            Intent intentFavorites_0 = new Intent(Accords_0.this, Favorites_0.class);
            startActivity(intentFavorites_0);
        }
        if(item.getItemId() == 3){
            Intent intentPlaylists_0 = new Intent(Accords_0.this, Playlists_0.class);
            startActivity(intentPlaylists_0);
        }

        if(item.getItemId() == 4){
            Intent intentSettings_0 = new Intent(Accords_0.this, Settings_0.class);
            startActivity(intentSettings_0);
        }

        return super.onOptionsItemSelected(item);
    }
}