//package com.demo.crud.configuration;
//
//public class InsertionSort {
//    public static void main(String[] args) {
//        int[] listOfUnstoredArray = {1,4,6,890,7,65,423,235,7,85,43};
//
//        int[] sortedArray = insert(listOfUnstoredArray);
//
//        for(int i:sortedArray){
//            System.out.println(i);
//        }
//    }
//
//    private static int[] insert(int[] listOfUnstoredArray) {
//        int lengthOfArr = listOfUnstoredArray.length;
//
//
//        for(int i=1;i<lengthOfArr;i++){
//            int j = i-1;
//            int key = listOfUnstoredArray[i];
//            while(j>=0 && listOfUnstoredArray[j]>key){
//                listOfUnstoredArray[j+1]  = listOfUnstoredArray[j];
//                j--;
//            }
//            listOfUnstoredArray[j+1] = key;
//        }
//
//        return listOfUnstoredArray;
//    }
//}
