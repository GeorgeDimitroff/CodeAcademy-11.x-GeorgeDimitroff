package mypac;

import java.util.Scanner;

public class PrintMinValueAndMaxValueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String again;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do{
            System.out.print("Do you want to enter a number? (Yes/No) ");
            again = scan.next();

            if(again.equalsIgnoreCase("Yes")){
                System.out.print("Enter a number: ");
                number = scan.nextInt();

                if(number < min)
                    min = number;
                else if(number > max)
                    max = number;
            }
            else{
                System.out.println("Min Number : " + min);
                System.out.println("Max Number : " + max);
            }
        }
        while(again.equalsIgnoreCase("Yes"));
    }
}
