package com.Sujal;


import java.util.Scanner;

public class LCM {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int input1 = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int input2 = sc.nextInt();
        for(int i=1; i<10; i++){
            if((input1*i)%input2==0){
                System.out.print("The LCM is "+(input1*i));
                break;
            }
        }


    }
}
