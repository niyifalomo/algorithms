package com.algorithms;

import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] arrayToSort){
        if (arrayToSort.length < 2)
            return arrayToSort;

        int mid = arrayToSort.length / 2;

        int[] left = Arrays.copyOfRange(arrayToSort,0, mid);
        int[] right = Arrays.copyOfRange(arrayToSort, mid, arrayToSort.length);

        int[] sortedLeft = sort(left);
        int[] sortedRight = sort(right);

        int[] sortedArray = new int[arrayToSort.length];
        int sortedLeftIndex = 0, sortedRightIndex=0;

        //merge sorted sub arrays,sortedLeft and  sortedRight.
        for (int selectedIndex = 0; selectedIndex < arrayToSort.length; selectedIndex++){
            if(sortedLeftIndex < sortedLeft.length && (sortedRightIndex >= sortedRight.length || sortedLeft[sortedLeftIndex] < sortedRight[sortedRightIndex])){
                sortedArray[selectedIndex] = sortedLeft[sortedLeftIndex];
                sortedLeftIndex++;
            }
            else{
                sortedArray[selectedIndex] = sortedRight[sortedRightIndex];
                sortedRightIndex++;
            }
        }
        return sortedArray;
    }
}
