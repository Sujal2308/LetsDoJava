package com.Sujal;

import java.util.Scanner;

public class FindCombinations {
    public static void main(String[] args) {
        // nCr = n! / r! * (n-r)!
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the no. of objects : ");
        int n = sc.nextInt();
        System.out.print("Enter number of choosing objects: ");
        int r = sc.nextInt();
        int combinations = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(combinations);
    }
    static int factorial(int num){
        int sum = 1;
        while(num>0){
            sum = sum * num;
            num--;
        }
        return sum;
    }
}
