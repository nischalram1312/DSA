package com.inheritance;

public class Box {

        double height;
        double width;
        double length;
        Box(){
            this.height=-1;
            this.width=-1;
            this.length=-1;
        }
        Box(double size){
            this.length=size;
            this.width=size;
            this.height=size;
        }
        Box(double height, double width, double length){
            this.height = height;
            this.width = width;
            this.length = length;
        }
        public void dislay(){
            System.out.println("Running the box");
        }
}

