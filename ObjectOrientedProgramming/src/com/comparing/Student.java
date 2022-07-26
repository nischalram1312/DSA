package com.comparing;

public class Student implements Comparable<Student>{
    int roll_no;
    int marks;

    Student(int marks, int roll_no){
        this.marks=marks;
        this.roll_no=roll_no;
    }




    @Override
    public int compareTo(Student o) {
        int diff = this.marks=o.marks;
        return diff;
    }
}
