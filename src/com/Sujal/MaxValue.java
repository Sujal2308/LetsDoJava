package com.Sujal;

public class MaxValue {
    public static void main(String[] args) {
        int[] sortArray = {5,3,10,16,2,100};

//        Maximum value from array without sort
        int maxValue = 0;
        for(int i = 0 ; i<sortArray.length;i++){
            if(sortArray[i]>maxValue){
               maxValue = sortArray[i];
            }
        }
        System.out.println(maxValue);


//        Minimum value from the array without sort
     int[] arr = {67,20,2,3,100};
        int smallestValue = arr[0];
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] <= smallestValue){
                smallestValue = arr[i];
            }
        }
        System.out.println("The smallest value is "+smallestValue);

    }
}

