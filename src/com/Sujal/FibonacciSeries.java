package com.Sujal;

public class FibonacciSeries {
    public static void main(String[] args) {
        int initialValue = 0;
        int finalValue = 1;
        int series;
        System.out.print(initialValue + " "+finalValue+" ");
        for(int i = 0 ; i<10 ; i++ ){

            series = initialValue + finalValue;

            initialValue = finalValue;
            finalValue = series;
            System.out.print(series+" ");



        }

        System.out.println("\n");

        int[] arr = {1,67,20,2,3,100};
        int smallestValue = arr[0];
        for(int i = 1 ; i < arr.length ;i++){
            if(arr[i] < smallestValue){
                smallestValue = arr[i];
            }
        }
        System.out.println("The smallest value is "+smallestValue);


    }

    }

// fibonacci => 0,1,1,2,3,5