package com.example.netclanexplorerclone;

public class personalModel {
    private String Name;
    private String Description;

    private String about;

    private int image;

    public personalModel(String name, String description, String about, int image) {
        Name = name;
        Description = description;
        this.about = about;
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
