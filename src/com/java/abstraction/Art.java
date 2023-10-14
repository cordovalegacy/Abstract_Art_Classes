package com.java.abstraction;

public abstract class Art {
    String title;
    String author;
    String description;


    public abstract String[] viewArt();

    public String[] getDetails(){
        return new String[]{this.title, this.author, this.description};
    }

    public void setDetails(String title, String author, String description){
        this.title = title;
        this.author = author;
        this.description = description;
    }

}
