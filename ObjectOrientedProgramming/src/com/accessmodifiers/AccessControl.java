package com.accessmodifiers;

public class AccessControl {
     private int reg_no;
     private String name;
     private int[] marks;

     public int getReg_no() {
          return reg_no;
     }

     public void setReg_no(int reg_no) {
          this.reg_no = reg_no;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int[] getMarks() {
          return marks;
     }

     public void setMarks(int[] marks) {
          this.marks = marks;
     }

     public AccessControl(int reg_no, String name) {
          this.reg_no = reg_no;
          this.name = name;
          this.marks = new int[reg_no];
     }




}
