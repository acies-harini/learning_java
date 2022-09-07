package com.harini.properties.ShapeExample;

public class Main {
    public static void Main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();
        Shape triangle = new Triangle();
        Shape printing = new Shape();
        Shape drawing = new Shape();

        shape.Area();
        triangle.Area();
        circle.Area();
        square.Area();
        printing.print();
        drawing.draw();
    }
}
