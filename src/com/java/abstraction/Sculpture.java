package com.java.abstraction;

public class Sculpture extends Art{

    String material;

    public Sculpture(String title, String author, String description, String material){
        super.setDetails(title, author, description);
        this.material = material;
    }

    @Override
    public String[] viewArt() {
        String title = getDetails()[0];
        String author = getDetails()[1];
        String description = getDetails()[2];
        String sculpture = this.material;
        String[] artDetails = {title, author, description, sculpture};
        return artDetails;
    }
}
