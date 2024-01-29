package Week4;
import java.util.Scanner;

public class W4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to print: ");
        int m = sc.nextInt();
        int n1 = 0, n2 = 1, i = 1;
        do {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            i++;
        } while (i <= m);
        sc.close();
    }
}
