package com.harini.properties.ShapeExample;

public class Shape implements Print, Draw {
    void Area(){
        System.out.println("area of shapes");
    }


    @Override
    public void print() {
        System.out.println("Hey, hii I'm printing!");

    }
    @Override
    public void draw() {
        System.out.println("Hey, hii I'm drawing");

    }
}
