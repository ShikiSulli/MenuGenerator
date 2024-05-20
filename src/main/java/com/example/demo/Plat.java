package com.example.demo;
import java.util.List;

public class Plat {
    private String nom;
    private String description;
    private List<Ingredient> ingredients;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Plat(String nom, String description, List<Ingredient> ingredients) {
        this.nom = nom;
        this.description = description;
        this.ingredients = ingredients;
    }
}