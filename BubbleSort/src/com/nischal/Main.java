package com.nischal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2,99,-1,0,42};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*Bubble Sort
        In bubble sort we compare the elements adjacent to each other
        if the element at j-1 is smaller than  the element at j
        we swap between j and j-1
        we iterate this for nums.legth times
    */

    static void sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            for (int j = 1; j < nums.length-i; j++) {
                if(nums[j]<nums[j-1]){
                    swap(nums, j-1, j);
                }
            }
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}