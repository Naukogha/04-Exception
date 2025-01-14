package org.example.exoexception2.entity;

public class Book {
    private String titre;
    private String auteur;

    public Book(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "book [titre=" + titre + ", auteur=" + auteur + "]";
    }
}
