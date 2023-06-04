package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_d_0 extends AppCompatActivity {

    String[] titles = {
            "D - Ре мажор",
            "Dm - Ре минор",
            "D+ - Ре мажор увеличенный",
            "D# - Ре-диез мажор",
            "D#m - Ре-диез минор",
            "D#+ - Ре-диез мажор увеличенный",
            "Dmaj7 - Большой мажорный септаккорд от ноты Ре",
            "D#maj7 - Большой мажорный септаккорд от ноты Ре-диез",
            "Ddim - Уменьшенный аккорд от ноты Ре",
            "D#dim - Уменьшенный аккорд от ноты Ре-диез",
            "Dsus4 - Ре мажор с квартой вместо терции",
            "D#sus4 - Ре-диез мажор с квартой вместо терции",
            "D6 - Мажорный секстаккорд от ноты Ре",
            "Dm6 - Минорный секстаккорд от ноты Ре",
            "D#6 - Мажорный секстаккорд от ноты Ре-диез",
            "D#m6 - Минорный секстаккорд от ноты Ре-диез",
            "D7 - Доминантсептаккорд от ноты Ре",
            "Dm7 - Минорный септаккорд от ноты Ре",
            "D#7 - Доминантсептаккорд от ноты Ре-диез",
            "D#m7 - Минорный септаккорд от ноты Ре-диез",
            "Ddim7 - Уменьшенный септаккорд от ноты Ре",
            "D#dim7 - Уменьшенный септаккорд от ноты Ре-диез",
            "D7sus4 - Мажорный септаккорд с квартой от ноты Ре",
            "D#7sus4 - Мажорный септаккорд с квартой от ноты Ре-диез",
            "D7/6 - Мажорный септаккорд с секстой от ноты Ре",
            "D#7/6 - Мажорный септаккорд с секстой от ноты Ре-диез",
            "D9 - Мажорный нонаккорд от ноты Ре",
            "Dm9 - Минорный нонаккорд от ноты Ре",
            "D#9 - Мажорный нонаккорд от ноты Ре-диез",
            "D#m9 - Минорный нонаккорд от ноты Ре-диез",
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
            intent.setClass(Accords_d_0.this, Accords_d_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}