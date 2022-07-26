package com.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =5;
        int b=0;

        divide(a,b);
        try{
        System.out.println(a/b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {

            System.out.println("Final method");
        }

    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("cant divide by 0");
        }
        return a/b;
    }
}
