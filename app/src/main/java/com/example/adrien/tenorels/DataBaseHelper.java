package com.example.adrien.tenorels;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;


public class DataBaseHelper extends SQLiteOpenHelper {

    public DataBaseHelper(Context context) {
        super(context, Constant.DATABASE_NAME, null, Constant.DATABASE_VERSION);
        doDBCheck();
    }



        /** Création de la base de données au lancer de l'application **/
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Constant.CREATE_TABLE_GENRE);
        db.execSQL(Constant.CREATE_TABLE_CHANSON);
        db.execSQL(Constant.INSERT_GENRE_VALUES);
        db.execSQL(Constant.INSERT_CHANSON_VALUES);
    } /** fin onCreate **/

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    //onCreate ne peut pas être appeler si la BDD n'a pas été supprimée avant
    private void doDBCheck() {
        try {
            File file = new File(Constant.PATHNAME_DATABASE);
            file.delete();
        } catch (Exception e) {
            Log.d(Constant.DEBUG_TAG, "La DB n'existe pas");
        }
    }

    /** Requetes pour avoir la liste de tout les genres **/
    public Genre[] selectAllGenres(SQLiteDatabase db){

        String[] columns = {
            Constant.COLUMN_NOM_TABLE_GENRE
        };

        Cursor cursor = db.query(
                Constant.TABLE_NAME_GENRE,
                columns,
                null,
                null,
                null,
                null,
                null
        );

        //On crée un tableau pour longueur la longueur du Cursor
        Genre[] genre = new Genre[cursor.getCount()];

        //On instancie nos objets Personne via notre Cursor
        int i = 0;
        //cursor.moveToNext permet d'aller au prochain élément dans le cursor dans l'ordre dont le cursor a récupéré les données
        while (cursor.moveToNext()) {
            genre[i] = new Genre(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_GENRE)));
            i++;
        }
        cursor.close();
        return genre;
    } /** fin selectAllGenres **/

    /** Requete pour avoir les chansons selon le genre **/

    public Chanson[] selectGenreChanson0(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"0"};

        Cursor cursor;
        cursor = db.query(
        Constant.TABLE_NAME_CHANSON,
        columns,
        selection,
        selectionArgs,
                null,
                null,
                null
                );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

            while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

            cursor.close();

            return chanson;

    } /** fin de la fonction de selectGenreChanson0 **/

    public Chanson[] selectGenreChanson1(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"1"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson1 **/

    public Chanson[] selectGenreChanson2(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"2"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson2 **/

    public Chanson[] selectGenreChanson3(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"3"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson3 **/

    public Chanson[] selectGenreChanson4(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"4"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson4 **/

    public Chanson[] selectGenreChanson5(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"5"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson5 **/

    public Chanson[] selectGenreChanson6(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"6"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson6 **/

    public Chanson[] selectGenreChanson7(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"7"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson7 **/

    public Chanson[] selectGenreChanson8(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"8"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson8 **/

    public Chanson[] selectGenreChanson9(SQLiteDatabase db){
        String[] columns = {
                Constant.TABLE_NAME_CHANSON,
                Constant.COLUMN_GENRES_TABLE_CHANSON,
                Constant.COLUMN_URL_TABLE_CHANSON
        };

        String selection = Constant.COLUMN_GENRES_TABLE_CHANSON;
        String[] selectionArgs = {"9"};

        Cursor cursor;
        cursor = db.query(
                Constant.TABLE_NAME_CHANSON,
                columns,
                selection,
                selectionArgs,
                null,
                null,
                null
        );

        Chanson[] chanson = new Chanson[cursor.getCount()];

        int i = 0;

        while (cursor.moveToNext()) {
            chanson[i] = new Chanson(cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_NOM_TABLE_CHANSON))
                    + cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_URL_TABLE_CHANSON)) +
                    cursor.getString(cursor.getColumnIndexOrThrow(Constant.COLUMN_GENRES_TABLE_CHANSON)));
            i++;
        }

        cursor.close();

        return chanson;

    } /** fin de la fonction de selectGenreChanson9 **/

} /** fin de la classe databaseHelper **/
