import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        int i = scanner.nextInt();
        System.out.println(i);
        System.out.println("now we do calculator");
        System.out.println(calculator(scanner));
    }

    public static int calculator(Scanner scanner) {
        int x, y;
        String peula;
        x = scanner.nextInt();
        scanner.nextLine();
        peula = scanner.nextLine();
        y = scanner.nextInt();
        if (peula.equals("+")) {
            return x + y;
        }
        else if (peula.equals("-"))
        {
            return x-y;
        }
        return 0;
    }


    public static int Calculator(Scanner scanner) {
        int x, y;
        String peula;

        // Read first integer
        System.out.print("Enter the first number: ");
        x = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine(); // This fixes the issue of skipping the operation input

        // Read operation (e.g., +, -)
        System.out.print("Enter the operation (+, -): ");
        peula = scanner.nextLine();

        // Read second integer
        System.out.print("Enter the second number: ");
        y = scanner.nextInt();

        // Perform the operation based on the input
        if (peula.equals("+")) {
            return x + y;
        } else if (peula.equals("-")) {
            return x - y;
        } else {
            System.out.println("Error: Invalid operation.");
            return 0; // Return 0 for invalid operation
        }
    }
}