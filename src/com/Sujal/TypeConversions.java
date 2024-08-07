package com.Sujal;

public class TypeConversions {
    public static void main (String[] args){
        /* Automatic Type conversions =>
        These conversions happen by default by compiler when
        we try to store smaller datatype values to bigger ones
        Ex : byte value store in int variable
         */
        byte b = 100;
        int a = b;
        System.out.println(a); // 100

        float fl = a;
        System.out.println(fl); //100.0

        char ch = 'a';
        int int1 = ch;
        System.out.println(int1); //97

        char ch2 = 67;
        // here 67 is not refer to any int type variable so thats why
        // we are able to store it.
        System.out.println(ch2); // C

        /* Type Casting => Here we are telling compiler explicitly
        store bigger datatype value into smaller one.

        Note : 1) By default , Compiler doesn't perform type casting
        automatically because of data inconsistencies and losses

        2) DataType will be same on both the sides
        ex : int val = (int) byte1 - It is read as ,
        In integer type variable named val , we are storing integer value
        of byte1
         */

        // Working => First RHS expression is evaluated and then conversion

        int myNum = 97;
        char myChar = (char) myNum;
        System.out.println(myChar); // a

        byte myByte = (byte) myNum;
        System.out.println(myByte); // 97 because value is in range;

        myNum = 200;
        myByte = (byte) myNum;
        System.out.println(myByte); // -56

        float num1 = 10.2f , num2 = 5.3f;
//        int num3 = (int) (num1 * num2);
        // first product i.e 10.2 * 5.3 = 54.06
        // then (int) 54.06 = 54 getting stored
        System.out.println((int) (num1 * num2)); //54


   /* Note : 1)char to ASCII values in automatic;
             2)ASCII values to char is explicit;
   */


    }
}
