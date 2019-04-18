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
    public String info(){
        String tmp;
        tmp = location + " " + height;
        return tmp;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
