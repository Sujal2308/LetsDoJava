package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        Palindrome number program

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num  = input.nextInt();
        int tempVal = num;
        int sum = 0;
        int updateValue;

        while(num>0){
          updateValue = num %10;
//   shortcut formula : sum = (sum*10)+updateValue;
          sum = (sum*10)+updateValue;
          num = num / 10;
        }

      if(tempVal == sum){
          System.out.println("palindrome");
      }
      else System.out.println("not palindrome");
    }

    }


