package com.abstractClasses;

public class Daughter extends Parent {
    String name;
    Daughter(String name){
        super(name);
    }
    @Override
    void career() {
        System.out.println("I want to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("My name is "+this.name);
    }
}
