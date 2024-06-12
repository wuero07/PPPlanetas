package com.example.planetas1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private PlanetAdapter adapter;
    private List<Planet> planetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        planetList = new ArrayList<>();
        planetList.add(new Planet(getString(R.string.planet_merc), R.drawable.mercurio1, R.drawable.mercurio2, R.drawable.mercurio3, getString(R.string.desc_merc_short), getString(R.string.desc_merc_long)));
        planetList.add(new Planet(getString(R.string.planet_venus), R.drawable.venus1, R.drawable.venus2, R.drawable.venus3, getString(R.string.desc_venus_short), getString(R.string.desc_venus_long)));
        planetList.add(new Planet(getString(R.string.planet_earth), R.drawable.tierra1, R.drawable.tierra2, R.drawable.tierra3, getString(R.string.desc_earth_short), getString(R.string.desc_earth_long)));
        planetList.add(new Planet(getString(R.string.planet_mars), R.drawable.marte1, R.drawable.marte2, R.drawable.marte3, getString(R.string.desc_mars_short), getString(R.string.desc_mars_long)));
        planetList.add(new Planet(getString(R.string.planet_jupiter), R.drawable.jupiter1, R.drawable.jupiter2, R.drawable.jupiter3, getString(R.string.desc_jupiter_short), getString(R.string.desc_jupiter_long)));
        planetList.add(new Planet(getString(R.string.planet_saturn), R.drawable.saturno1, R.drawable.saturno2, R.drawable.saturno3, getString(R.string.desc_saturn_short), getString(R.string.desc_saturn_long)));
        planetList.add(new Planet(getString(R.string.planet_uranus), R.drawable.urano1, R.drawable.urano2, R.drawable.urano3, getString(R.string.desc_uranus_short), getString(R.string.desc_uranus_long)));
        planetList.add(new Planet(getString(R.string.planet_neptune), R.drawable.neptuno1, R.drawable.neptuno2, R.drawable.neptuno3, getString(R.string.desc_neptune_short), getString(R.string.desc_neptune_long)));

        adapter = new PlanetAdapter(this, planetList, planet -> {
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", planet.getName());
            intent.putExtra("imageResId", planet.getImageResId());
            intent.putExtra("imageResId2", planet.getImageResId2());
            intent.putExtra("imageResId3", planet.getImageResId3());
            intent.putExtra("longDescription", planet.getLongDescription());
            startActivity(intent);
        });

        recyclerView.setAdapter(adapter);
    }
}

