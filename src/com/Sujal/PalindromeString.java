package com.Sujal;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String inputStr = sc.nextLine();
        String demo = "";
        for(int i = inputStr.length()-1 ; i>=0 ; i--){
            demo = demo + inputStr.charAt(i);
        }
        if(demo.equals(inputStr)) // To compare Strings (obj) we use .equal()
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");


    }
}
