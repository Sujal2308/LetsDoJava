package com.Sujal;
import java.util.Scanner;
public class FourDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input = sc.nextInt();
        int count = 0;
        while(input>0){
           input = Math.floor(input/10);
           count++;
        }
        System.out.println(count+" digit Number");
    }
}
