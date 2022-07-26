package com.nischal;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        int[] nums = {10,23,1,43,2,21,4,-1,-22,-99};
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*selection sort
        we check for the max element in the array and get its index,
        now we swap it with the element in the index
        now we run it again and remove the last element which is already sorted from iteration
    */
    static void selectionSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int last = nums.length-i-1;
            int max = getmaxIndex(nums, 0, last);
            swap(nums, max, last);
        }
    }

    private static int getmaxIndex(int[] nums, int start, int last) {
        int max = start;
        for(int i=0; i<=last; i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}