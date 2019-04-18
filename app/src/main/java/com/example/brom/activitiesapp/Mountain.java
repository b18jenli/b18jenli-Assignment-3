package com.example.brom.activitiesapp;

public class Mountain {
    private String name;
    private String location;
    private int height;

    public Mountain(String n, String l, int h){
        name = n;
        location = l;
        height = h;
    }
    public String Height(){
        String h;
        h= "Height: " + height;
        return h;
    }
    public String Location(){
        String p;
        p= "Location: " + location;
        return p;
    }
    public String Name(){
        String n;
        n= "Mountain: " + name;
        return n;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
