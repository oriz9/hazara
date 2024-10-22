import java.util.Scanner;

public class calc {
    private int x;
    private int y;
    private String operetor;

    public calc()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number: ");
        this.x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("operetor: + / - ");
        this.operetor = scanner.nextLine();
        System.out.println("second number: ");
        this.y = scanner.nextInt();
        scanner.nextLine();
    }

    public int getX() {
        return x;
    }
    public int calcIt()
    {
        if (this.operetor.equals("+"))
        {
            return this.y+this.x;
        }
        else return this.x-this.y;
    }
}
