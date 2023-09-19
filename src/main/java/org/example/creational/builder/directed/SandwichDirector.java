package org.example.creational.builder.directed;

import org.example.creational.builder.classic.Sandwich;

public class SandwichDirector {
    private Sandwich.Builder builder;

    public SandwichDirector(Sandwich.Builder builder) {
        this.builder = builder;
    }

    public void makeSandwich() {
        builder.addTopping("mayonnaise");
    }

    public static void main(String[] args) {
        Sandwich.Builder builder = new Sandwich.Builder("Wheat", "Turkey");
        SandwichDirector director = new SandwichDirector(builder);
        director.makeSandwich();
        Sandwich sandwich = builder.build();
    }

}
