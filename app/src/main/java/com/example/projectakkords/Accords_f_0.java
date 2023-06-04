package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_f_0 extends AppCompatActivity {

    String[] titles = {
            "F - Фа мажор",
            "Fm - Фа минор",
            "F+ - Фа мажор увеличенный",
            "F# - Фа-диез мажор",
            "F#m - Фа-диез минор",
            "F#+ - Фа-диез мажор увеличенный",
            "Fmaj7 - Большой мажорный септаккорд от ноты Фа",
            "F#maj7 - Большой мажорный септаккорд от ноты Фа-диез",
            "Fdim - Уменьшенный аккорд от ноты Фа",
            "F#dim - Уменьшенный аккорд от ноты Фа-диез",
            "Fsus4 - Фа мажор с квартой вместо терции",
            "F#sus4 - Фа-диез мажор с квартой вместо терции",
            "F6 - Мажорный секстаккорд от ноты Фа",
            "Fm6 - Минорный секстаккорд от ноты Фа",
            "F#6 - Мажорный секстаккорд от ноты Фа-диез",
            "F#m6 - Минорный секстаккорд от ноты Фа-диез",
            "F7 - Доминантсептаккорд от ноты Фа",
            "Fm7 - Минорный септаккорд от ноты Фа",
            "F#7 - Доминантсептаккорд от ноты Фа-диез",
            "F#m7 - Минорный септаккорд от ноты Фа-диез",
            "Fdim7 - Уменьшенный септаккорд от ноты Фа",
            "F#dim7 - Уменьшенный септаккорд от ноты Фа-диез",
            "F7sus4 - Мажорный септаккорд с квартой от ноты Фа",
            "F#7sus4 - Мажорный септаккорд с квартой от ноты Фа-диез",
            "F7/6 - Мажорный септаккорд с секстой от ноты Фа",
            "F#7/6 - Мажорный септаккорд с секстой от ноты Фа-диез",
            "F9 - Мажорный нонаккорд от ноты Фа",
            "Fm9 - Минорный нонаккорд от ноты Фа",
            "F#9 - Мажорный нонаккорд от ноты Фа-диез",
            "F#m9 - Минорный нонаккорд от ноты Фа-диез",
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
            intent.setClass(Accords_f_0.this, Accords_f_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}