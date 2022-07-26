package com.accessmodifiers;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AccessControl ac = new AccessControl(11,"Nischal Raghuram");
        ac.setReg_no(11);
        System.out.println(ac.getReg_no());
        ac.setMarks(new int[]{1, 2, 3, 4, 41, 2, 1, 2});
        System.out.println(Arrays.toString(ac.getMarks()));

    }
}
