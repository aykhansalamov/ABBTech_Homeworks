package homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuessTheNumber.randomNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter your name: ");
        GuessTheNumber.name = scanner.nextLine();
        System.out.println("Let the game begin!");

GuessTheNumber.enterNumber();

    }
}
