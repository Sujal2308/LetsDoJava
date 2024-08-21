package com.Arrays;
import  java.util.Arrays;

public class ReverseOfArray {
    public static void main(String[] args) {
        int[] mainArr = {1,2,3,4,5};
        int[] reverseArr = new int[mainArr.length];
        int k = 0;
        for(int i = mainArr.length-1 ; i>=0;i--){
            reverseArr[k] = mainArr[i];
            k++;
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
