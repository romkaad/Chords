package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_h_0 extends AppCompatActivity {

    String[] titles = {
            "H - Си мажор",
            "Hm - Си минор",
            "H+ - Си мажор увеличенный",
            "Hb - Си-бемоль мажор",
            "Hm - Си-бемоль минор",
            "Hb+ - Си-бемоль мажор увеличенный",
            "Hmaj7 - Большой мажорный септаккорд от ноты Си",
            "Hbmaj7 - Большой мажорный септаккорд от ноты Си-бемоль",
            "Hdim - Уменьшенный аккорд от ноты Си",
            "Hbdim - Уменьшенный аккорд от ноты Си-бемоль",
            "Hsus4 - Си мажор с квартой вместо терции",
            "Hbsus4 - Си-бемоль мажор с квартой вместо терции",
            "H6 - Мажорный секстаккорд от ноты Си",
            "Hm6 - Минорный секстаккорд от ноты Си",
            "Hb6 - Мажорный секстаккорд от ноты Си",
            "Hbm6 - Минорный секстаккорд от ноты Си",
            "H7 - Доминантсептаккорд от ноты Си",
            "Hm7 - Минорный септаккорд от ноты Си",
            "Hb7 - Доминантсептаккорд от ноты Си-бемоль",
            "Hbm7 - Минорный септаккорд от ноты Си-бемоль",
            "Hdim7 - Уменьшенный септаккорд от ноты Си",
            "Hbdim7 - Уменьшенный септаккорд от ноты Си-бемоль",
            "H7sus4 - Мажорный септаккорд с квартой от ноты Си",
            "Hb7sus4 - Мажорный септаккорд с квартой от ноты Си-бемоль",
            "H7/6 - Мажорный септаккорд с секстой от ноты Си",
            "Hb7/6 - Мажорный септаккорд с секстой от ноты Си-бемоль",
            "H9 - Мажорный нонаккорд от ноты Си",
            "Hm9 - Минорный нонаккорд от ноты Си",
            "Hb9 - Мажорный нонаккорд от ноты Си-бемоль",
            "Hbm9 - Минорный нонаккорд от ноты Си-бемоль",
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
            intent.setClass(Accords_h_0.this, Accords_h_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}