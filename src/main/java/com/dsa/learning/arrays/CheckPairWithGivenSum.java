package com.dsa.learning.arrays;

/*
 Given an array of size N, check if there is a pair i,j such that arr[i] + arr[j] = K and i != j.
 i and j are indexes and K is the given Sum

 Time Complexity: O(n*n)
 Space Complexity: O(1)

 */

public class CheckPairWithGivenSum {

    public static boolean checkPairSumBruteForce(int[] arr, int targetSum) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((i != j) && (arr[i] + arr[j] == targetSum)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {

//        int[] arr = {3,-1,1,4,3,6,8}; int targetSum = 10;
        int[] arr = {2,4,-3,7};
        System.out.println("there is pairSum: " + checkPairSumBruteForce(arr,8));
    }

}
