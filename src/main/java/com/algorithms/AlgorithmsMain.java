package com.algorithms;

import java.util.Arrays;

public class AlgorithmsMain {

    public static void main(String[] args){

        int[] arr = {14,1,3,4,5,6};
        int target = 4;
        //Arrays.sort(arr);
        int targetIndex = BinarySearch.search(arr,0,arr.length-1,target);
        System.out.printf("Target found at Index : %s", targetIndex);

        int[] arr2 = {14,1,3,17,100,4,5,6};
        System.out.println("\n\nSorted array (Merge Sort):"+ Arrays.toString(MergeSort.sort(arr2)));


    }

}
