package com.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;
    Human(int age, String name){
        this.age=age;
        this.name=name;
        this.arr=new int[]{1,2,3,4,5};
    }
    Human(Human other){
        this.age=other.age;;
        this.name=other.name;
        this.arr=other.arr;
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        //Shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //Still a shallow copy
        Human twin = (Human) super.clone();

        // making a deep copy
        twin.arr=new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i]=this.arr[i];
        }
    return twin;
    }


}
