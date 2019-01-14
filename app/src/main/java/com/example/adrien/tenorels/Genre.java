package com.example.adrien.tenorels;

import java.io.Serializable;

public class Genre implements Serializable {

    /** Déclaration de l'attribution nom **/
    private String nom;

    /** geter **/
    public Genre(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }

    /** setter **/
    public void setNom(String nom) {
        this.nom = nom;
    }


} /** fin class Genre **/
