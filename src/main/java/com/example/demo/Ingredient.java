package com.example.demo;

public class Ingredient {
    private String nom;
    private String quantite;

    // getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public Ingredient(String nom, String quantite) {
        this.nom = nom;
        this.quantite = quantite;
    }
}