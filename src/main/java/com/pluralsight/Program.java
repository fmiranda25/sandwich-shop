package com.pluralsight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        double sandwichPrice = 0;
        boolean isLoaded = false;

        Scanner userInput1 = new Scanner(System.in);
        System.out.println("Would you like sandwich size 1 or 2?: ");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        int sandwichSize = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Would you like your sandwich loaded?: ");
        String loadPreference = userInput2.nextLine();

        if (sandwichSize == 1){
            sandwichPrice = 5.45;
        } else if (sandwichSize == 2){
            sandwichPrice = 8.95;
        }
/*
        if (loadPreference == "yes") {
            if (sandwichSize == 1) {
                sandwichPrice += 1.00;
        }   else if (sandwichPrice == 2) {
                sandwichPrice += 1.75;
            }
        }
*/
        Scanner userInput3 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int userAge = userInput3.nextInt();

        if (userAge <= 17){
            sandwichPrice *= 0.9;
            System.out.println(sandwichPrice);
        } else if (userAge >= 65){
            sandwichPrice *= 0.8;
            System.out.println(sandwichPrice);
        } else {
            System.out.println(sandwichPrice);
        }

    }
}
