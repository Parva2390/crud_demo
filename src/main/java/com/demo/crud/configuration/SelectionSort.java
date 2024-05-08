package com.demo.crud.configuration;

public class SelectionSort {
    public static void main(String[] args) {
        int[] listOfUnstoredArray = {1,4,6,890,7,65,423,235,7,85,43};

        int[] sortedArray = selection(listOfUnstoredArray);

        for(int i:sortedArray){
            System.out.println(i);
        }
    }

    private static int[] selection(int[] listOfUnstoredArray) {

     int lengthOfArr = listOfUnstoredArray.length;
     int smallestIndex = -1;
     int temp=0;
     for(int i=0;i<lengthOfArr;i++){
         smallestIndex = i;
         for(int j=i+1;j<lengthOfArr;j++){
             if(listOfUnstoredArray[smallestIndex]>listOfUnstoredArray[j]){
                 smallestIndex = j;
             }
         }


         temp = listOfUnstoredArray[smallestIndex];
         listOfUnstoredArray[smallestIndex] = listOfUnstoredArray[i];
         listOfUnstoredArray[i] = temp;
     }

     return listOfUnstoredArray;

    }
}
