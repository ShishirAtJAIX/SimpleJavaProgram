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
            System.out.print("Enter first number: ");
            int x = scanner.nextInt();

            System.out.print("Enter second number: ");
            int y = scanner.nextInt();

            System.out.println("Sum: " + add(x, y));
            System.out.println("Difference: " + subtract(x, y));
            System.out.println("Product: " + multiply(x, y));
            System.out.println("Division: " + divide(x, y));

            System.out.println("Square root of " + x + ": " + squareRoot(x));
            System.out.println("Square root of " + y + ": " + squareRoot(y));

            System.out.print("Do another calculation? (Y/N): ");
            String again = scanner.next();

            if (!again.equalsIgnoreCase("y")) {
                System.out.println("Goodbye, See you soon !!!");
                break;
            }
        }

        scanner.close();
    }
}
