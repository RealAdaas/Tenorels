package com.example.adrien.tenorels;

import java.io.Serializable;

public class Chanson implements Serializable {

    /** Creation des attributs **/
    private String nom;
    private String url;
    private String genre;

    /** Constructor **/
    public Chanson(String nom) {
        this.nom = nom;
        this.url = url;
        this.genre = genre;
    }

    /** Getter Setter **/
    public String getNom() {
        return nom;
    }

    public String getUrl() {
        return url;
    }

    public String getGenre() { return genre;}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setGenre(String genre) { this.genre = genre; }

} /** fin de la class Chanson **/
