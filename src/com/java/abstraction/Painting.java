package com.java.abstraction;

public class Painting extends Art {

    String paintType;

    public Painting(String title, String author, String description, String paint){
        super.setDetails(title, author, description);
        this.paintType = paint;
    }

    @Override
    public String[] viewArt() {
        String title = getDetails()[0];
        String author = getDetails()[1];
        String description = getDetails()[2];
        String paint = this.paintType;

        String[] artDetails = {title, author, description, paint};
        return artDetails;
    }
}
