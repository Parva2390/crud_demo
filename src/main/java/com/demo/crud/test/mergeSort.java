//package com.demo.crud.test;
//
//public class mergeSort {
//
//    public static void main(String[] args) {
//        int[] listOfUnstoredArray = {1,4,6,890,7,65,423,235,7,85,43};
//
//        merge(listOfUnstoredArray);
//
//        for(int i:listOfUnstoredArray){
//            System.out.println(i);
//        }
//    }
//
//    private static void merge(int[] listOfUnstoredArray) {
//
//        int lengthOfArr = listOfUnstoredArray.length;
//        int mid = lengthOfArr/2;
//
//        int[] leftShiftArr = new int[mid];
//        int[] rightShiftArr = new int[lengthOfArr-mid];
//
//        if(lengthOfArr<2){
//            return;
//        }
//
//        for(int i=0;i<mid;i++){
//            leftShiftArr[i] = listOfUnstoredArray[i];
//        }
//
//        for(int i=mid;i<lengthOfArr;i++){
//            rightShiftArr[i-mid] = listOfUnstoredArray[i];
//        }
//
//        merge(leftShiftArr);
//        merge(rightShiftArr);
//        mergeAll(leftShiftArr,rightShiftArr,listOfUnstoredArray);
//    }
//
//    private static void mergeAll(int[] leftShiftArr, int[] rightShiftArr, int[] listOfUnstoredArray) {
//
//        int lengthOfLeft = leftShiftArr.length;
//        int lengthOfRight = rightShiftArr.length;
//
//        int i=0;
//        int j=0;
//        int k=0;
//
//        while(i<lengthOfLeft && j<lengthOfRight){
//            if(leftShiftArr[i]<rightShiftArr[j]){
//                listOfUnstoredArray[k] = leftShiftArr[i];
//                i++;
//            }
//            else{
//                listOfUnstoredArray[k] = rightShiftArr[j];
//                j++;
//            }
//            k++;
//        }
//
//        while(i<lengthOfLeft){
//            listOfUnstoredArray[k] = leftShiftArr[i];
//            i++;
//            k++;
//        }
//
//        while(j<lengthOfRight){
//            listOfUnstoredArray[k] = rightShiftArr[j];
//            j++;
//            k++;
//        }
//    }
//}
