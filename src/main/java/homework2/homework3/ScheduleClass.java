package homework2.homework3;

import java.util.Scanner;

public class ScheduleClass {
    static String[][] schedule = new String[7][2];

    public static void input() {
        table();
        System.out.print("Please, input weekday: ");
        Scanner scanner = new Scanner(System.in);
        String weekday = scanner.nextLine().toLowerCase();

        switch (weekday) {

            case "monday":
                System.out.println("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                input();
                break;
            case "tuesday":
                System.out.println("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                input();
                break;
            case "wednesday":
                System.out.println("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                input();
                break;
            case "thursday":
                System.out.println("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                input();
                break;
            case "friday":
                System.out.println("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                input();
                break;
            case "saturday":
                System.out.println("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                input();
                break;
            case "sunday":
                System.out.println("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                input();
                break;
            case "exit":
                break;
            default:
                System.out.println("Please, input the day of the week:");
                input();
                break;

        }
    }

    public static void table() {
        schedule[0][0] = "Monday";
        schedule[0][1] = "go to courses; watch a film.";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "meet with friends, sleep.";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "run, eat.";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "sleep, swim.";
        schedule[4][0] = "Friday";
        schedule[4][1] = "study, sleep.";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "go to university, run.";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "relax, relax, relax.";
    }
}
