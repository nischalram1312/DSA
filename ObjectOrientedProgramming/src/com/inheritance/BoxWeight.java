package com.inheritance;
//single inheritance
public class BoxWeight extends Box{
    double weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double height, double width, double length, double weight){
//        super.height=height;
//        super.length=length;
//        super.width=width;
        super(height,width,length);
        this.weight=weight;

    }
}
