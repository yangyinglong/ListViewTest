package com.example.lenovo.listviewtest;

/**
 * Created by lenovo on 2018/3/6.
 */

public class Fruit{
    private String name;
    private int imageId;
    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}