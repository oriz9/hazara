import java.util.Scanner;

public class arrayQ {
    private int arr[];
    public arrayQ(Scanner scanner)
    {
        this.arr = new int[5];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("that's all");
    }
    public int secendBest()
    {
        int biggest = this.arr[0], second = 0;
        for (int i = 1; i < this.arr.length; i++) {
            if (this.arr[i] > biggest)
            {
                second = biggest;
                biggest = this.arr[i];
            }
        }
        return second;
    }
}
