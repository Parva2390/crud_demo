package com.demo.crud.test;

public class BubbleSort {
    public static void main(String[] args) {

        int[] listOfUnstoredArray = {1,4,6,890,7,65,423,235,7,85,43};

        int[] sortedArray = bubbleSort(listOfUnstoredArray);

        for(int i:sortedArray){
            System.out.println(i);
        }
    }

    private static int[] bubbleSort(int[] listOfUnstoredArray) {

        int lengthOfArr = listOfUnstoredArray.length;
        int temp=0;
        for(int i=0;i<lengthOfArr;i++){
            for(int j=0;j<lengthOfArr;j++){
                if(listOfUnstoredArray[i]<listOfUnstoredArray[j]){
                 temp = listOfUnstoredArray[i];
                 listOfUnstoredArray[i] = listOfUnstoredArray[j];
                 listOfUnstoredArray[j] = temp;
                }
            }
        }

        return listOfUnstoredArray;
    }
}
