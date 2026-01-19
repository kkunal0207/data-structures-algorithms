package com.dsa.learning.arrays;
/*
Take input an array A of size N and write a program to print maximum and minimum elements of the input.
The only line of the input would contain a single integer N that represents the length of the array 
followed by the N elements of the input array A.

Time Complexity = O(N)
Space Complexity = O(1)
*/

public class MinMaxInArray{
    public static void main(String[] args){
        int[] arr = {5,1,2,3,4,5};
        int lengthOfArray = arr.length;
        int[] result = getMinMaxInAnArray(arr,lengthOfArray);

        System.out.println(result[0] + " "+ result[1]);

    }

    public static int[] getMinMaxInAnArray(int[] arr, int lengthOfArray){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<lengthOfArray; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return new int[]{max,min};
        /*

        Question: “But you’re returning an array?”

        Answer: “Output space is not considered in space complexity analysis, so auxiliary space is O(1).”

        */
    }
}