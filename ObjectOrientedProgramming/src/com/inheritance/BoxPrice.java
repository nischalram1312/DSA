package com.inheritance;
//multi level inheritance
public class BoxPrice extends BoxWeight {
    double price;
    BoxPrice(){
        this.price=-1;
    }
    BoxPrice(double height, double width, double length, double weight, double price){
        super(height,width,length,weight);
        this.price=price;
    }
}
