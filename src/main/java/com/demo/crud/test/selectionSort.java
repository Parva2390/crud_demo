//package com.demo.crud.test;
//
//public class selectionSort {
//
//    public static void main(String[] args) {
//        int[] listOfUnstoredArray = {1,4,6,890,7,65,423,235,7,85,43};
//
//        int[] sortedArray = selection(listOfUnstoredArray);
//
//        for(int i:sortedArray){
//            System.out.println(i);
//        }
//    }
//
//    private static int[] selection(int[] listOfUnstoredArray) {
//
//        int lengthOfArr = listOfUnstoredArray.length;
//        int smallestLength = -1;
//
//        int temp  = 0;
//
//        for(int i=0;i<lengthOfArr;i++){
//            smallestLength = i;
//            for(int j=i;j<lengthOfArr;j++){
//                if(listOfUnstoredArray[smallestLength]>listOfUnstoredArray[j]){
//                    smallestLength = j;
//                }
//            }
//
//            temp = listOfUnstoredArray[i];
//            listOfUnstoredArray[i] = listOfUnstoredArray[smallestLength];
//            listOfUnstoredArray[smallestLength] = temp;
//        }
//
//        return listOfUnstoredArray;
//
//    }
//}
