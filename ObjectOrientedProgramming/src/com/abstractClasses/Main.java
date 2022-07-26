package com.abstractClasses;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(19);
        son.career();
        son.partner();
        Daughter daughter = new Daughter("Shirley");
        daughter.career();
        daughter.partner();

    }
}
