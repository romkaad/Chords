package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_e_0 extends AppCompatActivity {

    String[] titles = {
            "E - Ми мажор",
            "Em - Ми минор",
            "E+ - Ми мажор увеличенный",
            "Emaj7 - Большой мажорный септаккорд от ноты Ми",
            "Edim - Уменьшенный аккорд от ноты Ми",
            "Esus4 - Ми мажор с квартой вместо терции",
            "E6 - Минорный секстаккорд от ноты Ми",
            "Em6 - Минорный секстаккорд от ноты Ми",
            "E7 - Доминантсептаккорд от ноты Ми",
            "Em7 - Минорный септаккорд от ноты Ми",
            "Edim7 - Уменьшенный септаккорд от ноты Ми",
            "E7sus4 - Мажорный септаккорд с квартой от ноты Ми",
            "E7/6 - Мажорный септаккорд с секстой от ноты Ми",
            "E9 - Мажорный нонаккорд от ноты Ми",
            "Em9 - Минорный нонаккорд от ноты Ми",
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
            intent.setClass(Accords_e_0.this, Accords_e_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}