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
        int minValue = 0;
        int upValue = 0;
        for(int i = 0 ; i <sortArray.length ; i++){
            if(sortArray[i]<minValue){
                upValue = sortArray[i];
            }
            minValue = sortArray[i];
        }
        System.out.println(upValue);
    }
}
