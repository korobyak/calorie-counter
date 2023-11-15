import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void Main(String[] args) {
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            // отработка разных случаев
            if (userInput == 1) {
                int month = inputMonth();
                int day = inputDay();
                int steps = inputSteps();
                StepTracker.stepPerDay(month, day, steps);
            } else if (userInput == 2) {
                int month = inputMonth();
                StepTracker.statPerMonth(month);
            } else if (userInput == 3) {
                int steps = inputSteps();
                StepTracker.goal(steps);
            } else if (userInput == 4) {
                break;
            } else {
                System.out.println("Выберите значение от 1 до 4");
            }

            printMenu(); // печать меню еще раз перед завершением
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - ввести количество шагов за день");
        System.out.println("2 - напечатать статистику за месяц");
        System.out.println("3 - изменить цель шагов в день");
        System.out.println("4 - выход");
    }

    public static int inputMonth() {
        System.out.println("Введите номер месяца:");

        return scanner.nextInt() - 1;
    }

    public static int inputDay() {
        System.out.println("Введите день:");
        return scanner.nextInt();
    }

    public static int inputSteps() {
        System.out.println("Введите количество шагов:");
        return scanner.nextInt();
    }
}
