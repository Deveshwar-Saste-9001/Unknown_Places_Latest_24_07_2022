package com.example.utplaces.Models;

public class HorizontalPlaceModel {
    private int imageResource;
    private String placeTitle;

    public HorizontalPlaceModel(int imageResource, String placeTitle) {
        this.imageResource = imageResource;
        this.placeTitle = placeTitle;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getPlaceTitle() {
        return placeTitle;
    }

    public void setPlaceTitle(String placeTitle) {
        this.placeTitle = placeTitle;
    }
}
