//Test
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

    // ASCII Banner (properly spelled "CALCULATOR")
    private static final String BANNER = PURPLE +
            "   _____      _            _       _             \n" +
            "  / ____|    | |          | |     | |            \n" +
            " | |     __ _| | ___ _   _| | __ _| |_ ___  _ __ \n" +
            " | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|\n" +
            " | |___| (_| | | (__| |_| | | (_| | || (_) | |   \n" +
            "  \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   \n" +
            RESET;

    // Math functions
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println(RED + "Error: Cannot divide by zero!" + RESET);
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println(RED + "Error: Cannot perform modulo with zero!" + RESET);
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

    // Helper method for integer input (safe)
    public static int getInt(Scanner scanner, String prompt) {
        System.out.print(YELLOW + prompt + RESET);
        while (!scanner.hasNextInt()) {
            System.out.print(RED + "Invalid number! Try again: " + RESET);
            scanner.next(); // discard invalid token
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume end-of-line
        return value;
    }

    // MAIN
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(BANNER); // Display banner once at start

        while (true) {

            // Menu Header
            System.out.println(BLUE + "========================================");
            System.out.println(PURPLE + "              ★ CALCULATOR MENU ★");
            System.out.println(BLUE + "========================================" + RESET);

            // Menu Options
            System.out.println(GREEN +
                    " 1. Addition\n" +
                    " 2. Subtraction\n" +
                    " 3. Multiplication\n" +
                    " 4. Division\n" +
                    " 5. Square Root\n" +
                    " 6. Modulo\n" +
                    " 7. Exit\n" +
                    RESET
            );

            int choice = getInt(scanner, "Select an option (1–7): ");
            System.out.println();

            int x, y;

            switch (choice) {
                case 1: // Addition
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + add(x, y) + RESET);
                    break;

                case 2: // Subtraction
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + subtract(x, y) + RESET);
                    break;

                case 3: // Multiplication
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + multiply(x, y) + RESET);
                    break;

                case 4: // Division
                    x = getInt(scanner, "Enter numerator: ");
                    y = getInt(scanner, "Enter denominator: ");
                    System.out.println(GREEN + "Result = " + divide(x, y) + RESET);
                    break;

                case 5: // Square Root
                    x = getInt(scanner, "Enter the number: ");
                    System.out.println(GREEN + "Square Root = " + squareRoot(x) + RESET);
                    break;

                case 6: // Modulo
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + modulo(x, y) + RESET);
                    break;

                case 7: // Exit
                    System.out.println(CYAN + "Goodbye! Thanks for using the calculator!" + RESET);
                    scanner.close();
                    return;

                default:
                    System.out.println(RED + "Invalid option! Please choose between 1 and 7." + RESET);
            }

            System.out.println(); // blank line before next iteration
        }
    }
}
