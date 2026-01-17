package com.dsa.learning.arrays;

import java.util.Arrays;

public class RotateArrayKTimes{
    public static void main(String[] args){

        int[] arr = {3,-2,1,4,6,9,8};
        int K = 52;
        int N = 7;

        if(K>N){
            K = K%N;
            System.out.println(K);
        }

        // step 1: revesre the entire array
        reverseArrayTwoPointers(arr,N,0,N-1 );

        // reserse first K elements
        reverseArrayTwoPointers(arr,N,0,K-1);

        //reverse last N-K elements
        reverseArrayTwoPointers(arr,N,K,N-1);

        //Print the K times rotated Array
        System.out.println(Arrays.toString(arr));



    }

    public static void reverseArrayTwoPointers(int[] arr, int lengthOfArray, int start, int end){
        int i = start;
        int j = end;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }

}