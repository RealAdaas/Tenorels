package com.example.adrien.tenorels;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class GenreAdapter extends ArrayAdapter<Genre>{

    public GenreAdapter(@Nullable Context context, int resource,@Nullable  Genre[] objects) {
        super(context, resource, objects);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //On vérifie si la vue a déjà été surchargé. Le layout est un layout qui n'est pas défini par une activity
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.genre_cell, parent, false);
        }
        //On instancie un holder qui va contenir les éléments graphiques de notre vue
        //C'est un classe privée qui est definie en dessous
        GenreHolder genreHolder = new GenreHolder();

        //On fait des findViewById par rapport à notre convertView (la vue qu'on vient d'instancier !)
        genreHolder.nomGenreTextView = convertView.findViewById(R.id.GenreTextView);

        //On récupère l'objet Genre en fonction de la position de l'élément dans la liste
        Genre genre = getItem(position);

        genreHolder.nomGenreTextView.setText(genre.getNom());

        //On renvoie bien notre vue surchargée avec les données remplies
        return convertView;
    }

    private class GenreHolder {
        public TextView nomGenreTextView;

    }
} /** fin class GenreAdapter **/
