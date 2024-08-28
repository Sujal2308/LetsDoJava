package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] originalArr = new int[size];
        System.out.println("Enter the items :");
        for(int i = 0 ; i < originalArr.length ; i++){
            originalArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(originalArr));
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i : originalArr){
            if (!newArray.contains(i)) {
                newArray.add(i);
            }
        }
        System.out.println(newArray);
    }

}
