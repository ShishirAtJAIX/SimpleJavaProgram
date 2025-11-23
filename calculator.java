import java.util.Scanner;

class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int multiply() {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter second number: ");
        int y = scanner.nextInt();

        Calculator calc = new Calculator(x, y);

        System.out.println("Sum: " + calc.add());
        System.out.println("Product: " + calc.multiply());

        scanner.close();
    }
}