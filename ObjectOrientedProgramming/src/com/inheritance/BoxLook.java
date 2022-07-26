package com.inheritance;

//Hierarchical Inheritance
public class BoxLook extends BoxWeight{
    boolean looksGood;
    BoxLook(){
        this.looksGood=true;
    }
    BoxLook(double h, double w, double l, double weight, boolean looksGood){
        super(h,w,l,weight);
        this.looksGood=true;
    }
}
