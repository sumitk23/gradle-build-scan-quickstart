package com.couresera.algorithms;

/**
 * Created by sumikum3 on 19:51 2018-11-05
 */

public class MergeSort {

    public static int[] mergeSort(int[] numbers) {

        int len = numbers.length;

        if(len < 2) return numbers;

        int mid = len/2;

        int[] lArray = new int[mid];
        int[] rArray = new int[len - mid];

        /*for (int i =0; i <mid ; i++) {
            lArray[i] = numbers[i];
        }

        for (int j =mid; j <len ; j++) {
            rArray[j-mid] = numbers[j];
        }*/
        System.arraycopy(numbers, 0, lArray, 0, mid);
        System.arraycopy(numbers, mid, rArray, 0, len-mid);

        mergeSort(lArray);
        mergeSort(rArray);
        return merge(numbers, lArray, rArray);

    }

    private static int[] merge(int[] numbers, int[] lArray, int[] rArray) {

        int i =0, j=0, k=0;
        while ( i < lArray.length && j < rArray.length) {
            if(lArray[i] <= rArray[j]) {
                numbers[k] = lArray[i];
                i++;
            }else {
                numbers[k] = rArray[j];
                j++;
            }
            k++;
        }
        while( i < lArray.length) {
            numbers[k] = lArray[i];
            i++;
            k++;
        }

        while( j < rArray.length) {
            numbers[k] = rArray[j];
            j++;
            k++;
        }
        return numbers;

    }


}
