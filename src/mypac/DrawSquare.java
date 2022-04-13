package mypac;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of square: ");
        int size = scan.nextInt();

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                System.out.printf("%-3s", "#");
            }
            System.out.println();
        }
    }
}
