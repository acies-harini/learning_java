package com.harini.properties.box;

public class main {
    public static void main(String[] args){
        BoxWeight box5 = new BoxWeight();
        box5.setWeight(5);
        System.out.println(box5.getWeight());
        Box box1 = new Box(2,3,9);
        Cube box2 = new Cube();
        System.out.println(box1.l +","+ box1.w+","+ box1.h);
        System.out.println(box2.volume);

    }

}
