package com.generics;

import java.util.Arrays;

public class CustomGenericArraylist<Type> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size =0;

    CustomGenericArraylist(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(Type n){
        if(isFull()){
            resize();
        }
        data[size++]=n;
    }
    public Type remove(){
        return (Type) data[--size];
    }

    public Type get(int index){
        return (Type) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, Type value){
        data[index]=value;
    }


    @Override
    public String toString(){
        String str = Arrays.toString(data);
        return str;
    }

    private boolean isFull() {
        return size==data.length;
    }

    private void resize(){
        Object[] array = new Object[data.length*2];
        //copy items to new array
        for (int i = 0; i < data.length; i++) {
            array[i]=data[i];
        }
        data=array;

    }

    public static void main(String[] args) {
        CustomGenericArraylist<Integer> list = new CustomGenericArraylist<>();
        list.add(10);
        list.add(20);
        list.add(123);
        list.add(232);
        list.add(1);
        list.add(3);
        list.add(21);
        list.add(20);
        list.add(1);
        list.add(232);
        list.add(20);
        list.add(123);


        System.out.println(list.toString());





    }
}

