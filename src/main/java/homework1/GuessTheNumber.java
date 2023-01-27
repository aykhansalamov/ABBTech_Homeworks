package homework1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    static int selected;
    static int entered;
    static String name;
    

    static int[] allNumbers = new int[100];
    static int i = 0;

    public static void enterNumber() {
        // Enter a number for checking
        Scanner scanner = new Scanner(System.in);
        boolean isNumeric = false;//This will be set to true when numeric val entered
        while(!isNumeric) // Check the input is a number or not
            try {
                System.out.print("Please, guess the random number: ");

                entered = scanner.nextInt();

                allNumbers[i] = entered;
                i++;
                conditions();
            } catch(InputMismatchException ime) {
                //Display Error message
                System.out.println("Invalid character found. Please, enter numeric values only!");
                scanner.nextLine();//Advance the scanner
            }


    }

    public static void conditions() {
        // Checking the number entered by the user
        if (entered == selected) {
            System.out.println("Congratulations, " + name + "!");
            System.out.print("All entered numbers are: ");
            arraySort();
        } else if (entered > selected) {
            System.out.println("Your number is too big. Please, try again.");
            enterNumber();

        } else {
            System.out.println("Your number is too short. Please, try again.");
            enterNumber();

        }
    }

    public static void randomNumber() {
// create instance of Random class
        Random randomNum = new Random();
        selected = randomNum.nextInt(100);
    }

    public static void arraySort() {
        // Sorting elements of array of entered numbers
        int temp = 0;

        for (int i = 0; i < allNumbers.length; i++) {
            for (int j = 1; j < allNumbers.length; j++) {
                if (allNumbers[j - 1] < allNumbers[j]) {
                    temp = allNumbers[j - 1];
                    allNumbers[j - 1] = allNumbers[j];
                    allNumbers[j] = temp;
                }
            }
        }

        for (int j = 0; j < allNumbers.length; j++) {
            if (allNumbers[j] != 0) {
                System.out.print(allNumbers[j] + " ");
            }
        }
    }
}
