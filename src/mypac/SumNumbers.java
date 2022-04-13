package mypac;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers below: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num;
        int sum = num1 + num2;
        String again;

        System.out.print("Current sum of entered numbers is: " + sum);

        do{

            System.out.print("\nDo you want to sum another number? (Yes/No) ");
            again = scan.next();

            if(again.equalsIgnoreCase("Yes")){
                System.out.print("Enter a new number: ");
                num = scan.nextInt();

                sum+=num;
                System.out.print("Current sum of entered numbers is: " + sum);
            }
            else
                System.out.print("Current sum of entered numbers is: " + sum);
        }
        while(again.equalsIgnoreCase("Yes"));
    }
}
