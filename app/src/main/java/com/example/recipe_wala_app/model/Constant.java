package com.example.recipe_wala_app.model;

public class Constant

{
    int image;
    String title;
    String ingredient;
    String recipe;

    public Constant(int image, String title, String ingredient, String recipe) {
        this.image = image;
        this.title = title;
        this.ingredient = ingredient;
        this.recipe = recipe;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredient() { return ingredient; }

    public String getRecipe() { return recipe; }
}
