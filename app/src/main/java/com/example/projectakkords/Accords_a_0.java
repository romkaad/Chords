package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_a_0 extends AppCompatActivity {

    String[] titles = {
            "A - Ля мажор",
            "Am - Ля минор",
            "A+ - Ля мажор увеличенный",
            "A# - Ля-диез мажор",
            "Amaj7 - Большой мажорный септаккорд от ноты Ля",
            "Asus4 - Ля мажор с квартой вместо терции",
            "A6 - Мажорный секстаккорд от ноты Ля",
            "Am6 - Минорный секстаккорд от ноты Ля",
            "A7 - Доминантсептаккорд от ноты Ля",
            "Am7 - Минорный септаккорд от ноты Ля",
            "A#7 - Доминантсептаккорд от ноты Ля-диез",
            "Adim7 - Уменьшенный септаккорд от ноты Ля",
            "A7sus4 - Мажорный септаккорд с квартой от ноты Ля",
            "A7/6 - Мажорный септаккорд с секстой от ноты Ля",
            "A9 - Мажорный нонаккорд от ноты Ля",
            "Am9 - минорный нонаккорд от ноты Ля",
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
            intent.setClass(Accords_a_0.this, Accords_a_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}