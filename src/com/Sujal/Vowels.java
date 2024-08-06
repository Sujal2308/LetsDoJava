package com.Sujal;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        char[] arr = {'a','e','i','o','u'};
        for(int i = 0 ; i<input.length() ; i++){
            for (char c : arr) {
                if (input.charAt(i) == c) {
                    count++;
                    break;
                }


            }
        }
        System.out.println("The count of vowels is : "+count);
    }
}
