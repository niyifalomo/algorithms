package com.algorithms;

public class BinarySearch {
    public static int search(int[] items,int firstIndex,int lastIndex, int target) {

        if (lastIndex < firstIndex)
            throw new IllegalArgumentException("Target not found in list");

        int mid = (firstIndex + lastIndex) / 2;

        if (items[mid] == target)
            return mid;
        else if (target > items[mid])
            return search(items, mid+1, lastIndex, target);
        else
            return search(items, firstIndex, mid - 1, target);
    }
}
