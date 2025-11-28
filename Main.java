import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // ANSI color codes
    public static final String RESET  = "\u001B[0m";
    public static final String CYAN   = "\u001B[36m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED    = "\u001B[31m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

    // --- Math functions ---
    public static int add(int a, int b)        { return a + b; }
    public static int subtract(int a, int b)   { return a - b; }
    public static int multiply(int a, int b)   { return a * b; }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println(RED + "Error: Cannot divide by zero!" + RESET);
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println(RED + "Error: Cannot modulo by zero!" + RESET);
            return 0;
        }
        return a % b;
    }

    public static double squareRoot(int a) {
        if (a < 0) {
            System.out.println(RED + "Error: Cannot take square root of a negative number!" + RESET);
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    // --- Input helper (safe integer read) ---
    public static int getInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(YELLOW + prompt + RESET);

            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(RED + "Invalid input! Please enter a number." + RESET);
                scanner.next(); // Clear invalid input
            }
        }
    }

    // --- Get two inputs cleanly ---
    public static int[] getTwoNumbers(Scanner scanner) {
        int x = getInt(scanner, "Enter first number: ");
        int y = getInt(scanner, "Enter second number: ");
        return new int[]{x, y};
    }

    // --- Menu UI ---
    public static void printMenu() {
        System.out.println(BLUE + "\n========================================");
        System.out.println(PURPLE + "           ★ CALCULATOR MENU ★" + RESET);
        System.out.println(BLUE + "========================================" + RESET);

        System.out.println(GREEN +
           " 1. Addition\n" +
           " 2. Subtraction\n" +
           " 3. Multiplication\n" +
           " 4. Division\n" +
           " 5. Square Root\n" +
           " 6. Modulo\n" +
           " 7. Exit\n" + RESET
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            printMenu();
            int choice = getInt(scanner, "Select an option (1–7): ");
            System.out.println();

            switch (choice) {
                case 1: {
                    int[] num = getTwoNumbers(scanner);
                    System.out.println(GREEN + "Result = " + add(num[0], num[1]) + RESET);
                    break;
                }

                case 2: {
                    int[] num = getTwoNumbers(scanner);
                    System.out.println(GREEN + "Result = " + subtract(num[0], num[1]) + RESET);
                    break;
                }

                case 3: {
                    int[] num = getTwoNumbers(scanner);
                    System.out.println(GREEN + "Result = " + multiply(num[0], num[1]) + RESET);
                    break;
                }

                case 4: {
                    int[] num = getTwoNumbers(scanner);
                    System.out.println(GREEN + "Result = " + divide(num[0], num[1]) + RESET);
                    break;
                }

                case 5: {
                    int x = getInt(scanner, "Enter the number: ");
                    System.out.println(GREEN + "Square Root = " + squareRoot(x) + RESET);
                    break;
                }

                case 6: {
                    int[] num = getTwoNumbers(scanner);
                    System.out.println(GREEN + "Result = " + modulo(num[0], num[1]) + RESET);
                    break;
                }

                case 7:
                    System.out.println(CYAN + "Goodbye! Thanks for using the calculator!" + RESET);
                    scanner.close();
                    return;

                default:
                    System.out.println(RED + "Invalid option! Please choose again." + RESET);
            }
        }
    }
}
