package com.demo.crud.configuration;

public class MergeSort {
    public static void main(String[] args) {
        int[] listOfUnstoredArray = {1,4,6,890,7,65,423,235,7,85,43};

        merge(listOfUnstoredArray);

        for(int i:listOfUnstoredArray){
            System.out.println(i);
        }
    }

    private static void merge(int[] listOfUnstoredArray) {
        int lengthOfArr = listOfUnstoredArray.length;
        int mid = lengthOfArr/2;

        int[] leftShiftArr = new int[mid];
        int[] rightShiftArr = new int[lengthOfArr-mid];

        if(lengthOfArr<2){
            return;
        }

        for(int i=0;i<mid;i++){

                leftShiftArr[i] = listOfUnstoredArray[i];

        }

        for(int j=mid;j<lengthOfArr;j++){
            rightShiftArr[j-mid] = listOfUnstoredArray[j];
        }

        merge(leftShiftArr);
        merge(rightShiftArr);
        mergeAll(leftShiftArr,rightShiftArr,listOfUnstoredArray);

    }

    private static void mergeAll(int[] leftShiftArr, int[] rightShiftArr, int[] listOfUnstoredArray) {
        int rightShiftLength = rightShiftArr.length;
        int leftShiftLength = leftShiftArr.length;

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < leftShiftLength && j < rightShiftLength) {
            if (leftShiftArr[i] < rightShiftArr[j]) {
                listOfUnstoredArray[k] = leftShiftArr[i];
                i++;
            } else {
                listOfUnstoredArray[k] = rightShiftArr[j];
                j++;


            }
            k++;
        }

            while (i < leftShiftLength) {
                listOfUnstoredArray[k] = leftShiftArr[i];
                i++;
                k++;
            }

            while (j < rightShiftLength) {
                listOfUnstoredArray[k] = rightShiftArr[j];
                j++;
                k++;
            }


    }
}
