package com.Sujal;
import java.util.Scanner;
import java.util.ArrayList;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();
        char[] Arr = input.toCharArray();
        ArrayList<Character> newArr = new ArrayList<>();
        for(char i : Arr){
            if(!newArr.contains(i)){
                newArr.add(i);
            }
        }
        int count = 0;
        for(char i  : newArr){
            for(char j : Arr){
                if(i==j){
                    count++;
                }
            }
            System.out.println(i+": "+count);
            count = 0;
        }
    }
}
