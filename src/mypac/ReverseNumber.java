package mypac;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = scan.nextInt();
        int reversedNumber = 0;
        int digit;

        while(number != 0){
            digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;
            number/=10;
        }

        System.out.println("Reversed number: " + reversedNumber);
    }
}
