package com.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human nischal = new Human(19,"Nischal");
        //Human twin = new Human(nischal);

        Human twin = (Human) nischal.clone();
        System.out.println(Arrays.toString(nischal.arr));
        twin.arr[0]=100;
        //objects dont get copied and instead point to old objects
        System.out.println("twin array"+Arrays.toString(twin.arr));
        System.out.println("nischal array"+Arrays.toString(nischal.arr));


    }
}
