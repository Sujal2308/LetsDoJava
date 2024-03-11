import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the factorial of: ");
        int userValue = input.nextInt();
        if(userValue==0){
            System.out.println("The factorial is 1");
        }else{
            int num = userValue;
            for(int i = 1 ; i < userValue ; i++){

                num = num * (userValue - i);

            }
            System.out.println("The factorial of "+userValue+" is "+num);


        }

    }
}
