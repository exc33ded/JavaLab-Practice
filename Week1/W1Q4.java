package Week1;

import java.util.Scanner;

public class W1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double far;
        System.out.print("Enter Temperature Fahrenheit: ");
        far = sc.nextDouble();
        double cel = far - (32/1.8);

        System.out.println("\nTemperature Conversion Table");
        System.out.println("----------------------------");
        System.out.printf("| %-15s | %-15s |\n", "Fahrenheit", "Celsius");
        System.out.println("|-----------------|-----------------|");
        System.out.printf("| %-15.2f | %-15.2f |\n", far, cel);
        System.out.println("----------------------------");
    }
}
