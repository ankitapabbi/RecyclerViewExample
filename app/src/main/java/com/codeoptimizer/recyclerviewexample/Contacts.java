package com.codeoptimizer.recyclerviewexample;

public class Contacts {

     private  String name;
    private int Image;
    private String phoneNumber;

    public Contacts(String name, int image, String phoneNumber) {
        this.name = name;
        Image = image;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
