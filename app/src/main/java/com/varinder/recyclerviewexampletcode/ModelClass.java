package com.varinder.recyclerviewexampletcode;

public class ModelClass {

    private int imageResoures;
    private String title, body;

    public ModelClass(int imageResoures, String title, String body) {
        this.imageResoures = imageResoures;
        this.title = title;
        this.body = body;
    }

    public int getImageResoures() {
        return imageResoures;
    }

    public void setImageResoures(int imageResoures) {
        this.imageResoures = imageResoures;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
