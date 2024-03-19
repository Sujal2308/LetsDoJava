package com.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {
        int[] arr = {100,5,7,2};

        int sum = 0;
//        for(int i = 0; i<arr.length ; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        for(int val : arr){
            sum = sum +val;
        }
        System.out.println(sum);
        String[] arr2 = {"first" , "second" , "third" , "fourth"};

//        Iterating over an array using for loop

//        for(int i = 0 ; i<arr.length ; i++){
//            System.out.println("The "+arr2[i]+" element is "+arr[i]);
//
//        }
//        Type :2 (using toString method )
//        System.out.println(Arrays.toString(arr));

//        Using for each loop
//        for (int num:arr) {
//            System.out.println(num);
//        }

        int myArr[] = {1,2,3,4,5}; // array literal
        int[] myArr2 ;
        myArr2 = new int[5]; // creating array object
        myArr2[0] = 3;
        myArr2[3] = 5;
        int[] myArr3 = new int[]{1,2,3,4};

//       Stagggered array
        int[][] multiArray = {{1,2,100,400},{3,4},{4,5},{6,7}};

//        Traversing 2D array
//        int val  = 1;
//        for(int i = 0 ; i < multiArray.length ; i++){
//            System.out.print("Row "+val+": ");
//            for (int j= 0 ; j<multiArray[i].length ; j++){
//                System.out.print(multiArray[i][j]+" ");
//            }
//            System.out.print("\n");
//            val++;
//        }



       
    }




    }

