import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        int userInput = scanner.nextInt();

        while (userInput != 0) {
            // отработка разных случаев

            printMenu(); // печать меню еще раз перед завершение
            userInput = scanner.nextInt();
        }
        System.out.println("Программа завершена");
    }

    private static void printMenu() {

    }
}
