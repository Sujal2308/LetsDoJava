package com.Sujal;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary value: ");
        int input = sc.nextInt();
        System.out.println(Conversion(input));

    }
    static int Conversion(int num){
        double sum = 0;
        double i = 0;
        int value = num;
        while(value>0){
            num = value % 10;
            if(num==1){
                sum = sum + Math.pow(2,i);

            }
            value = value / 10;
            i++;
        }
        return (int)sum;


    }

}
