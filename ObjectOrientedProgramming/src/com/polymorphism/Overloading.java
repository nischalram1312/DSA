package com.polymorphism;

public class Overloading {
    public void area (int side){
        double area = side*side;
        System.out.println("Area of the square is "+area);
    }
    public void area(int length, int width){
        double area = length*width;
        System.out.println("Area of the rectangle is "+area);
    }
    public void area(double base, double height){
        double area = 0.5*base*height;
        System.out.println("Area of the triangle is "+area);
    }
    public void area(double  radius){
        double area = 3.14*radius*radius;
        System.out.println("Area of the circe is "+area);
    }
}
