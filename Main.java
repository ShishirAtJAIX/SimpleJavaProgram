import java.util.Scanner;

public class Main {

    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";

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

    // Helper input method
    public static int getInt(Scanner scanner, String text) {
        System.out.print(YELLOW + text + RESET);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            // --- UI Header ---
            System.out.println(BLUE + "\n========================================");
            System.out.println(PURPLE + "           ★ CALCULATOR MENU ★" + RESET);
            System.out.println(BLUE + "========================================" + RESET);

            // --- Menu Options ---
            System.out.println(GREEN + " 1. Addition");
            System.out.println(" 2. Subtraction");
            System.out.println(" 3. Multiplication");
            System.out.println(" 4. Division");
            System.out.println(" 5. Square Root");
            System.out.println(" 6. Modulo");
            System.out.println(" 7. Exit\n" + RESET);

            // --- User choice ---
            System.out.print(YELLOW + "Select an option (1–7): " + RESET);
            int choice = scanner.nextInt();
            System.out.println();

            int x, y;

            switch (choice) {
                case 1:
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + add(x, y) + RESET);
                    break;

                case 2:
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + subtract(x, y) + RESET);
                    break;

                case 3:
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + multiply(x, y) + RESET);
                    break;

                case 4:
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + divide(x, y) + RESET);
                    break;

                case 5:
                    x = getInt(scanner, "Enter the number: ");
                    System.out.println(GREEN + "Square Root = " + squareRoot(x) + RESET);
                    break;

                case 6:
                    x = getInt(scanner, "Enter first number: ");
                    y = getInt(scanner, "Enter second number: ");
                    System.out.println(GREEN + "Result = " + modulo(x, y) + RESET);
                    break;

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
