package mypac;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter text you want to check for vowels: ");
        String text = scan.nextLine();
        int count = 0;

        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == 'a'|| text.charAt(i) == 'e'|| text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Text has " + count + " vowels!");
    }
}
