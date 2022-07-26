import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    protected int[] data;
    protected static final int DEFAULT_SIZE=10;
    int ptr =-1;


    //custom size input
    public Stack(int size){
        this.data=new int[size];
    }

    //default size initialization
    public Stack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int value){
        ptr++;
        data[ptr]=value;
        if(isFull()){
            return false;
        }
        return true;

    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty, cannot pop");
        }


        return data[ptr--];
    }

    public void show(){
        System.out.println(Arrays.toString(data));
    }



    public int peek(){
        if(isEmpty()){
            System.out.println("empty Stack");
        }
        return data[ptr];
    }


    private boolean isEmpty(){
        if(ptr==-1){
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if(ptr == data.length-1){
            return true;
        }
        return false;
    }
}
