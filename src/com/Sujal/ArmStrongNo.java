package com.Sujal;

import java.util.Scanner;

public class ArmStrongNo {

    public static void main(String[] args) {


        for(int i = 100 ; i<1000 ; i++){
            int sum = 0;
            int copy = i;
            while(copy>0){
                int digit = copy % 10;
                sum = sum + (digit*digit*digit);
                copy = copy / 10;
            }

            if(i ==  sum)
                System.out.println(i);
        }
        



        // printing first 20 prime no
        for(int  j = 2 ; j < 50 ; j++){
            int flag = 0;
            for(int i = 2 ; i< j; i++){
                if(j %i==0){
                    flag++;
                    break;
                }

            }
            if(flag==0){
                System.out.println(j);
            }

        }

        // factorial of given number
        Scanner in = new Scanner(System.in);
        int inputNo = in.nextInt();
        int factorial  = inputNo;
        for(int i = 1 ; i < inputNo ; i++ ){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }

}
