package mypac;

import java.util.Scanner;

public class PincodeValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int pincode = 12345;

        for(int pinAttempt = 0; pinAttempt < 3; pinAttempt++){
            System.out.print("Enter Pincode: ");
            int pin = scan.nextInt();

            if(pin == pincode){
                System.out.println("That's right, welcome back!");
                break;
            }
            else if(pinAttempt < 2)
                System.out.println("Wrong, try again!");
            else
                System.out.println("Sorry, your account is locked!");
        }
    }
}
