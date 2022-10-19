package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rMenu = findViewById(R.id.rMenu);
        ArrayList<Lauk>lauks = new ArrayList<>();
        rMenu.setAdapter(new Adapter(lauks,this));
        lauks.add(new Lauk("Martabak Telor", "35.000", R.drawable.martabak_telor));
        lauks.add(new Lauk("Terang Boelan", "35.000", R.drawable.terangboelan));
        lauks.add(new Lauk("Pukis", "35.000", R.drawable.pukis));
        lauks.add(new Lauk("Kue Pancong", "35.000", R.drawable.kue_pancong));

        rMenu.setLayoutManager(new GridLayoutManager(this, 2));
    }
}