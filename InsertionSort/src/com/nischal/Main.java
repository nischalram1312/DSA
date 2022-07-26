package com.nischal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12,21,43,123,0,-1,2};
        System.out.println(Arrays.toString(nums));
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    /*Insertion Sort
        we partially sort the array here
        we first take w elements and sort it then 3 then 4. and so on
        the outer loop runs for nums-2 times to avoid out of bounds exception
    */
    static void insertionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for (int j = i+1; j >0 ; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums, j, j-1);
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}