package com.inheritance;

public class Main {
    public static void main(String[] args) {
        //Parent class
        Box b = new Box();
        System.out.println(b.height+" "+b.length+" "+b.width);
        Box b1 = new Box(4);
        System.out.println(b1.height+" "+b1.length+" "+b1.width);
        Box b2 = new Box(1,2,3);
        System.out.println(b2.height+" "+b2.length+" "+b2.width);

        //sub class
        BoxWeight b3 = new BoxWeight();
        System.out.println(b3.height+" "+b3.length+" "+b3.width+" "+b3.weight);
        BoxWeight b4 = new BoxWeight(4,3,2,1);
        System.out.println(b4.height+" "+b4.length+" "+b4.width+" "+b4.weight);

        BoxPrice b5 = new BoxPrice(1,2,3,4,5);
        System.out.println(b5.height+" "+b5.length+" "+b5.width+" "+b5.weight+" "+b5.price);

        BoxLook b6 = new BoxLook(1,2,3,4,true);
        System.out.println(b6.height+" "+b6.length+" "+b6.width+" "+b6.weight+" "+b6.looksGood);










    }
}