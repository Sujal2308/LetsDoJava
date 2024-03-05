import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//       Basic Calculator program using switchCase
        System.out.print("What calulation you wanna do? : ");
        String c = input.nextLine();
        if(
                Objects.equals(c, "+") ||
                Objects.equals(c, "-") ||
                Objects.equals(c, "*") ||
                Objects.equals(c, "/") ||
                Objects.equals(c,"%")
        ){
            System.out.print("Enter number 1: ");
            int num1 = input.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = input.nextInt();
            switch (c){
                case "+" -> System.out.println(num1+num2);
                case "-" -> System.out.println(num1-num2);
                case "*" -> System.out.println(num1*num2);
                case "/" -> {
                    if(num2==0){
                        System.out.println("Denominator can't be zero");
                    }else{
                        System.out.println(num1/num2);
                    }
                }
                case "%" -> System.out.println(num1%num2);
            }
        }else{
            System.out.println("Enter valid symbol");
        }





    }
}
