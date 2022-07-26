package com.generics;

import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size = 0;
    customArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int n){
        if(isFull()){
            resize();
        }
        data[size++]=n;
    }
    public int remove(){
        return data[--size];
    }

    public int get(int i){
        return data[i];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value){
        data[index]=value;
    }

    public void print(){
        System.out.print(Arrays.toString(data)+" size="+size+"\n");
    }

    public void sort(){
        Arrays.sort(data);
    }

    private boolean isFull() {
        return size==data.length;
    }

    private void resize(){
        int[] array = new int[data.length*2];
        //copy items to new array
        for (int i = 0; i < data.length; i++) {
            array[i]=data[i];
        }
        data=array;

    }

    public static void main(String[] args) {
        customArrayList list = new customArrayList();
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

        list.print();

        list.remove();

        list.print();

        list.sort();

        list.print();
    }


}
