package com.example.adrien.tenorels;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListeChansonAdapter extends ArrayAdapter<Chanson>  {

   public ListeChansonAdapter(@NonNull Context context, int resource, @NonNull Chanson[] objects){
       super(context, resource, objects);
   }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //On vérifie si la vue a déjà été surchargé. Le layout est un layout qui n'est pas défini par une activity
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.cells_chanson, parent, false);
        }
        //On instancie un holder qui va contenir les éléments graphiques de notre vue
        //C'est un classe privée qui est definie en dessous
        ChansonHolder chansonHolder = new ChansonHolder();

        //On fait des findViewById par rapport à notre convertView (la vue qu'on vient d'instancier !)
        chansonHolder.chanson = convertView.findViewById(R.id.chanson);


        Chanson chansons = getItem(position);

        chansonHolder.chanson.setText(chansons.getNom());

        //On renvoit bien notre vue surchargée avec les données remplies
        return convertView;
    } /** fin du getView **/

    private class ChansonHolder {
        public TextView chanson;
    }

} /** fin de la classe ListeChansonAdapter **/
