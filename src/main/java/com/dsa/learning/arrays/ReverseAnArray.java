package com.dsa.learning.arrays;

import java.util.Arrays;

/*
“The array is reversed in-place using two pointers,
 so it takes linear time O(n) and constant auxiliary space O(1).”
 */
public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverseArrayTwoPointers(arr, 8);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArrayTwoPointers(int arr[], int lengthOfArray) {

        int i = 0;
        int j = lengthOfArray - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

}