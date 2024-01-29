package Week4;
import java.util.Scanner;

public class W4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three digits (0-9) with space between them: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("All possible combinations are:");
        System.out.println(a + "" + b + "" + c);
        System.out.println(a + "" + c + "" + b);
        System.out.println(b + "" + a + "" + c);
        System.out.println(b + "" + c + "" + a);
        System.out.println(c + "" + a + "" + b);
        System.out.println(c + "" + b + "" + a);
        sc.close();
    }
}
