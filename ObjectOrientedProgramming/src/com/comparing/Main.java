package com.comparing;

public class Main {
    public static void main(String[] args) {
        Student nischal = new Student(99,11);
        Student puneet = new Student(98,18);
        if(nischal.compareTo(puneet)>0){
            System.out.println("Nischal has more marks");
        }
    }
}
