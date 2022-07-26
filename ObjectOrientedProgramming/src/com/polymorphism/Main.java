package com.polymorphism;

public class Main {
    public static void main(String[] args) {


        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();


        String s = "squaree";
        if(s.equals("triangle")){
            triangle.area();
        }else if(s.equals("square")){
            square.area();
        }else if(s.equals("circle")){
            circle.area();
        }else{
            shape.area();
        }


        Overloading o = new Overloading();
        o.area(1);
        o.area(2.1);
        o.area(2,1);
        o.area(3.5,8.9);

    }
}
