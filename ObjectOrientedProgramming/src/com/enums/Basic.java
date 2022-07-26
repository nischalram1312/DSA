package com.enums;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants and every one of them are public static final
        //We can't create child enums because the type is final
    }

    public static void main(String[] args) {
        Week day = Week.Monday;
        for(Week days: Week.values() ){
            System.out.println(days);
        }
        
        Week a = Week.Friday;
        System.out.println(a.ordinal());
    }

}
