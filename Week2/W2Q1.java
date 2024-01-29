package Week2;
import java.util.*;

public class W2Q1 {

    public static double sum(double num1, double num2){
        return num1+num2;
    }
    public static double difference(double num1, double num2){
        return num1-num2;
    }
    public static double product(double num1, double num2){
        return num1*num2;
    }
    public static double quotient(double num1, double num2){
        if (num2 == 0){
            return -1;
        }
        else {
            return num1 / num2;
        }
    }
    public static double max(double num1, double num2){
        return Math.max(num1, num2);
    }

    public static double min(double num1, double num2){
        return Math.min(num1, num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for num1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter value for num2: ");
        double num2 = sc.nextDouble();

        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Difference: " + difference(num1, num2));
        System.out.println("Product: " + product(num1, num2));
        System.out.println("Quotient: " + quotient(num1, num2));
        System.out.println("Minimum: " + min(num1, num2));
        System.out.println("Maximum: " + max(num1, num2));
    }
}
