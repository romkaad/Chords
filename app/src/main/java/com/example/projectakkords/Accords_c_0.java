package com.example.projectakkords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Accords_c_0 extends AppCompatActivity {
    String[] titles = {
            "C - До мажор",
            "Cm - До минор",
            "C+ - До мажор увеличенный",
            "C# - До-диез мажор",
            "C#m - ДО-диез минор",
            "C#+ - До-диез мажор увеличенный",
            "Cmaj7 - Большой мажорный септаккорд от ноты До",
            "C#maj7 - Большой мажорный септаккорд от ноты До-диез",
            "Csus4 - До мажор с квартой вместо терции",
            "C#sus4 - До-диез мажор с квартой вместо терции",
            "C6 - Мажорный секстаккорд от ноты До",
            "Cm6 - Минорный секстаккорд от ноты До",
            "C#6 - Мажорный секстаккорд от ноты До-диез",
            "C#m6 - Минорный секстаккорд от ноты До-диез",
            "C7 - Доминантсептаккорд от ноты До",
            "Cm7 - Минорный септаккорд от ноты До",
            "C#7 - Доминантсептаккорд от ноты До-диез",
            "C#m7 - Минорный септаккорд от ноты До-диез",
            "Cdim7 - Уменьшенный септаккорд от ноты До",
            "C#dim7 - Уменьшенный септаккорд от ноты До-диез",
            "C7sus4 - Мажорный септаккорд с квартой от ноты До",
            "C#7sus4 - Мажорный септаккорд с квартой от ноты До-диез",
            "C7/6 - Мажорный септаккорд с секстой от ноты До",
            "C#7/6 - Мажорный септаккорд с секстой от ноты До-диез",
            "C9 - Мажорный нонаккорд от ноты До",
            "Cm9 - Минорный нонаккорд от ноты До",
            "C#9 - Мажорный нонаккорд от ноты До-диез",
            "C#m9 - Минорный нонаккорд от ноты До-диез",
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
            intent.setClass(Accords_c_0.this, Accords_c_1.class);

            intent.putExtra("title", position);

            startActivity(intent);
        });
    }
}