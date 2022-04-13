package mypac;

import java.util.Scanner;

public class CheckPositiveNegativeZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        String again;
        int countPositive = 0;
        int countNegative = 0;
        int countZeroes = 0;

        do{
            System.out.print("Do you want to enter a number? (Yes/No) ");
            again = scan.next();

            if(again.equalsIgnoreCase("Yes")){
                System.out.print("Enter a number: ");
                number = scan.nextInt();

                if(number > 0)
                    countPositive++;
                else if(number < 0)
                    countNegative++;
                else
                    countZeroes++;
            }
            else{
                System.out.println("\nTotal Positive Numbers: " + countPositive);
                System.out.println("Total Negative Numbers: " + countNegative);
                System.out.println("Total Zeros: " + countZeroes);
            }
        }
        while(again.equalsIgnoreCase("Yes"));
    }
}
