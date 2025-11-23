import java.util.Scanner;

public class Main {

    // Static methods for operations
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return Double.NaN; // Not a Number
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter first number: ");
                int x = scanner.nextInt();
                
                System.out.print("Enter second number: ");
                int y = scanner.nextInt();
                
                System.out.println("Sum: " + add(x, y));
                System.out.println("Product: " + multiply(x, y));
                System.out.println("Division: " + divide(x, y));
                
                System.out.print("Do another calculation? (y/n): ");
                String again = scanner.next();
                
                if (!again.equalsIgnoreCase("y")) {
                    System.out.println("Goodbye!");
                    break;
                }
            }
        }
    }
}
