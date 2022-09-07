package com.harini.properties.box;

public class Box {


    double h;
    double w;
    double l;

    Box(){
        this.h = 2;
        this.w =3;
        this.l = 5;
    }

    Box(double h, double w, double l){
        this.h=h;
        this.w=w;
        this.l=l;
    }





    public void main(String[] args){
        Box box1 = new Box(2,3,9);
        Cube box2 = new Cube();
        System.out.print(box1.l +","+ box1.w+","+ box1.h);
        System.out.print(box2.volume);


    }
}





