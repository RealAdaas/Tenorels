package com.example.adrien.tenorels;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button BouttonGo;

    DataBaseHelper databaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Init databaseHelper
        databaseHelper = new DataBaseHelper(this);

        BouttonGo = findViewById(R.id.genreButton);

        BouttonGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Playlist = new Intent(BouttonGo.getContext(), GenreActivity.class);

                //Permet de lancer le onCreate de DatabaseHelper et de récupérer la bdd créée
                SQLiteDatabase database = databaseHelper.getWritableDatabase();

                Genre[] genresChansons = databaseHelper.selectAllGenres(database);

                Playlist.putExtra("arrayOfGenres", genresChansons);
                startActivity(Playlist);
            }
        });
    }

}
