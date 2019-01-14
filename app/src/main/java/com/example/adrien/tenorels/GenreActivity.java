package com.example.adrien.tenorels;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

import static com.example.adrien.tenorels.R.id.listViewGenre;

public class GenreActivity extends AppCompatActivity {

    ListView listGenre;

    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        listGenre = findViewById(R.id.listViewGenre);
        dataBaseHelper = new DataBaseHelper(this);

        /** Récupération des données et mise en page **/
        Genre[] arrayOfGenres = (Genre[])getIntent().getExtras().getSerializable("arrayOfGenres");

        //ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayofGenre);
        GenreAdapter genreAdapter = new GenreAdapter(this,0,arrayOfGenres);
        //On l'ajoute sur notre listView
        listGenre.setAdapter(genreAdapter);


        //POUR FAIRE UNE ACTION DE CLICK SUR UNE CELLULE
        //C'est comme onClickListener mais ça s'appelle onItemCliclListener
        listGenre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {

                Intent intent = new Intent(listGenre.getContext(), Chanson.class);

                SQLiteDatabase database = dataBaseHelper.getWritableDatabase();

                switch(i) {
                    case 0:
                        Chanson[] chanson0 = dataBaseHelper.selectGenreChanson0(database);
                        intent.putExtra("arrayOfMusics", chanson0);
                        break;
                    case 1:
                        Chanson[] chanson1 = dataBaseHelper.selectGenreChanson1(database);
                        intent.putExtra("arrayOfMusics", chanson1);
                        break;
                    case 2:
                        Chanson[] chanson2 = dataBaseHelper.selectGenreChanson2(database);
                        intent.putExtra("arrayOfMusics", chanson2);
                        break;
                    case 3:
                        Chanson[] chanson3 = dataBaseHelper.selectGenreChanson3(database);
                        intent.putExtra("arrayOfMusics", chanson3);
                        break;
                    case 4:
                        Chanson[] chanson4 = dataBaseHelper.selectGenreChanson4(database);
                        intent.putExtra("arrayOfMusics", chanson4);
                        break;

                    default:
                        break;
                }
                startActivity(intent);
            }
        });
   }
 } /** fin de la classe Genre Activity **/
