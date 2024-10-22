import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        calc ori = new calc();
        System.out.println(ori.calcIt());

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
}