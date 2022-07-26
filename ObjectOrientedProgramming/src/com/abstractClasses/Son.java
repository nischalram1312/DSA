package com.abstractClasses;

public class Son extends Parent {
    int age;
    Son(int age){
        super(age);
    }
    @Override
    void career() {
        System.out.println("I want to be a clown");
    }

    @Override
    void partner() {
        System.out.println("I love a girl who is 20 years old");
    }
}
