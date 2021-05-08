package com.example.recipe_wala_app.model;

public class Constant

{
    int image;
    String title;
    String ingredients;
    String steps;

    public Constant(int image, String title, String ingredients, String steps) {
        this.image = image;
        this.title = title;
        this.ingredients = ingredients;
        this.steps = steps;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getSteps() {
        return steps;
    }
}
