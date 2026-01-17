package com.dsa.learning.arrays;

import java.util.*;

/*
“The part of array is reversed in-place using two pointers,
 so it takes linear time O(n) and constant auxiliary space O(1).”
 */

public class ReversePartOfAnArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        reversePartOfArrayTwoPointers(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }

    public static void reversePartOfArrayTwoPointers(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--; 
        }
    }
}