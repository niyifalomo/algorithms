package com.algorithms;

import java.util.Arrays;

public class AlgorithmsMain {

    public static void main(String[] args){

        int[] arr = {14,1,3,4,5,6};
        int target = 4;
        Arrays.sort(arr);
        int targetIndex = BinarySearch.search(arr,0,arr.length-1,target);

        System.out.printf("Target found at Index : %s", targetIndex);
    }

}
