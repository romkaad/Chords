package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_g_0 extends AppCompatActivity {

    String[] titles = {
            "G - Соль мажор",
            "Gm - Соль минор",
            "G+ - Соль мажор увеличенный",
            "G# - Соль-диез мажор",
            "G#m - Соль-диез минор",
            "G#+ - Соль-диез мажор увеличенный",
            "Gmaj7 - Большой мажорный септаккорд от ноты Соль",
            "G#maj7 - Большой мажорный септаккорд от ноты Соль-диез",
            "Gdim - Уменьшенный аккорд от ноты Соль",
            "G#dim - Уменьшенный аккорд от ноты Соль-диез",
            "Gsus4 - Соль мажор с квартой вместо терции",
            "G#sus4 - Соль-диез мажор с квартой вместо терции",
            "G6 - Мажорный секстаккорд от ноты Соль",
            "Gm6 - Минорный секстаккорд от ноты Соль",
            "G#6 - Мажорный секстаккорд от ноты Соль-диез",
            "G#m6 - Минорный секстаккорд от ноты Соль-диез",
            "G7 - Доминантсептаккорд от ноты Соль",
            "Gm7 - Минорный септаккорд от ноты Соль",
            "G#7 - Доминантсептаккорд от ноты Соль-диез",
            "G#m7 - Минорный септаккорд от ноты Соль-диез",
            "Gdim7 - Уменьшенный септаккорд от ноты Соль",
            "G#dim7 - Уменьшенный септаккорд от ноты Соль-диез",
            "G7sus4 - Мажорный септаккорд с квартой от ноты Соль",
            "G#7sus4 - Мажорный септаккорд с квартой от ноты Соль-диез",
            "G7/6 - Мажорный септаккорд с секстой от ноты Соль",
            "G#7/6 - Мажорный септаккорд с секстой от ноты Соль-диез",
            "G9 - Мажорный нонаккорд от ноты Соль",
            "Gm9 - Минорный нонаккорд от ноты Соль",
            "G#9 - Мажорный нонаккорд от ноты Соль-диез",
            "G#m9 - Минорный нонаккорд от ноты Соль-диез",
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
            intent.setClass(Accords_g_0.this, Accords_g_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}