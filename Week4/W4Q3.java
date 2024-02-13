package Week4;
import java.util.Scanner;

public class W4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 4; i++) {
            int num = sc.nextInt();
            sum += num;
            product *= num;
        }
        System.out.println("The sum of the numbers is " + sum + ".");
        System.out.println("The product of the numbers is " + product + ".");
        sc.close();
    }
}
