package com.example.planetas1;

public class Planet {
    private String name;
    private int imageResId;
    private int imageResId2;
    private int imageResId3;
    private String shortDescription;
    private String longDescription;

    public Planet(String name, int imageResId, int imageResId2, int imageResId3, String shortDescription, String longDescription) {
        this.name = name;
        this.imageResId = imageResId;
        this.imageResId2 = imageResId2;
        this.imageResId3 = imageResId3;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public int getImageResId2() {
        return imageResId2;
    }

    public int getImageResId3() {
        return imageResId3;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }
}
