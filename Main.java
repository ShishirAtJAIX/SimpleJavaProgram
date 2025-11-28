import java.util.Scanner;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN;
        }
        return (double) a / b;
    }

    public static double squareRoot(int a) {
        if (a < 0) {
            System.out.println("Error: Cannot take square root of a negative number!");
            return Double.NaN;
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            int x, y;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    x = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    y = scanner.nextInt();
                    System.out.println("Result: " + add(x, y));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    x = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    y = scanner.nextInt();
                    System.out.println("Result: " + subtract(x, y));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    x = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    y = scanner.nextInt();
                    System.out.println("Result: " + multiply(x, y));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    x = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    y = scanner.nextInt();
                    System.out.println("Result: " + divide(x, y));
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    x = scanner.nextInt();
                    System.out.println("Square Root: " + squareRoot(x));
                    break;

                case 6:
                    System.out.println("Goodbye! BUG FIX #2");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        }

        scanner.close();
    }
}
