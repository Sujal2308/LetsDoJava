package com.Sujal;

import java.util.Scanner;

public class UserInSum {
    public static void main(String[] args) {
        System.out.print("How many number you want to add : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int i = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        while(i<input){
            int values  = in.nextInt();
            sum = sum + values;
            i++;
        }
        System.out.println(sum);

    }
}
