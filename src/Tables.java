import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Calculate the table of: ");
        int value = input.nextInt();
        int initialVal = 1;
        for(int num = value ; num <= value*10 ; num = num + value){
            System.out.println(value+"*"+initialVal+"="+num);
            initialVal++;

        }
    }
}
