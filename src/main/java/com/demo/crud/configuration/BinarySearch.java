package com.demo.crud.configuration;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] listOfUnsortedArray = {434,3,77,8,1,9,64,32,111};
        int target =1;

        int index = binarySearch(Arrays.stream(listOfUnsortedArray).sorted().toArray(),target);
        System.out.println("Element found at index:"+index);
    }

    private static int binarySearch(int[] listOfUnsortedArray, int target) {
        int arrayLength = listOfUnsortedArray.length;
        int low = 0;
        int high = arrayLength;
        while(low<high) {
            int mid = (low + high) / 2;

            if(target == listOfUnsortedArray[mid]){
                return mid;
            }

            if (target > listOfUnsortedArray[mid]){
                low = low+1;
            }

            if(target < listOfUnsortedArray[mid]){
                high = high-1;
            }

        }
        return -1;

    }
}
