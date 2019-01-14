package com.example.adrien.tenorels;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ListeChanson extends AppCompatActivity {

    ListView leschansons;

    DataBaseHelper dataBaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_chanson);

        dataBaseHelper = new DataBaseHelper(this);
        leschansons = findViewById(R.id.leschansons);


        Chanson[] chansons = (Chanson[]) getIntent().getExtras().getSerializable("arrayofChanson");

        ListeChansonAdapter listeadapter = new ListeChansonAdapter(this, 0, chansons);

        leschansons.setAdapter(listeadapter);


    } /** fin de la fonction Create **/

} /** fin de la classe ListeChanson **/
