package Week4;
import java.util.Scanner;

public class W4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int sum = num1 + num2 + num3 + num4;
        int product = num1 * num2 * num3 * num4;
        System.out.println("The sum of the numbers is " + sum + ".");
        System.out.println("The product of the numbers is " + product + ".");
        sc.close();
    }
}
