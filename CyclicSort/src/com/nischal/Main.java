package com.nischal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,8,7,5,10,9};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    Cyclic Sort
        if the numbers lie  between 1 to n
        in a sorted array the index should be equal to value-1
        so the right index is value -1
        if nums[i](value at i) is  not  equal to nums[rightIndex] (value it is supposed to be
        then we swap
     */
    static void cyclicSort(int[] nums){
        int i=0;
        while(i<nums.length){
            int rightIndex = nums[i]-1;
            if(nums[i]!=nums[rightIndex]) {
                swap(nums, i, rightIndex);
                i++;
            }else{
                break;
            }
        }
    }

    private static void swap(int[] nums, int i, int rightIndex) {
        int temp = nums[rightIndex];
        nums[rightIndex] = nums[i];
        nums[i] = temp;
    }
}