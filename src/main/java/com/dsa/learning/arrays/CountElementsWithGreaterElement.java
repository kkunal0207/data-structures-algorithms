package com.dsa.learning.arrays;
/*
 Problem: Count elements with at least one greater element
 Intuition:
   - Brute force: Iterate array to get max and then iterate to find the number of max Element


 Time Complexity: O(n)
 Space Complexity: O(1)
*/


public class CountElementsWithGreaterElement {

    public static int countOfMaxElementBruteForce(int[] arr, int maxElement) {
        int lengthOfArray = arr.length;
        int maxElementCount = 0;
        for (int i = 0; i < lengthOfArray; i++) {
            if (arr[i] == maxElement) {
                maxElementCount++;
            }
        }

        return maxElementCount;
    }

    public static int getMaxElementBruteForce(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 8, 3};
        int maxElement = getMaxElementBruteForce(arr);
        int maxElementCount = countOfMaxElementBruteForce(arr, maxElement);
        System.out.println("Total Number of Element having at least 1 greater element is: " + (arr.length - maxElementCount));
    }


}
