package com.abstractClasses;

public abstract class Parent {
    int age;
    String name;
    Parent(int age){
        this.age=age;
    }
    Parent(String name){
        this.name=name;
    }
    Parent(int age, String name){
        this.age=age;
        this.name=name;
    }
    abstract void career();
    abstract void partner();

}
